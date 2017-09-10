package dao;

import modele.Driver;
import util.DButil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pc on 02.09.2017.
 */
public class DriverDao {
    private static Connection connection;
    private CarDao carDao;

    public DriverDao(){
       this.carDao = new CarDao();
       connection = DButil.getConnection();
    }

   public void addDriver(Driver driver){
       try {
           PreparedStatement pr = connection
                   .prepareStatement("INSERT INTO userscars (firstname, lastname, tel) VALUES (?,?,?)");
           pr.setString(1,driver.getFirstName());
           pr.setString(2,driver.getLastName());
           pr.setString(3,driver.getTel());
           pr.execute();
       } catch (SQLException e) {
           e.printStackTrace();
       }
   }
   public void deleteDriver(int driverid){
       try {
           PreparedStatement pr = connection.prepareStatement("DELETE FROM userscars WHERE userid = ?");
            pr.setInt(1, driverid);
            pr.executeUpdate();
       } catch (SQLException e) {
           e.printStackTrace();
       }
   }

   public List<Driver> getAllDrivers(){
       List<Driver> driverList =new ArrayList<Driver>();
       try {
           Statement statement = connection.createStatement();
           ResultSet resultSet = statement.executeQuery("SELECT * FROM userscars");
           while (resultSet.next()){
               Driver driver = new Driver();
               driver.setDriverid(resultSet.getInt("userid"));
               driver.setFirstName(resultSet.getString("firstname"));
               driver.setLastName(resultSet.getString("lastname"));
               driver.setTel(resultSet.getString("tel"));
               driverList.add(driver);
           }
       } catch (SQLException e) {
           e.printStackTrace();
       }
       return driverList;
   }

   public void updateDriver(Driver driver){


       try {
           PreparedStatement preparedStatement = connection
                   .prepareStatement("UPDATE userscars SET firstname=?, lastname=?,tel=? WHERE userid=?");
           preparedStatement.setString(1, driver.getFirstName());
           preparedStatement.setString(2, driver.getLastName());
           preparedStatement.setString(3, driver.getTel());
           preparedStatement.setInt(4, driver.getDriverid());
           preparedStatement.executeUpdate();
       } catch (SQLException e) {
           e.printStackTrace();
       }
   }


}

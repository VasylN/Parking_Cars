package dao;

import modele.Driver;
import util.DButil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
                   .prepareStatement("INSERT INTO userscars (firstname, lastname, tel,numberparking) VALUES (?,?,?,?)");
           pr.setString(1,driver.getFirstName());
           pr.setString(2,driver.getLastName());
           pr.setString(3,driver.getTel());
           pr.setInt(4,driver.getNumberParking());
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


}

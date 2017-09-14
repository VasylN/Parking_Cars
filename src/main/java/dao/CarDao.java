package dao;

import modele.Car;
import util.DButil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pc on 02.09.2017.
 */
public class CarDao {
    private static Connection connection;
    int cacheDriverId;

    public CarDao() {
        connection = DButil.getConnection();

    }

    public List<Car> getCarsByDriverId(int driverid) {
        if (driverid != 0) {
            cacheDriverId = driverid;
        }

        List<Car> carList = new ArrayList<Car>();
        try {
            PreparedStatement pr = connection.prepareStatement("SELECT * FROM cars WHERE carid = ?");
            pr.setInt(1, cacheDriverId);
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                Car car = new Car();
                car.setCarName(rs.getString("car"));
                car.setModeleCar(rs.getString("modeleCar"));
                car.setTimeArrival(rs.getString("timeArrival"));
                car.setTimeDeparture(rs.getString("timeDeparture"));
                car.setPayment(rs.getString("payment"));
                carList.add(car);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return carList;
    }

    public void addCar(Car car) {
        try {
            PreparedStatement pr = connection
                    .prepareStatement("INSERT INTO cars (car, modelecar, timearrival, timedeparture, payment,userid )VALUES (?,?,?,?,?,?)");
            pr.setString(1, car.getCarName());
            pr.setString(2, car.getModeleCar());
            pr.setString(3, car.getTimeArrival());
            pr.setString(4, car.getTimeDeparture());
            pr.setString(5, car.getPayment());
            pr.setInt(6, cacheDriverId);
            pr.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateCar(Car car) {
        try {
            PreparedStatement pr = connection
                    .prepareStatement("UPDATE cars SET car=?,modelecar=?,timearrival=?,timedeparture=?,payment =?,carid=?");
            pr.setString(1, car.getCarName());
            pr.setString(2, car.getModeleCar());
            pr.setString(3, car.getTimeArrival());
            pr.setString(4, car.getTimeDeparture());
            pr.setString(5, car.getPayment());
            pr.setInt(6, car.getCarid());
            pr.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Car getCarId(int carid) {
        Car car = new Car();
        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM cars WHERE carid=?");
            ps.setInt(1, carid);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                car.setCarid(rs.getInt("carid"));
                car.setCarName(rs.getString("carName"));
                car.setModeleCar(rs.getString("modeleCar"));
                car.setTimeArrival(rs.getString("timeArrival"));
                car.setTimeDeparture(rs.getString("timeDeparture"));
                car.setPayment(rs.getString("payment"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return car;
    }

    public void deleteCar(int carid) {
        try {
            PreparedStatement pr = connection.prepareStatement("DELETE FROM cars WHERE carid = ?");
            pr.setInt(1, carid);
            pr.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}

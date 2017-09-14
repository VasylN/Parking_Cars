package modele;

/**
 * Created by Pc on 02.09.2017.
 */
public class Car {
    private int carid;
    private int driverid;
    private String carName;
    private String modeleCar;
    private String timeArrival;
    private String timeDeparture;
    private String payment;
    private String numberParking;

    public int getCarid() {
        return carid;
    }

    public void setCarid(int carid) {
        this.carid = carid;
    }

    public int getDriverid() {
        return driverid;
    }

    public void setDriverid(int driverid) {
        this.driverid = driverid;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getModeleCar() {
        return modeleCar;
    }

    public void setModeleCar(String modeleCar) {
        this.modeleCar = modeleCar;
    }

    public String getTimeArrival() {
        return timeArrival;
    }

    public void setTimeArrival(String timeArrival) {
        this.timeArrival = timeArrival;
    }

    public String getTimeDeparture() {
        return timeDeparture;
    }

    public void setTimeDeparture(String timeDeparture) {
        this.timeDeparture = timeDeparture;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getNumberParking() {
        return numberParking;
    }

    public void setNumberParking(String numberParking) {
        this.numberParking = numberParking;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carid=" + carid +
                ", driverid=" + driverid +
                ", carName='" + carName + '\'' +
                ", modeleCar='" + modeleCar + '\'' +
                ", timeArrival='" + timeArrival + '\'' +
                ", timeDeparture='" + timeDeparture + '\'' +
                ", payment='" + payment + '\'' +
                ", numberParking='" + numberParking + '\'' +
                '}';
    }
}

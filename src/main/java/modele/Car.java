package modele;

/**
 * Created by Pc on 02.09.2017.
 */
public class Car {
    private int carid;
    private int driverid;
    private String carName;
    private String modeleCar;
    private int timeArrival;
    private int timeDeparture;
   private int payment;

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

    public int getTimeArrival() {
        return timeArrival;
    }

    public void setTimeArrival(int timeArrival) {
        this.timeArrival = timeArrival;
    }

    public int getTimeDeparture() {
        return timeDeparture;
    }

    public void setTimeDeparture(int timeDeparture) {
        this.timeDeparture = timeDeparture;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", modeleCar='" + modeleCar + '\'' +
                ", timeArrival=" + timeArrival +
                ", timeDeparture=" + timeDeparture +
                ", payment=" + payment +
                '}';
    }
}

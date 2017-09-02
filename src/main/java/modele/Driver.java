package modele;

/**
 * Created by Pc on 02.09.2017.
 */
public class Driver {
    private int driverid;
    private String firstName;
    private String lastName;
    private String tel;
    private int numberParking;

    public int getDriverid() {
        return driverid;
    }

    public void setDriverid(int driverid) {
        this.driverid = driverid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getNumberParking() {
        return numberParking;
    }

    public void setNumberParking(int numberParking) {
        this.numberParking = numberParking;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", tel='" + tel + '\'' +
                ", numberParking=" + numberParking +
                '}';
    }
}

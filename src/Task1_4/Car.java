package Task1_4;

public class Car {
    Weel weel;
    CarBody carBody;
    Rudder rudder;

    Car(double WeelRadius, double lenth, double weigh, double RudderRadius, String RudderMaterial) {
        weel = new Weel(WeelRadius);
        carBody = new CarBody(lenth, weigh);
        rudder = new Rudder(RudderRadius, RudderMaterial);
    }

    @Override
    public String toString() {
        return "Car{" +
                "weel = " + weel.toString() +
                ", carBody=" + carBody.toString() +
                ", rudder=" + rudder.toString() +
                '}';
    }


    public static void main(String[] args) {
        Car car = new Car(16,5.1,1.2,12,"Leather");
        System.out.println(car);
    }}


public class Main {
    public static void main(String[] args) {
        Car car = new Car("Normal Car");
        runRace(car);

        Car gasCar = new GasPoweredCar("Gas Guzzler", 15.4, 6);
        runRace(gasCar);

        //you can end up using a factory pattern to instantiate new classes too using polymorphism
    }
    public static void runRace(Car car) {
        car.startEngine();
        car.drive();
    }
}
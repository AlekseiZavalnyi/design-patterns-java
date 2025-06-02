public class CarSimulator {
    private Car car;
    private CarBuilder carBuilder;

    public CarSimulator() {
        System.out.println("Its a Car Simulator");
        this.carBuilder = new CarBuilder();
        this.car = new Car();
    }

}

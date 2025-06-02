public class CarBuilder {
    public CarBuilder() {
        System.out.println("Its a CarBuilder");
    }

    public Car build(Engine engine, Wheel wheel){
        System.out.println("CarBuilder building.");
        Car car = new Car();
        car.engine = engine;
        car.wheel = wheel;
        return new Car();
    }
}

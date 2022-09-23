public class Main {

    public static void main(String[] args) {
        Engine engine = new Engine(5);
        Engine engine1 = new Engine(6);

        Bike bike = new Bike("John", 1, 9, 20);
Car car = new Car("Shelby", 1, 10, engine, 5);
Truck truck = new Truck("Bob", 1, 20, engine1, 80);
Horse horse = new Horse("Shawn", 1, 60, 20);
        RollerCoaster rollerCoaster = new RollerCoaster();



  Vehicle [] vehicles = {car, truck, bike, horse};
  RideAble [] rideAbles = {rollerCoaster, bike, horse};


        VehicleApp.printVehiclenamesandPrice(vehicles);
        VehicleApp.getSpeedofRideableObjects(rideAbles);


       truck.totalAfterTax(truck);

       car.totalBeforeTax(car);

      System.out.println(car.totalBeforeTax(car));









    }
}
public class VehicleApp {
    public static void printVehiclenamesandPrice(Vehicle[] vehicles) {
        for (int x = 0; x < vehicles.length; x++) {
            System.out.println(vehicles[x].getName() + " " + vehicles[x].getPrice());
        }
    }
    public static void getSpeedofRideableObjects(RideAble[] rideAbles){
        for (int x = 0; x < rideAbles.length; x++) {
            System.out.println(rideAbles[x].MilesperHour());
        }
    }
}

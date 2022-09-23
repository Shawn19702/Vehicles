public class Bike extends Vehicle implements RideAble{
     Bike(String name, int qty, double price, float speed) {
         super(name, qty, price, speed);

     }

    @Override
    public void totalAfterTax(Vehicle vehicle) {
        System.out.println(calcTax(vehicle) + getPrice());

    }



    @Override
    public int MilesperHour() {
        return 25;
    }

}


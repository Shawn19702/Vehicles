public class Truck extends Vehicle{
    public Truck(String name, int qty, double price, Engine engine, float speed) {
        super(name, qty, price, engine, speed);
    }


    @Override
    public void totalAfterTax(Vehicle vehicle) {
        System.out.println(calcTax(vehicle) + getPrice());

    }


    }


public class Horse extends Vehicle implements RideAble{
    public Horse(String name, int qty, double price, float speed) {
        super(name, qty, price, speed);
    }

    @Override
    public void totalAfterTax(Vehicle vehicle) {
        System.out.println(calcTax(vehicle) + getPrice());

    }

    @Override
    public int MilesperHour() {
        return 20;
    }

}


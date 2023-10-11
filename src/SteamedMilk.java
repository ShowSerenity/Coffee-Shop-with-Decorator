public class SteamedMilk extends CondimentsDecorator{
    public SteamedMilk(Coffee coffee) {
        this.coffee = coffee;
    }

    public String getDescription() {
        return coffee.getDescription() + ", Steamed milk";
    }

    public double cost() {
        return coffee.cost() + 0.6;
    }
}

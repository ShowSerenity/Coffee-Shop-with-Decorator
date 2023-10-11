public class Ice extends CondimentsDecorator{
    public Ice(Coffee coffee) {
        this.coffee = coffee;
    }

    public String getDescription() {
        return coffee.getDescription() + ", Ice";
    }

    public double cost() {
        return coffee.cost() + 0.3;
    }
}

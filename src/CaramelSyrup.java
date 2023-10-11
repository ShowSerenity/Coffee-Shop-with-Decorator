public class CaramelSyrup extends CondimentsDecorator{
    public CaramelSyrup(Coffee coffee) {
        this.coffee = coffee;
    }

    public String getDescription() {
        return coffee.getDescription() + ", Caramel syrup";
    }

    public double cost() {
        return coffee.cost() + 0.5;
    }
}

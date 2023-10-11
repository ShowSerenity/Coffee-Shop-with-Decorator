public class WhippedCream extends CondimentsDecorator{
    public WhippedCream(Coffee coffee) {
        this.coffee = coffee;
    }

    public String getDescription() {
        return coffee.getDescription() + ", Whipped cream";
    }

    public double cost() {
        return coffee.cost() + 0.4;
    }
}

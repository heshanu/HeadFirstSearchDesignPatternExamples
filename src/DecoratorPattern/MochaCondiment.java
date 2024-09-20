package DecoratorPattern;

public class MochaCondiment extends CondimentDecorator {
	Beverage beverage;

    public MochaCondiment(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        return 0.20 + beverage.cost();
    }
}

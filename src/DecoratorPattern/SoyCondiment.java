package DecoratorPattern;

public class SoyCondiment extends CondimentDecorator {
	Beverage beverage;
	
	public SoyCondiment(Beverage beverage) {
		this.beverage=beverage;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.15+beverage.cost();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+",Soy";
	}

}

package DecoratorPattern;

public class WhipCondiment extends CondimentDecorator {
	Beverage beverage;
	
	public WhipCondiment(Beverage beverage) {
		this.beverage=beverage;
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .10+beverage.cost();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+",Whip";
	}

}

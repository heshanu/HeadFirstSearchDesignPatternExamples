package DecoratorPattern;

public class Espresso implements Beverage{

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1.99;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Espresso";
	}

}

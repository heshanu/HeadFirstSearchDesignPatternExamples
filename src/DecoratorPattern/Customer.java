package DecoratorPattern;

public class Customer {

	public static void main(String[] args) {
	//create houseblend coffe
		Beverage beverage2=new HouseBlend();
		System.out.println(beverage2.getDescription()+" $"+beverage2.cost());
		//add mocha to houseBlend 
		beverage2=new MochaCondiment(beverage2);
		//add soy to houseblend
		beverage2=new SoyCondiment(beverage2);
		//add whip to houseblend
		beverage2=new WhipCondiment(beverage2);
		//finally we got houseblend coffee with mocha,soy and whip
		System.out.println(beverage2.getDescription()+" $"+beverage2.cost());
	}
	

}

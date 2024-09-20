package AbstractFactoryPattern;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory  {
	
	    public Dough createDough() {
	        return new ThickCrustDough();
	    }

	    public Sauce createSauce() {
	        return new PlumTomatoSauce();
	    }

	    public Cheese createCheese() {
	        return new MozzarellaCheese();
	    }

	    public Veggies[] createVeggies() {
	        return new Veggies[]{new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
	    }

	    public Pepperoni createPepperoni() {
	        return new SlicedPepperoni();
	    }

	    public Clams createClams() {
	        return new FrozenClam();
	    }
}

package Singleton;

	public class ChocolateBoilerClient {
	    public static void main(String[] args) {
	        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
	        ChocolateBoiler boilerOne= ChocolateBoiler.getInstance();
	        boiler.fill();
	        boiler.boil();
	        boiler.drain();

	       //  Trying to fill and boil again
	        boilerOne.fill();
	        boilerOne.boil();
	        boilerOne.drain();
	        
	    }
	
}

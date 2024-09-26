package TemplatePattern;

public class Client {
	public static void main(String[] args) {
		//create duck object
		 	MallordDuck duck = new MallordDuck();
		 	//create turkey object
	        WildTurkey turkey = new WildTurkey();
	        //create adapter 
	        Duck turkeyAdapter = new TurkeyAdapter(turkey);

	        System.out.println("The Turkey says...");
	        turkey.fly();
	        turkey.gobble();
	        
	        System.out.println("===========================");
	        //we called only duck's method we dont know other interface's methods
	      //use turkey adapter and called fly for make fly turkey
	        System.out.println("We use adapter to call Turkey's method...");
	        turkeyAdapter.fly();
	 
	        //use turkey adapter and called wellknown quack for make sound for turkey
	        turkeyAdapter.quack();
	}

}

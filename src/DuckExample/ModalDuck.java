package designPattern;

public class ModalDuck extends Duck { 
	
	public ModalDuck() {
		flyBehaviour=new FlyNoWay();
		quackBehaviour=new Quack();
	}

	@Override
	public void display() {
		System.out.println("I'm Modal Duck");		
	}

}

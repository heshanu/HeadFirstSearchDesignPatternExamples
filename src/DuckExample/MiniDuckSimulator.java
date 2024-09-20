package designPattern;

public class MiniDuckSimulator {
	public static void main(String[] args) {
		Duck mallard=new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		
		Duck modal=new ModalDuck();
		//modal.performFly();
		//modal.setFlyBehaviour(new FlyRocketPowered());
		//modal.performFly();
	
	}
}

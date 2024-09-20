package designPattern;

public abstract class Duck {
	QuackBehaviour quackBehaviour;
	FlyBehaviour flyBehaviour;
	
	public Duck() {
		super();
	}

	public abstract void display();

	void performFly() {
		flyBehaviour.fly();
	}
	
	void performQuack() {
		quackBehaviour.quack();
	}
	
	void swim() {
		System.out.println("All ducks float,even decoys");
	}
	
	void setFlyBehaviour(FlyBehaviour fb) {
		flyBehaviour=fb;
	}
	
	void setQuackBehaviour(QuackBehaviour qb) {
		quackBehaviour=qb;
	}
}

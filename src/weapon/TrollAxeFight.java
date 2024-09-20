package designPattern.weapon;

public class TrollAxeFight extends Troll{

	public TrollAxeFight() {
		weaponeBehaviour=new AxeBehaviour();
	}

	@Override
	void fight() {
		System.out.println("this is troll fight with Axe");
		
	}

}

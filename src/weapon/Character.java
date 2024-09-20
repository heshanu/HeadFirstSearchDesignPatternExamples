package designPattern.weapon;

public abstract class Character {
	
	WeaponeBehaviour  weaponeBehaviour;
	
	void performFight() {
		weaponeBehaviour.useWeapone();
	}

	abstract void fight();
	String description() {
		return "1";
	}
	
}

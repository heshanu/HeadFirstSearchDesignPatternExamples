package designPattern.weapon;

public class KingWeaponsSkills extends Character {

	public KingWeaponsSkills() {
		weaponeBehaviour=new SwordBehaviour();
		weaponeBehaviour=new AxeBehaviour();
		weaponeBehaviour=new BowAndArrowBehaviour();
		weaponeBehaviour=new KnifeBehaviour();
	}

	@Override
	void fight() {
		System.out.println("king is fighting");
		
	}
	
	

}

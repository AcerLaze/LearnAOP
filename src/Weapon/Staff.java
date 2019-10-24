package Weapon;

import Character.Character;
import Skills.Skills;

public class Staff extends Weapon implements Skills{

	Staff(String weaponName, int baseDamage, int speed) {
		super(weaponName, baseDamage, speed);
		// TODO Auto-generated constructor stub
		this.setRange(30);
	}
	
	@Override
	public void specialSkill(Character player, Character target, String type) {
		// TODO Auto-generated method stub
		int damage = (int)((this.getBaseDamage() + player.getIntelligence()) * player.atkMod(target));
		
		target.receivedDmg(damage);
		
	}

}

package Weapon;

import Character.Character;
import Skills.Skills;

public class Grimore extends Weapon implements Skills{
	
	Grimore(String weaponName, int baseDamage, int speed) {
		super(weaponName, baseDamage, speed);
		// TODO Auto-generated constructor stub
		
		this.setType("Grimore");
		this.setRange(20);
		
	}

	@Override
	public void specialSkill(Character player, Character target, String type) {
		// TODO Auto-generated method stub
		int damage = (int)((this.getBaseDamage() + player.getIntelligence()) * player.atkMod(target));
		
		target.receivedDmg(damage);
		
	}

}

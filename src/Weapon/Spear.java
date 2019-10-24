package Weapon;

import Character.Character;
import Skills.Skills;

public class Spear extends Weapon implements Skills{
	
	Spear(String weaponName, int baseDamage, int speed) {
		super(weaponName, baseDamage, speed);
		// TODO Auto-generated constructor stub
		this.setType("Spear");
		this.setRange(10);
	}

	@Override
	public void specialSkill(Character player, Character target, String type) {
		// TODO Auto-generated method stub
		int damage = (int)((this.getBaseDamage() + player.getStrength()) * player.atkMod(target));
		
		target.receivedDmg(damage);
		
	}

}

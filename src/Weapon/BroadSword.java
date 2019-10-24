package Weapon;

import Character.Character;
import Skills.Skills;

public class BroadSword extends Weapon implements Skills{

	BroadSword(String weaponName, int baseDamage, int speed) {
		super(weaponName, baseDamage, speed);
		// TODO Auto-generated constructor stub
		this.setType("Broad Sword");
		this.setRange(5);
		
	}
	
	@Override
	public void specialSkill(Character player, Character target, String type) {
		// TODO Auto-generated method stub
		int damage = (int)((this.getBaseDamage() + player.getStrength()) * player.atkMod(target));
		target.receivedDmg(damage);
		
	}

}

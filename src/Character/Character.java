package Character;

import Skills.Skills;
import Weapon.Weapon;

public abstract class Character implements Skills{

	private String name;
	private int strength;
	private int intelligence;
	private int hp;
	private int defense;
	private int speed;
	private String type;
	private Weapon weap;
	
	public Character(){};
	
	public Character(String name, int strength, int intelligence, int hp, int defense){
		this.name = name;
		this.strength = strength;
		this.intelligence = intelligence;
		this.hp = hp;
		this.defense = defense;
		
		weap = null;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}
	
	public void receivedDmg(int dmg){
		
		hp -= dmg;
		
	}
	
	public int getSpeed() {
		
		if(weap != null) return speed + weap.getSpeed();
		return speed;
		
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public Weapon getWeap() {
		return weap;
	}

	public void setWeap(Weapon weap) {
		this.weap = weap;
	}

	public abstract float atkMod(Character enemy);
	
	@Override
	public void specialSkill(Character player, Character target, String type) {
		// TODO Auto-generated method stub
		if(type == "Heal") target.setHp(player.getIntelligence() + target.getHp());
		else if(type == "Physical Attack") target.receivedDmg((int)(player.getStrength() * player.atkMod(target)));
		else if(type == "Magical Attack") target.receivedDmg((int)(player.getIntelligence() * player.atkMod(target)));
		else if(type == "Support") target.setDefense(player.getIntelligence() + target.getDefense());
		
	}

}

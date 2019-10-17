package test;

public abstract class Character {

	private String name;
	private double strength;
	private double intelligence;
	private double hp;
	private double defense;
	private String type;
	
	public Character(){}
	
	public Character(String name, double strength, double intelligence, double hp, double defense){
		this.name = name;
		this.strength = strength;
		this.intelligence = intelligence;
		this.hp = hp;
		this.defense = defense;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public double getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public double getHp() {
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
	
	
	
	public double getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public double attack(Character enemy){
		
		if(strength > intelligence) return (strength - enemy.getDefense());
		else if(intelligence > strength) return (intelligence);
		else return (((strength - enemy.getDefense())*intelligence)/2);
		
	}
	
	public void receivedDmg(double dmg){
		
		hp -= dmg;
		
	}

	public abstract double atkModifier(Character enemy);

}

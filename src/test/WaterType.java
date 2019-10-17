package test;

public class WaterType extends Character {

	public WaterType(){
		
		this.setType("Water");
		
	}
	
	public WaterType(String name, double strength, double intelligence, double hp, double defense){
		
		super(name, strength, intelligence, hp, defense);
		this.setType("Water");
		
	}
	
	public double atkModifier(Character enemy){
		
		if(enemy.getType() == "Thunder") return 0.5;
		else if (enemy.getType() == "Fire") return 2;
		else if (enemy.getType() == "Water") return 0;
		else return 1;
		
	}
	
}

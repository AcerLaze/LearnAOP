package test;

public class PrimordialType extends Character{

	public PrimordialType(){
		
		this.setType("Primordial");
		
	}
	
	public PrimordialType(String name, double strength, double intelligence, double hp, double defense){
		
		super(name, strength, intelligence, hp, defense);
		this.setType("Primordial");
		
	}
	
	public double atkModifier(Character enemy){
		
		if(enemy.getType() == "Primordial") return 0.5;
		else return 1.5;

		
	}
	
}

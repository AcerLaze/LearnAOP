package test;

public class EarthType extends Character{
	
	public EarthType(){
		
		this.setType("Earth");
		
	}
	
	public EarthType(String name, double strength, double intelligence, double hp, double defense){
		
		super(name, strength, intelligence, hp, defense);
		this.setType("Earth");
		
	}
	
	public double atkModifier(Character enemy){
		
		if(enemy.getType() == "Fire") return 0.5;
		else if (enemy.getType() == "Thunder") return 2;
		else if (enemy.getType() == "Earth") return 0;
		else return 1;
		
	}

}

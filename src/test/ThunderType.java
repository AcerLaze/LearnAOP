package test;

public class ThunderType extends Character{
	
	public ThunderType(){
		
		this.setType("Thunder");
		
	}
	
	public ThunderType(String name, double strength, double intelligence, double hp, double defense){
		
		super(name, strength, intelligence, hp, defense);
		this.setType("Thunder");
		
	}
	
	public double atkModifier(Character enemy){
		
		if(enemy.getType() == "Earth") return 0.5;
		else if (enemy.getType() == "Water") return 2;
		else if (enemy.getType() == "Thunder") return 0;
		else return 1;
		
	}

}

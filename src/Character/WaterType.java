package Character;

public class WaterType extends Character {

	public WaterType(){
		
		this.setType("Water");
		
	}
	
	public WaterType(String name, int strength, int intelligence, int hp, int defense){
		
		super(name, strength, intelligence, hp, defense);
		this.setType("Water");
		
	}
	
	public float atkMod(Character enemy){
		
		if(enemy.getType() == "Thunder") return(float) 0.5;
		else if (enemy.getType() == "Fire") return 2;
		else if (enemy.getType() == "Water") return 0;
		else return 1;
		
	}
	
}

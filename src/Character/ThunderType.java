package Character;

public class ThunderType extends Character{
	
	public ThunderType(){
		
		this.setType("Thunder");
		
	}
	
	public ThunderType(String name, int strength, int intelligence, int hp, int defense){
		
		super(name, strength, intelligence, hp, defense);
		this.setType("Thunder");
		
	}
	
	public float atkMod(Character enemy){
		
		if(enemy.getType() == "Earth") return (float)0.5;
		else if (enemy.getType() == "Water") return 2;
		else if (enemy.getType() == "Thunder") return 0;
		else return 1;
		
	}

}

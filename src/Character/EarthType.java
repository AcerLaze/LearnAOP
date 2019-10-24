package Character;

public class EarthType extends Character{
	
	public EarthType(){
		
		this.setType("Earth");
		
	}
	
	public EarthType(String name, int strength, int intelligence, int hp, int defense){
		
		super(name, strength, intelligence, hp, defense);
		this.setType("Earth");
		
	}
	
	public float atkMod(Character enemy){
		
		if(enemy.getType() == "Fire") return (float) 0.5;
		else if (enemy.getType() == "Thunder") return 2;
		else if (enemy.getType() == "Earth") return 0;
		else return 1;
		
	}

}

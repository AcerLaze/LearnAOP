package Character;

public class FireType extends Character{
	
	public FireType(){
		
		this.setType("Fire");
		
	}
	
	public FireType(String name, int strength, int intelligence, int hp, int defense){
		
		super(name, strength, intelligence, hp, defense);
		this.setType("Fire");
		
	}
	
	public float atkMod(Character enemy){
		
		if(enemy.getType() == "Water") return (float)0.5;
		else if (enemy.getType() == "Earth") return 2;
		else if (enemy.getType() == "Fire") return 0;
		else return 1;
		
	}
	
}

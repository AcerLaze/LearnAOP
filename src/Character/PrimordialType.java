package Character;

public class PrimordialType extends Character{

	public PrimordialType(){
		
		this.setType("Primordial");
		
	}
	
	public PrimordialType(String name, int strength, int intelligence, int hp, int defense){
		
		super(name, strength, intelligence, hp, defense);
		this.setType("Primordial");
		
	}
	
	public float atkMod(Character enemy){
		
		if(enemy.getType() == "Primordial") return (float)0.5;
		else return (float)1.5;

		
	}
	
}

package test;

public class FireType extends Character{
	
	public FireType(){
		
		super("Mokou");
		this.setType("Fire");
		
	}
	
	public double atkModifier(Character enemy){
		
		if(enemy.getType() == "Water") return 0.5;
		else if (enemy.getType() == "Earth") return 2;
		else if (enemy.getType() == "Fire") return 0;
		else return 1;
		
	}
	
}

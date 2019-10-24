package Weapon;

public class Weapon {

	private int baseDamage;
	private String weaponName;
	private int range;
	private int speed;
	private String type;
	
	Weapon(String weaponName, int baseDamage, int speed){
		
		this.weaponName = weaponName;
		this.baseDamage = baseDamage;
		this.speed = speed;
		
	}
	
	public int getBaseDamage() {
		return baseDamage;
	}
	public void setBaseDamage(int baseDamage) {
		this.baseDamage = baseDamage;
	}
	public String getWeaponName() {
		return weaponName;
	}
	public void setWeaponName(String weaponName) {
		this.weaponName = weaponName;
	}
	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}



	
}

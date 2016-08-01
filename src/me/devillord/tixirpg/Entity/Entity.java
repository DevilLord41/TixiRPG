package me.devillord.tixirpg.Entity;

public class Entity {

	private String EntityName;
	private int Health;
	private int Level;
	private int Defense;
	private int CriticalRate;
	private int CriticalDamage;
	private int Evasion;
	private int Damage;
	
	public Entity(String EntityName,int Level ,int Health, int Damage, int Defense, int CriticalRate, int CriticalDamage, int Evasion) {
		this.EntityName = EntityName;
		this.Health = Health;
		this.Defense = Defense;
		this.CriticalRate = CriticalRate;
		this.CriticalDamage = CriticalDamage;
		this.Evasion = Evasion;
		this.Damage = Damage;
		this.Level = Level;
	}
	
	public void setHealth(int Health) {
		this.Health = Health;
	}
	
	public int getLevel() {
		return Level;
	}
	
	public int getDmg() {
		return Damage;
	}
	
	public int getEvasion () {
		return Evasion;
	}
	
	public int getCritDmg() {
		return CriticalDamage;
	}
	
	public int getCritRate() {
		return CriticalRate;
	}
	
	public int getDefense() {
		return Defense;
	}
	
	public int getHealth() {
		return Health;
	}
	
	public String getEntityName() {
		return EntityName;
	}
}

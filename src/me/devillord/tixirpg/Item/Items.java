package me.devillord.tixirpg.Item;

public class Items {
	
	private int CriticalRate;
	private int Damage;
	private int Durability;
	private int Evasion;
	private int Luck;
	private int CriticalDamage;
	private int Defense;
	
	
	private String ItemName;
	private String Category;
	public Items(String ItemName, int Durability, int Damage, int Luck, int CriticalRate, int Evasion, int CriticalDamage, int Defense,String Category) {
		this.ItemName = ItemName;
		this.CriticalRate = CriticalRate;
		this.Damage = Damage;
		this.Durability = Durability; 
		this.Luck = Luck;
		this.Evasion = Evasion;
		this.CriticalDamage = CriticalDamage;
		this.Defense = Defense;
		this.Category = Category;
	}
	
	public String getItemName() {
		return ItemName;
	}
	
	public void setItemName(String ItemName) {
		this.ItemName = ItemName;
	}
	
	public int getCriticalRate() {
		return CriticalRate;
	}
	
	public void setCriticalRate(int CriticalRate) {
		this.CriticalRate = CriticalRate;
	}
	
	public int getDamage() {
		return Damage;
	}
	
	public void setDamage(int Damage) {
		this.Damage = Damage;
	}
	
	public int getCritDmg() {
		return CriticalDamage;
	}
	
	public void setCritDmg(int CriticalDamage) {
		this.CriticalDamage = CriticalDamage;
	}
	
	public int getDurability() {
		return Durability;
	}
	
	public void setDurability(int Durability) {
		this.Durability = Durability;
	}
	
	public int getEvasion() {
		return Evasion;
	}
	
	public void setEvasion(int Evasion) {
		this.Evasion = Evasion;
	}
	
	public int getLuck() {
		return Luck;
	}
	
	public void setLuck(int Luck) {
		this.Luck = Luck;
	}
	
	public String getCategory() {
		return Category;
	}
	
	public void setCategory(String Category) {
		this.Category = Category;
	}
	
	public int getDefense() {
		return Defense;
	}
	
	public void setDefense(int Defense) {
		this.Defense = Defense;
	}
	
	public static String[] itemName = {
		"WOODEN SWORD",
		"STONE SWORD",
		"IRON SWORD",
		"DIAMOND SWORD",
		"VILLAINOUS SHURIKEN",
		"VENOM SWORD",
		"GREAT POSEIDON TRIDENT",
		"AERO SWORD"
	};
}

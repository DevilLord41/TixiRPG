package me.devillord.tixirpg.Entity;

public class Player {
	
	private String Nickname;
	private int Experience;
	private int Health;
	private int Luck;
	private int Evasion;
	private int Survive;
	private int CriticalRate;
	private int CriticalDamage;
	private int Damage;
	private int Level;
	private int Luckness;
	private int Strength;
	private int Vitality;
	private int Dexterity;
	private int AvailableStatsPoint;
	private int Defense;
	private int INVENTORY_SLOT;
	private int Gold;
	
	public Player(String Nickname,int Experience,int Health,int Defense,int Luck,int Evasion,int Survive,int CriticalRate,int CriticalDamage,int Damage,int Level,int Luckness,int Strength,int Vitality,int Dexterity,int AvailableStatsPoint) {
		this.Nickname = Nickname;
		this.Experience = Experience;
		this.Health = Health;
		this.Luck = Luck;
		this.Evasion = Evasion;
		this.Survive = Survive;
		this.CriticalRate = CriticalRate;
		this.CriticalDamage = CriticalDamage;
		this.Damage = Damage;
		this.Level = Level;
		this.Luckness = Luckness;
		this.Strength = Strength;
		this.Vitality = Vitality;
		this.Dexterity = Dexterity;
		this.AvailableStatsPoint = AvailableStatsPoint;
		this.Defense = Defense;
		this.Gold = 0;
		this.INVENTORY_SLOT = 0;
	}
	
	public void setInvSlotCount(int INVENTORY_SLOT) {
		this.INVENTORY_SLOT = INVENTORY_SLOT;
	}
	
	public int getInvSlotCount() {
		return INVENTORY_SLOT;
	}
	
	public void setGold(int Gold) {
		this.Gold = Gold;
	}
	
	public int getGold() {
		return Gold;
	}
	
	public void setDef(int Defense) {
		this.Defense = Defense;
	}
	
	public int getDef() {
		return Defense;
	}
	
	public void setVit(int Vitality) {
		this.Vitality = Vitality;
	}
	
	public int getVit() {
		return Vitality;
	}
	
	public void setPoint(int AvailableStatsPoint) {
		this.AvailableStatsPoint = AvailableStatsPoint;
	}
	
	public int getPoint() {
		return AvailableStatsPoint;
	}
	
	public void setDex(int Dexterity) {
		this.Dexterity = Dexterity;
	}
	
	public int getDex() {
		return Dexterity;
	}
	
	public void setStr(int Strength) {
		this.Strength = Strength;
	}
	
	public int getStr() {
		return Strength;
	}
	
	public void setLuckness(int Luckness) {
		this.Luckness = Luckness;
	}
	
	public int getLuckness() {
		return Luckness;
	}
	
	public void setLevel(int Level) {
		this.Level = Level;
	}
	
	public int getLevel() {
		return Level;
	}
	
	public void setCritDmg(int CriticalDamage) {
		this.CriticalDamage = CriticalDamage;
	}
	
	public int getCritDmg() {
		return CriticalDamage;
	}
	
	public void setDmg(int Damage) {
		this.Damage = Damage;
	}
	
	public int getDmg() {
		return Damage;
	}
	
	public void setCritRate(int CriticalRate) {
		this.CriticalRate = CriticalRate;
	}	
	
	public int getCritRate() {
		return CriticalRate;
	}
	
	public void setSurvive(int Survive) {
		this.Survive = Survive;
	}
	
	public int getSurvive() {
		return Survive;
	}
	
	public void setEvasion(int Evasion) {
		this.Evasion = Evasion;
	}
	
	public int getEvasion() {
		return Evasion;
	}
	
	public void setLuck(int Luck) {
		this.Luck = Luck;
	}
	
	public int getLuck() {
		return Luck;
	}
	
	public void setHealth(int Health) {
		this.Health = Health;
	}
	
	public int getHealth() {
		return Health;
	}
	
	public void setExp(int Experience) {
		this.Experience = Experience;
	}
	
	public int getExp() {
		return Experience;
	}
	
	public String getPlayerName() {
		return Nickname;
	}
	
}

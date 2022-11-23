package entities;

public class Combat {

	private String name;
	private int life;
	private int attack;
	private int armor;

	public Combat(String name, int life, int attack, int armor) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public void champion(String name, int life, int damage, int armor) {

	}

	public void takeDamage(Combat combat) {
		if (armor == 0) {
			armor = 1;
		}

		if (attack > combat.getArmor()) {
			life -= combat.getAttack() - armor;
			combat.life -= attack - combat.getArmor();
		} else {
			attack = 1;
			life -= combat.getAttack() - armor;
			combat.life = combat.getLife() - attack;
		}
		
		if (life <= 0) {
			life = 0;
		}
	}

	@Override
	public String toString() {
		if (life <= 0) {
			return name 
					+ ": " 
					+ life 
					+ " de vida (morreu)";
		} else {
			return name 
					+ ": " 
					+ life 
					+ " de vida";

		}
	}

}
package momix;

public class Health {

	private Integer health;
	private int maxHealth;
	
	
	public Health(int health) {
		this.health = health;
		this.maxHealth = health;
	}


	public void lose(Health healthLosed) {
		this.health -= healthLosed.health;
	}

	public void gain(Health healthGained) {
		this.health += healthGained.health;
		if (health > maxHealth) {
			health = maxHealth;
		}
		
	}

	@Override
	public boolean equals(Object obj) {
		
		if (!(obj instanceof Health)) return false;
		
		Health otherHealth = (Health) obj;
		
		return health == otherHealth.health;
	}
	
}

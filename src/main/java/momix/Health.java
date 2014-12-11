package momix;

public class Health {

	private Integer health;
	
	public Health(int health) {
		this.health = health;
	}

	@Override
	public boolean equals(Object obj) {
		
		if (!(obj instanceof Health)) return false;
		
		Health otherHealth = (Health) obj;
		
		return health == otherHealth.health;
	}

	public void lose(Health healthLosed) {
		this.health -= healthLosed.health;
	}

	public void gain(Health healthGained) {
		this.health += healthGained.health;
	}
	
}

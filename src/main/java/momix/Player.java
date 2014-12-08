package momix;


public class Player {

	private String name;
	private Integer experience;
	private Integer health;
	final int INITIAL_HEALTH_POINTS = 10;

	public Player(String name) {
		this.name = name;
		this.experience = 0;
		health = INITIAL_HEALTH_POINTS;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Player)) return false;
		
		Player otherPlayer = (Player) obj;
		return name.equals(otherPlayer.name);
	}

	public Integer experience() {
		return experience;
	}

	public Integer health() {
		return health;
	}

	public void gainExperience(int experience) {
		this.experience += experience;
	}

}

package momix;


public class Player {

	private String name;
	private Experience experience;
	private Health health;
	final Health INITIAL_HEALTH_POINTS = new Health(10);

	public Player(String name) {
		this.name = name;
		this.experience = new Experience();
		health = INITIAL_HEALTH_POINTS;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Player)) return false;
		
		Player otherPlayer = (Player) obj;
		return name.equals(otherPlayer.name);
	}

	public Experience experience() {
		return experience;
	}

	public Health health() {
		return health;
	}

	public void gainExperience(Experience experience) {
		this.experience.gain(experience);
	}

}

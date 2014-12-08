package momix;

public class Player {

	private String name;

	public Player(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Player)) return false;
		
		Player otherPlayer = (Player) obj;
		return name.equals(otherPlayer.name);
	}

}

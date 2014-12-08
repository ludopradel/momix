package momix;

public class Game {

	private Player player;

	public void addPlayer() {
		this.player = new Player("");
	}

	public Player player() {
		return player;
	}

	public void addPlayer(String name) {
		player = new Player(name);
	}
	
	

}

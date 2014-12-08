package momix;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class GameShould {

	@Test public void 
	haveAPlayer() {
		Game momix = new Game();
		momix.addPlayer();
		assertThat(momix.player()).isNotNull();
	}
	
	
	@Test public void
	haveAPlayerWithChoosenName() {
		Game momix = new Game();
		momix.addPlayer(GAMER_NAME);
		
		Player gamer = new Player("Gamer");
		
		assertThat(momix.player()).isEqualTo(gamer);
	}
	
	private final String GAMER_NAME = "Gamer";

}

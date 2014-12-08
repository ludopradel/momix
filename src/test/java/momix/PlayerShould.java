package momix;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class PlayerShould {

	private static final String LUDO = "LUDO";
	private static final Player A_PLAYER_NAMED_LUDO = new Player(LUDO);
	private static final int NO_EXPERIENCE = 0;
	private static final int FULL_HEALTH_BAR = 10;

	@Test public void
	haveAName() {
		Player player = new Player(LUDO);
		assertThat(player).isEqualTo(A_PLAYER_NAMED_LUDO);
	}
	
	@Test public void
	haveAnEmptyExperienceBar() {
		Player player = new Player(LUDO);
		assertThat(player.experience()).isEqualTo(NO_EXPERIENCE);
	}

	@Test public void
	haveAFullHealthBar() {
		Player player = new Player(LUDO);
		assertThat(player.health()).isEqualTo(FULL_HEALTH_BAR);
	}
	
	
	@Test public void 
	gainExperience() {
		Player player = new Player(LUDO);
		player.gainExperience(10);
		
		assertThat(player.experience()).isEqualTo(10);
	}
}

package momix;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class PlayerShould {

	private static final String LUDO = "LUDO";
	private static final Player A_PLAYER_NAMED_LUDO = new Player(LUDO);
	private static final Experience NO_EXPERIENCE = new Experience();
	private static final Health FULL_HEALTH_BAR = new Health(10);
	private static final Object HEALTH_MINUS_5 = new Health(5);
	private Experience TEN_EXPERIENCE = new Experience(10);

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
		player.gainExperience(new Experience(10));
		
		assertThat(player.experience()).isEqualTo(TEN_EXPERIENCE );
	}
	
	@Test public void
	looseHealth() {
		Player player = new Player(LUDO);
		player.loseHealth(new Health(5));
		assertThat(player.health()).isEqualTo(HEALTH_MINUS_5);
		
	}
}

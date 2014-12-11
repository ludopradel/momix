package momix;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class PlayerShould {

	private static final String LUDO = "LUDO";
	private static final Player A_PLAYER_NAMED_LUDO = new Player(LUDO);
	private static final Experience NO_EXPERIENCE = new Experience();
	private static final Health FULL_HEALTH_BAR = new Health(10);
	private static final Object HEALTH_MINUS_5 = new Health(5);
	private Experience TEN_EXPERIENCE = new Experience(10);

	private Player player;
	
	@Before
	public void setup() {
		player = new Player(LUDO);
	}
	
	
	@Test public void
	haveAName() {
		assertThat(player).isEqualTo(A_PLAYER_NAMED_LUDO);
	}
	
	@Test public void
	haveAnEmptyExperienceBar() {
		assertThat(player.experience()).isEqualTo(NO_EXPERIENCE);
	}

	@Test public void
	haveAFullHealthBar() {
		assertThat(player.health()).isEqualTo(FULL_HEALTH_BAR);
	}
	
	@Test public void 
	gainExperience() {
		player.gainExperience(new Experience(10));
		
		assertThat(player.experience()).isEqualTo(TEN_EXPERIENCE );
	}
	
	@Test public void
	looseHealth() {
		player.loseHealth(new Health(5));
		assertThat(player.health()).isEqualTo(HEALTH_MINUS_5);
		
	}
	
	@Test public void
	gainHealth() {
		player.loseHealth(new Health(5));
		player.gainHealth(new Health(3));
		
		assertThat(player.health()).isEqualTo(new Health(8));
	}
}

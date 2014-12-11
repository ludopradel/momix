package momix;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class HealthShould {

	@Test public void 
	gainNoMoreThanMaxHealthPoint() {
		Health health = new Health(10);
		health.gain(new Health(3));
		assertThat(health).isEqualTo(new Health(10));
	}

}

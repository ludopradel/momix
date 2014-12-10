package momix;

public class Experience {

	private Integer experience;

	public Experience() {
		experience = 0;
	}
	
	public Experience(int value) {
		experience = value;
	}

	public void gain(Experience value) {
		experience += value.experience;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Experience)) return false;
		Experience otherExperience = (Experience) obj;
		
		return experience == otherExperience.experience;
	}
}

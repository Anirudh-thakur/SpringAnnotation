package coachProject;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private FortuneService fs;
	@Value("${name}")
	private String myName;
	
	@Value("${email}")
	private String myEmail;
	
	public String getMyName() {
		return myName;
	}


	public String getMyEmail() {
		return myEmail;
	}



	public SwimCoach(FortuneService fs) {
		super();
		this.fs = fs;
	}
	

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Swim for 30 mins";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fs.getDailyFortune();
	}

}

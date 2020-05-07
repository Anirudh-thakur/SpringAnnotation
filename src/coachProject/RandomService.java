package coachProject;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component	
public class RandomService implements FortuneService {

	@Override
	public String getDailyFortune() {
         // give random fortunes
		String[] fortunes= {"Beware of dogs",
				"Lucky in cards,not lucky in love",
				"Today is your lucky day"};
		
		Random rand = new Random();
		int index = rand.nextInt(3);
		return fortunes[index];
	}

}

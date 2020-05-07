package coachProject;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("TennisCoach")
//@Scope("prototype")
public class TennisCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public TennisCoach()
	{
		System.out.println("Inside constructor!");
	}
	/*
	//annotation for dependency injection 
    @Autowired
	public TennisCoach(HappyFortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}
    */
	
	

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice your back hand volley";
	}

    @Autowired
    @Qualifier("FFRService")
	public void setFortuneService(FortuneService fortuneService) {
    	System.out.println("Inside Setter!");
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortune();
	}
	
	//creating init and destroy methods 
	@PostConstruct()
	public static void doStuffonInitialisation()
	{
		System.out.println("Inside init method");
	}
    
	@PreDestroy()
	public static void doStuffBeforeDestroy()
	{
		System.out.println("Inside destroy method");
	}

}

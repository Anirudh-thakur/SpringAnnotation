package coachProject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {
	
	public static void main(String arg[])throws Exception
	{
		//Create spring container
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		//call bean 
		Coach myCoach = context.getBean("TennisCoach",Coach.class);
		
		// call function using bean
		System.out.println(myCoach.getDailyWorkout());
		
		
		//Dependency injection
		System.out.println(myCoach.getDailyFortune());
		
		//clossing context in variable
		context.close();
		
	}

}

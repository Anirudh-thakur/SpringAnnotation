package coachProject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimBeanScopeDemoApp {
	
	public static void main(String arg[])throws Exception
	{
		//Create spring container
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		//call bean 
		Coach myCoach = context.getBean("swimCoach",SwimCoach.class);
		
		// call function using bean
		System.out.println(myCoach.getDailyWorkout());
		
		
		//Dependency injection
		System.out.println(myCoach.getDailyFortune());
		
		//Showing Injected Values
		System.out.println(((SwimCoach) myCoach).getMyEmail());
		System.out.println(((SwimCoach) myCoach).getMyName());
		//clossing context in variable
		context.close();
		
	}

}

package coachProject;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] arg)
	{
		// load Spring config file 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationInterface.xml");
		
		
	    // retrieving bean from context file
		Coach theCoach = context.getBean("TennisCoach",Coach.class);
		Coach AlphaCoach = context.getBean("TennisCoach",Coach.class);
		boolean result = theCoach == AlphaCoach;
		System.out.println("Point to the same object :"+result);
		System.out.println("The coach memory location:"+theCoach);
		System.out.println("Alpha coach memory location"+AlphaCoach);
		
		//clossing class path xml
		context.close();
	}
}

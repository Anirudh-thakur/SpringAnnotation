package coachProject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("coachProject")
@PropertySource("classpath:sports.properties")
public class SportConfig {

	//Define a method to exposeAnnotationBeanScopeDemoApp.java the bean 
	@Bean
	public FortuneService sadFortuneService()
	{
		return new SadFortuneService();
	}
	
	//Define bean for our swim service And inject dependency
	@Bean
	public Coach swimCoach()
	{
		return new SwimCoach(sadFortuneService());
	}
}

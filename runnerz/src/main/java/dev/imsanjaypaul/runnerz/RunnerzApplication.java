package dev.imsanjaypaul.runnerz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RunnerzApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(RunnerzApplication.class, args);
		FirstEntry firstEntry = (FirstEntry) context.getBean("firstEntry");
		System.out.println(firstEntry.getWelcomeMessage());
	}
}

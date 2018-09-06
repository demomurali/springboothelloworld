package com.springdemo.springComplete;

import java.util.Arrays;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringCompleteApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCompleteApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandRunner(ApplicationContext ctx){
		return (args) -> {
				Arrays.stream(ctx.getBeanDefinitionNames())
					.sorted()
					.forEach(beanName->System.out.println(beanName));
			};

		}
}

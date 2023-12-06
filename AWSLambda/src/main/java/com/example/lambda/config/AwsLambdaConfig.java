package com.example.lambda.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.function.Supplier;
import java.util.function.Function;

@Configuration
public class AwsLambdaConfig {
	@Bean
	public Supplier<String> greeting(){
		return () -> "Hello World";
	}
	
	@Bean 
	public Function<String, String> toCapitalize(){
		return (param) -> {
			String name = param.toUpperCase();
			return name;
		};
	}
}

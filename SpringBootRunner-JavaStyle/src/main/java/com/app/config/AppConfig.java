package com.app.config;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
@Bean
public CommandLineRunner clr()
{
	CommandLineRunner cl=(args)->
	{
		System.out.println("hello java style");
		System.out.println(Arrays.asList(args));
		System.out.println("hello how r u");
	};
	return cl;
}
}

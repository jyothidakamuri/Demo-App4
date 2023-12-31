package com.example.GITDemo4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(exclude =  {DataSourceAutoConfiguration.class })
public class GitDemo4Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext run = SpringApplication.run(GitDemo4Application.class, args);
			//Changes for HIS-134
		run.close();
	}

}

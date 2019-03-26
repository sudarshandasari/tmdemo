package com.cox.tmproject.tmdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class TmdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TmdemoApplication.class, args);
		
		System.out.println("hello this is sudarshan");
	}
		@Bean
		   public RestTemplate getRestTemplate() {
		      return new RestTemplate();
		   }
	

}
/*//
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DemoApplication {
   public static void main(String[] args) {
      SpringApplication.run(DemoApplication.class, args);
   }
   @Bean
   public RestTemplate getRestTemplate() {
      return new RestTemplate();
   }
}*/
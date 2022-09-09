package com.amigoscode.testing;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestingApplicationTest {
	
	/*
	*	When you build a Spring boot application using Spring Initializer. It auto creates a test class for you with contextLoads empty method.
	*
	* 	Note the use of @SpringBootTest annotation which tells Spring Boot to look for a main configuration class
	*   (one with @SpringBootApplication, for instance) and use that to start a Spring application context.
	*
	* 	Empty contextLoads() is a test to verify if the application is able to load Spring context successfully or not.
	*/

	@Test
	void contextLoads() {
	}

}

package com.example.hibernatetutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;

@SpringBootApplication
public class HibernateTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateTutorialApplication.class, args);
	}

}

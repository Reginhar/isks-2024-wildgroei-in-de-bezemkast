package com.infosupport.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class WildgroeiInDeBezemkastApplication {

	public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(WildgroeiInDeBezemkastApplication.class, args);
        JdbcTemplate template = context.getBean(JdbcTemplate.class);

		String query = "SELECT COUNT(*) FROM Person.Person";
		var result = template.queryForObject(query,  Integer.class);

		System.out.println("Test" + result);
	}

}

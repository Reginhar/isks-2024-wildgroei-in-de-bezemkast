package com.infosupport.demo;

import com.infosupport.demo.entities.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
@EntityScan("com.infosupport.demo.entities")
public class WildgroeiInDeBezemkastApplication {

	public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(WildgroeiInDeBezemkastApplication.class, args);
        JdbcTemplate template = context.getBean(JdbcTemplate.class);

		String query = "SELECT TOP 1 * FROM [Person].[Person] WHERE BusinessEntityID = 1";
		var result = template.queryForObject(query, new BeanPropertyRowMapper<>(Person.class));

		System.out.println("Firstname: " + result.getFirstName());
	}

}

package br.com.wgs.crudsbm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class CrudsbmApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudsbmApplication.class, args);
	}

}

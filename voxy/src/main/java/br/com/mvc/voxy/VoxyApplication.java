package br.com.mvc.voxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//Remove the exclude option if you want to test the spring data entity persistence
//Also you have to configure a mariaDB on your pc using the applicantion.properties
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class VoxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(VoxyApplication.class, args);
	}

}

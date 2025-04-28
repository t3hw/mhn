package dev.t3hw.mhn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class MhnApplication {

	public static void main(String[] args) {
		SpringApplication.run(MhnApplication.class, args);
	}

}

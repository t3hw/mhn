package dev.t3hw.mhn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ConfigurationPropertiesScan
@ComponentScan(basePackages = { "dev.t3hw" })
public class MhnApplication {

	public static void main(String[] args) {
		SpringApplication.run(MhnApplication.class, args);
	}
}

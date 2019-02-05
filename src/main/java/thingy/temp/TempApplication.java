package thingy.temp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class TempApplication {
	
	public static void main(String[] args) {
		Environment env = SpringApplication.run(TempApplication.class, args).getEnvironment();
		System.out.println("Here, have a variable");
		System.out.println(env.getProperty("meh", "Meh"));
	}

}


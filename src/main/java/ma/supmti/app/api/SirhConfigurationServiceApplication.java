package ma.supmti.app.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SirhConfigurationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SirhConfigurationServiceApplication.class, args);
	}

}

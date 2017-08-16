package can.felix.learning.application.takeout;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan( basePackages = {"can.felix.learning.application.takeout"} )
public class TakeoutApplication {

	public static void main(String[] args) {
        SpringApplication.run(TakeoutApplication.class, args);
	}
}

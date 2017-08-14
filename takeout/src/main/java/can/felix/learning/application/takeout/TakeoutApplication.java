package can.felix.learning.application.takeout;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TakeoutApplication {

	public static void main(String[] args) {

		// Connects to mySQL database
		MySQLAccess dao = new MySQLAccess();
        try {
            dao.readDataBase();
        }catch (Exception e) {
            // do nothing
        }


		//SpringApplication.run(TakeoutApplication.class, args);
	}
}

package batch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ConfigurationProperties
public class BootBatchJobApplication {

    public static void main(String[] args) {
		SpringApplication.run(BootBatchJobApplication.class, args);
	}
}

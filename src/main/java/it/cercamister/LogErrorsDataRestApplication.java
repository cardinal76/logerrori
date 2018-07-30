package it.cercamister;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogErrorsDataRestApplication {
//public class LogErrorsDataRestApplication extends SpringBootServletInitializer{
//    
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return application.sources(LogErrorsDataRestApplication.class);
//    }
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(LogErrorsDataRestApplication.class, args);
	}
}

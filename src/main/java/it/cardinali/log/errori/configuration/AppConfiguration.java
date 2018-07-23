package it.cardinali.log.errori.configuration;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource(value= {"file:${catalina.base}/conf/errors/application.properties"})
@Resource(name="jdbc/errors", type=javax.sql.DataSource.class, lookup="jdbc/errors")
public class AppConfiguration {
	private  final Logger log = LoggerFactory.getLogger(AppConfiguration.class);
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
	  return new PropertySourcesPlaceholderConfigurer();
	}

}

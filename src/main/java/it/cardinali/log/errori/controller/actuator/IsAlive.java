package it.cardinali.log.errori.controller.actuator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class IsAlive implements HealthIndicator {

	@Override
	public Health health() {
		return Health.up().withDetail("pippo", "ciaooooooooooooooo").build();
	}
	
	

}

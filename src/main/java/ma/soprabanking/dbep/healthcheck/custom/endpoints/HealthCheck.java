package ma.soprabanking.dbep.healthcheck.custom.endpoints;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class HealthCheck implements HealthIndicator {
    @Override
    @Bean
    public Health health() {
        Health health = Health.up().withDetail("200OK","").build();
        return health;
    }
}

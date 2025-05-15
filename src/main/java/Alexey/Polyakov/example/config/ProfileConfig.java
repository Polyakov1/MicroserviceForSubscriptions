package Alexey.Polyakov.example.config;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ProfileConfig {

    @Bean
    @Profile("dev")
    public String devProfileBean() {
        return "Development profile is active";
    }

    @Bean
    @Profile("prod")
    public String prodProfileBean() {
        return "Production profile is active";
    }

    @Bean
    @ConditionalOnProperty(name = "feature.caching.enabled", havingValue = "true")
    public String cachingFeatureBean() {
        return "Caching feature is enabled";
    }
}
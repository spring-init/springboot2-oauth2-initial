package gps.initial.springboot2oauth2.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@Configuration //Required to read @EnableResourceServer
@EnableResourceServer
public class OAuth2ResourceServer {
}

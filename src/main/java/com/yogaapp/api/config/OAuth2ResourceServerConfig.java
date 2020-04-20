package com.yogaapp.api.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.provider.error.OAuth2AccessDeniedHandler;
/**
 * This rest end points /user will have to authenticated. Oauth checks the bearer token sent 
 * for this request and then if token is validated allows to access UserController
 * 
 * @author prparuch
 *
 */
@Configuration
@EnableResourceServer
public class OAuth2ResourceServerConfig extends ResourceServerConfigurerAdapter {
	 @Override
	    public void configure(HttpSecurity http) throws Exception {
		 http.
         anonymous().disable()
         .authorizeRequests()
         .antMatchers("/admin/**").access("hasRole('ADMIN')")
         .and().exceptionHandling().accessDeniedHandler(new OAuth2AccessDeniedHandler());
	    }
}

package com.hms.spring.security.springbootsecuritysample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class EmployeeResSecurityConfig extends WebSecurityConfigurerAdapter {
	
	
	
	/**
	 * Authentication Manager - Spring Exposes this class for handling Authentication.
	 * 		authenticate() operation would return success or failure for the user data.
	 * 
	 * Using Builder Pattern, affect its behavior. - AuthenticationBuilderManager.
	 * 1.Get hold of Authentication manager Builder.
	 * 2.Give configuration class.
	 * 		1.a - What type of authentication, User Data 
	 * 	
	 * 3.Request Spring Security model to handle authenticate() user. [ Builds Authentication Manager class ]
	 * 
	 * 
	 * WebSecurityConfigurerAdapter --> has access to AuthenticationManagerBuilder via configure.
	 * Spring Security would call this config method and behave as extended by you.
	 * 
	 */
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// Set my configuration to Manager Builder and Builder.
		auth.inMemoryAuthentication()
		.withUser("hms")
		.password("welcome")
		.roles("admin")
		.and()  // Configuring additional users
		.withUser("msh")
		.password("welcome")
		.roles("seller");
	}
	
	/**
	 * Spring Sec Need Password Encoding
	 * 
	 * Using Dummy Encoder to adhere to Spring Security framework
	 */
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
	
	

}
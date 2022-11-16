package com.auth_project.auth_api.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.BeanIds;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.auth_project.auth_api.filter.JwtFilter;
import com.auth_project.auth_api.service.UserService;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

	@Autowired
	private UserService userService;
	
	
	@Autowired
	private JwtFilter jwtFilter;
	
//		protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//			
//			auth.userDetailsService(jwtFilter.getUserService());
//			
//		}
		
		@Bean
		public PasswordEncoder passwordEncoder() {
			return new BCryptPasswordEncoder();
		}
		
		
		
		@Bean(name=BeanIds.AUTHENTICATION_MANAGER )
		public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
			// TODO Auto-generated method stub
			return authenticationConfiguration.getAuthenticationManager();
		}
	
		
		 @Bean
	     public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
	         http.cors().and().csrf().disable()
	                  .exceptionHandling().and()
	                 .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
	                 .and()
	                 .authorizeHttpRequests() 
	                 .requestMatchers("/register").permitAll()
	                 .requestMatchers("/login").permitAll()
	                 .anyRequest().authenticated();
	 
	         http.addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);
	 
	         return http.build();
	     }
		
}
package com.hackathon3.service.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConf extends WebSecurityConfigurerAdapter {
    /**
     * TODO : security config
     */
  @Override
  protected void configure(HttpSecurity http) throws Exception {
      http
              .authorizeRequests()
              .anyRequest().permitAll()
              .and()
              .formLogin()
              .and()
              .logout()
              .permitAll()
              .and()
              .csrf()
              .disable()
              .httpBasic();
  }
}

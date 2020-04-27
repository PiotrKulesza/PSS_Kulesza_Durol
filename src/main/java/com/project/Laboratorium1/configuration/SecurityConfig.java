package com.project.Laboratorium1.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import sun.misc.Contended;

@Configuration
public class SecurityConfig
    extends WebSecurityConfigurerAdapter
{

    @Bean
    public UserDetailsService userDetailsService(){
        UserDetails userDetails = User.withDefaultPasswordEncoder()
                .username("test")
                .password("test1")
                .roles("USER")
                .build();

        return new InMemoryUserDetailsManager(userDetails);
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {



        http
                .authorizeRequests()

                .antMatchers("/*").permitAll()
                .anyRequest().hasRole("USER")
                .and()
                .formLogin()
                //.loginPage("http://localhost:3000/login")
               // .successForwardUrl("http://localhost:3000/logged")
                .permitAll()
                .and()
                .logout()
                .logoutSuccessUrl("/login")
                .and()
                .oauth2Login();


    }


}

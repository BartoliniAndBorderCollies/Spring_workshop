package com.klodnicki.bartolini.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http.authorizeRequests()
//                .anyRequest()
//                .permitAll()
//                .and()
//                .build();

//                .requestMatchers("/", "/home", "/homework")
//                .permitAll();

//                .requestMatchers(HttpMethod.GET, "/", "/home")
//                .permitAll();

                .requestMatchers("/admin/**")
                .authenticated()

                .and()
                .build();
    }
}

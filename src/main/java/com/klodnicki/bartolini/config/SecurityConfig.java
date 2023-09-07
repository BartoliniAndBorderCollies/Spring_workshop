package com.klodnicki.bartolini.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.access.expression.WebExpressionAuthorizationManager;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http.authorizeHttpRequests(request -> request
                        .requestMatchers("/admin/**")
                        .authenticated()
                        .anyRequest()
                        .permitAll())
//                .formLogin(x -> x
//                        .loginPage("/login")) - nie właczy sie panel logowania defaultowy bo nadpisujemy go tą metodą

//                .requestMatchers("/", "/home", "/homework")
//                .permitAll();

//                .requestMatchers(HttpMethod.GET, "/", "/home")
//                .permitAll();

//                .requestMatchers("/admin/**")
//                .authenticated() - tylko zautentykowany user może się dostać do zasobu
                .build();
    }
}

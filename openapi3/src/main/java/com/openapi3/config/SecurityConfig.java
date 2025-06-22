package com.openapi3.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(
                auth -> auth.regexMatchers(
                                "/swagger-ui/.*",
                                "/swagger-resources/.*",
                                "/v3/api-docs",
                                "/v2/api-docs",
                                "/webjars/.*"
                ).authenticated()
                        .anyRequest()
                        .permitAll()
        ).httpBasic(withDefaults()) // 开启 HTTP Basic 认证
                .csrf(AbstractHttpConfigurer::disable); // 关闭 CSRF，避免跨站问题影响 Swagger

        return http.build();

    }
}

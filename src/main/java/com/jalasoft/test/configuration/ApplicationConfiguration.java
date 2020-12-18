package com.jalasoft.test.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
/**
 * <h1>Application Configuration</h1>
 * <P>
 *     Makes available the methods through Bean annotations
 * </P>
 * @autor Santiago Cárdenas
 * @version 1.0
 * @since 12/2020
 */
@Configuration
public class ApplicationConfiguration {

    @Bean
    public RestTemplate restTemplate() { return new RestTemplate(); }
}

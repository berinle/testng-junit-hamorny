package com.sample.config;

import com.sample.MyBean;
import com.sample.MyService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author berinle
 */
@Configuration
@ImportResource("classpath:test.xml")
public class AppConfig {

    @Bean
    public MyBean myBean(){
        return new MyBean();
    }

    @Bean
    public MyService myService(){
        return new MyService();
    }
}

package com.sample.config;

import com.sample.MyBean;
import com.sample.MyService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author berinle
 */
@Configuration
@ComponentScan(value = {"com.sample"})
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

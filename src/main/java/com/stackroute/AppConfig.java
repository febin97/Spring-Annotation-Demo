package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Actor getActor(){
        return new Actor("SRK","Male",52);
    }
    @Bean
    public Movie getMovie(){
        return new Movie();
    }
}

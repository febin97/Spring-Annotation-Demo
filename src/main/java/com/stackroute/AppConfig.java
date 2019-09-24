package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean
    public Actor actor1(){
        return new Actor("SRK","Male",52);
    }
    @Bean
    public Actor actor2(){
        return new Actor("Ettan","Male",57);
    }
    @Bean
    public Actor actor3(){
        return new Actor("Ikka","Male",65);
    }
    @Bean(name = {"movie1","movie2"})
    //@Scope("prototype")
    public Movie getMovie(){
        return new Movie();
    }
}

package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Movie movie1 = context.getBean("movie1",Movie.class);
        System.out.println(movie1);
        Movie movie2 = context.getBean("movie1",Movie.class);
        System.out.println(movie2);
        System.out.println(movie1==movie2);
        Movie movie3 = context.getBean("movie2",Movie.class);
        System.out.println(movie3);
    }
}
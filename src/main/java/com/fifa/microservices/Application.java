package com.fifa.microservices;

import com.fifa.microservices.service.PlayerService;
import com.fifa.microservices.service.TeamService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }

    /*
    @Bean
    public TeamService teamService() {
        return new TeamService ();
    }

    @Bean
    public PlayerService playerService() {
        return new PlayerService ();
    }
    */
}

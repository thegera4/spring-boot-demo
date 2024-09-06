package com.jgmedellin.springboot.demo.demo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // Inject properties for: coach.name and coach.team
    @Value("${coach.name}")
    private String coachName;

    @Value("${coach.team}")
    private String coachTeam;

    // expose new endpoint for "teaminfo"
    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "Coach: " + coachName + ", Team: " + coachTeam;
    }

    // expose "/" that return "Hello World"
    @GetMapping("/")
    public String sayHello() {
        return "Hello spring boot!";
    }

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }

    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is your lucky day!";
    }

    @GetMapping("/about")
    public String about() {
        return "This is a demo app for Spring Boot";
    }

}

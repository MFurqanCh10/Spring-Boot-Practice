package com.love2code.springboot.demo.mycrazyapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    // inject properties for:coach.name and team.name

    @Value("${coach.name}")
    private String coachName;


    @Value("${team.name}")
    private String teamName;
    //expose a new endpoint for "TeamInfo"

    @GetMapping("/TeamInfo")
    public String GetTeamInfo(){

        return "Coach: " + coachName + ",Team name: " + teamName;
    }


    // expose "/" that return "Hello World!"
@GetMapping("/")
    public String sayHello(){
    return "Hello World!";
}

//expose a new endpoint for "workout"
    @GetMapping("/workout")
    public String getDailyWorkout(){
    return "run a hard 5k!";

    }
    //expose a new endpoint for "fortune"
    @GetMapping("/fortune")
    public String getDailyFortune()
    {
        return "today is your lucky day!";
    }

}

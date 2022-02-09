package com.jwt.jwtController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    @RequestMapping("/hello")
    public String welcome(){

        return " Welocme this is private page , " +
                " this is not allowed to unauthonticate users ...";
    }

}

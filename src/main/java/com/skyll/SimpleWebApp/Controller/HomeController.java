package com.skyll.SimpleWebApp.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
//        System.out.println("im here");
            return "welcome to skyllx";
    }
    @RequestMapping("/Gani")
    public String  about(){
        return("how are you");
    }
}

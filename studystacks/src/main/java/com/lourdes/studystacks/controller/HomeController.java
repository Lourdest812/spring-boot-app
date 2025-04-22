package com.lourdes.studystacks.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
;

@RestController
public class HomeController {
  
    // One syntax to implement a
    // GET method
    @GetMapping("/test")
    public String test()
    {
        String str
            = "<html><body><font color=\"blue\">"
              + "<h1>This is my first Spring project in a while, let's experiment with it!</h1>"
              + "</font></body></html>";
        return str;
    }
  
    // Another syntax to implement a
    // GET method
    @RequestMapping(
        method = { RequestMethod.GET },
        value = { "/dummy" })
  
    public String info()
    {
        String str2
            = "<html><body><font color=\"red\">"
              + "<h2>This is a Computer"
              + " Demo project for Spring Boot. It's like coffee for your code"
              +"—keeps things running smoothly and makes everything better "
              + "(especially on Mondays) "
              + "</h2></font></body></html>";
        return str2;
    }
    @GetMapping("/")
        public String home() {
            return "This is your home, hello! :D"; // Refers to home.html in the templates folder
        }

}

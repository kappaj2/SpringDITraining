package za.co.ajk.spring5webapp.didemo.controllers;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;

import za.co.ajk.spring5webapp.didemo.services.GreetingService;

@Controller
public class MyController {
    
    private static final Log log = LogFactory.getLog(MyController.class);
    
    private GreetingService greetingService;
    
    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    
    public String sayGreeting(){
        System.out.println("Hello inside MyController");
        return greetingService.sayGreeting();
    }
}

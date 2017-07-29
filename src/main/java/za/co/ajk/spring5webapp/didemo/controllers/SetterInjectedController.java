package za.co.ajk.spring5webapp.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import za.co.ajk.spring5webapp.didemo.services.GreetingService;

@Controller
public class SetterInjectedController {
    
    private GreetingService greetingService;
    
    public SetterInjectedController() {
    }
    
    @Autowired
    public void setGreetingService(@Qualifier("setterGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    
    public String sayHello(){
        return greetingService.sayGreeting();
    }
}

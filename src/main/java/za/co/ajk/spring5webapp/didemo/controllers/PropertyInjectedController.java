package za.co.ajk.spring5webapp.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import za.co.ajk.spring5webapp.didemo.services.GreetingService;

@Controller

public class PropertyInjectedController {
    
    /**
     * Use the Interface and then the implementation class as the property name.
     * Spring will identify bean through reflection.
     */
    @Autowired
    //@Qualifier("greetingServiceImpl") - remove as profile now determines
    private GreetingService greetingServiceImpl;
    
    public PropertyInjectedController() {
    }

    public String sayHello(){
        return greetingServiceImpl.sayGreeting();
    }
}



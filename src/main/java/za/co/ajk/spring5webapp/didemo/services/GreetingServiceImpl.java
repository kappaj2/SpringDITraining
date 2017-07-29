package za.co.ajk.spring5webapp.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{
    
    @Override
    public String sayGreeting() {
        return "Greeting from greeting serviceImpl";
    }
}

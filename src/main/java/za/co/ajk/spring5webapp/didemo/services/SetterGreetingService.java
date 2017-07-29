package za.co.ajk.spring5webapp.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {
    
    @Override
    public String sayGreeting() {
        return "Hello - I was injected by the setter";
    }
}

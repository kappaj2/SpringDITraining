package za.co.ajk.spring5webapp.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Primary
@Service
@Profile({"en","default"})
public class PrimaryGreetingService implements GreetingService {
    
    @Override
    public String sayGreeting() {
        return "Hello - primary greeting service";
    }
}

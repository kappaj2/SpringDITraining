package za.co.ajk.spring5webapp.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"en","default"})
public class GreetingServiceImpl implements GreetingService{
    
    private static final String HELLO_GURUS = "Hello Guru's - Original";
    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}

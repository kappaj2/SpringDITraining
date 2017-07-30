package za.co.ajk.spring5webapp.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("es")
@Service
@Primary
public class PrimarySpanishGreetingService implements GreetingService{
    
    @Override
    public String sayGreeting() {
        return "Servicio de Saludo Primario";
    }
}

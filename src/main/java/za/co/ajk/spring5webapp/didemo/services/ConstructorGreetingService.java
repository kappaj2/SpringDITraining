package za.co.ajk.spring5webapp.didemo.services;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService, InitializingBean, DisposableBean{
    
    private static Logger log = LoggerFactory.getLogger(ConstructorGreetingService.class);
    
    @Override 
    public String sayGreeting(){
        return "Hello - I was injected via the constructor";
    }
    
    @PostConstruct
    public void initIt() throws Exception {
        log.info("Init method after properties are set : ");
    }
    
    @PreDestroy
    public void cleanUp() throws Exception {
        log.info("Spring Container is destroy! Customer clean up");
    }
    
    @Override
    public void destroy() throws Exception {
        log.info("Doing destroy using interface");
    }
    
    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("Doing afterPropertiesSet using interface");
    }
}

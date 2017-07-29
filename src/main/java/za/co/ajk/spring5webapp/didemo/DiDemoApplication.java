package za.co.ajk.spring5webapp.didemo;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import za.co.ajk.spring5webapp.didemo.controllers.ConstructorInjectedController;
import za.co.ajk.spring5webapp.didemo.controllers.MyController;
import za.co.ajk.spring5webapp.didemo.controllers.PropertyInjectedController;
import za.co.ajk.spring5webapp.didemo.controllers.SetterInjectedController;

@SpringBootApplication
public class DiDemoApplication {

	private static final Log log = LogFactory.getLog(DiDemoApplication.class);
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
		MyController mycontroller = (MyController)ctx.getBean("myController");
		
		System.out.println(mycontroller.sayGreeting());
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
		
	}
}

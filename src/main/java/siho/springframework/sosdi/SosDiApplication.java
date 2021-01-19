package siho.springframework.sosdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import siho.springframework.sosdi.controllers.ConstructorInjectedController;
import siho.springframework.sosdi.controllers.MyController;
import siho.springframework.sosdi.controllers.PropertyInjectedController;
import siho.springframework.sosdi.controllers.SetterInjectedController;

@SpringBootApplication
public class SosDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SosDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);

		System.out.println("__________________Property");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("__________________Setter");

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("__________________Constructor");

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(propertyInjectedController.getGreeting());
	}

}

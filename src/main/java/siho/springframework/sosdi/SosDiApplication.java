package siho.springframework.sosdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import siho.springframework.sosdi.controllers.MyController;

@SpringBootApplication
public class SosDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SosDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);
	}

}

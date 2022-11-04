package dmacc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Guitar;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.GuitarRepository;

@SpringBootApplication
public class GuitarInventoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuitarInventoryApplication.class, args);
		
	}
	/*	
	@Autowired
	GuitarRepository repo;
		
		
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		//Guitar g = appContext.getBean("guitar", Guitar.class);
		
		Guitar g = new Guitar("Fender", "Stratocaster", 300.00, 400.00, 1);
		
		repo.save(g);
		
		((AbstractApplicationContext) appContext).close();
			
	}*/
}

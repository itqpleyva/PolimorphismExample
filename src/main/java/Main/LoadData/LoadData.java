package Main.LoadData;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import Main.Model.Animal;
import Main.Model.Cat;
import Main.Model.Dog;
import Main.Repositories.AnimalRepository;



@Component
public class LoadData implements ApplicationListener<ContextRefreshedEvent> {


	@Autowired
	AnimalRepository animalRepo;

	@Autowired
	private EntityManager em;
	
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		
		Dog dog = new Dog();
		dog.setName("negrito");	
		animalRepo.saveAll(Arrays.asList(dog));
		dog.sound();
		Cat cat1 = new Cat();
		cat1.setName("Pelusa");	
		animalRepo.saveAll(Arrays.asList(cat1));
		cat1.sound();
		@SuppressWarnings("unchecked")
		List<Dog> doggie =  em.createNamedQuery("Animal.findByName")
                .setParameter("name", "negrito").getResultList();
		
		doggie.get(0).setName("negrito1");
		doggie.get(0).setSpecie("mamiferos");
		animalRepo.save(doggie.get(0));
		System.out.println(doggie);
	}

}

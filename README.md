# PolimorphismExample
Example of polimorphism in java SpringBoot
<p>In this example we create a parent class "Animal.class" and two daughter classes "Dog.class" and "Cat.class"</p>
<p>To manage data, an interface is created for the animal class that extends from JPARepository, in this way all the necessary methods are generated for the insertion of the data related to the two daughter classes.</p>
<p>The LoadData class exemplifies the handling of data related to the Cat and Dog classes.</p>

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
		
		Cat cat1 = new Cat();
		cat1.setName("Pelusa");	
		animalRepo.saveAll(Arrays.asList(cat1));
		
		@SuppressWarnings("unchecked")
		List<Dog> doggie =  em.createNamedQuery("Animal.findByName")
                .setParameter("name", "negrito").getResultList();
		
		doggie.get(0).setName("negrito1");
		doggie.get(0).setSpecie("mamiferos");
		animalRepo.save(doggie.get(0));
		System.out.println(doggie);
	}

}

<p>In the way the model classes are defined, a class structure is created in the DB as follows</p>
<p>The ANIMAL table is generated, green rectangle for the parent class attributes, black rectangle for Cat child class attributes and blue rectangle for Dog child class attributes</p>
<br>
<img src="data2.png"/>

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//public class DemoApplication implements CommandLineRunner{
public class DemoApplication{
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	@Autowired
//	PartRepository partRepo;
	
//	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
//	@Override
//	public void run(String... args) throws Exception {
		
		// courseRepository.playWithEntityManager();
//		studentRepository.saveStudentWithPassport();
//		courseRepository.addHardcodedReviewsForCourse();

//		List<Review> reviews = new ArrayList<>();
//		reviews.add(new Review("5", "Great Hands-on Stuff."));
//		reviews.add(new Review("5", "Hatsoff."));
//
//		courseRepository.addReviewsForCourse(10003L, reviews);
//		studentRepository.insertHardcodedStudentAndCourse();
//		studentRepository.insertStudentAndCourse(new Student("Jack"), new Course("Microservices in 100 Steps"));

//		employeeRepository.insert(new FullTimeEmployee("Jack", new BigDecimal("100000")));
//		employeeRepository.insert(new PartTimeEmployee("Jill", new BigDecimal("50")));
//
//	}
}

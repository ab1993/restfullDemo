/*package com.example.spring.jpa.JPADemo.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//import com.example.spring.jpa.JPADemo.User.User;

@Component
public class UserDAOServiceCommanLineRunner implements CommandLineRunner{

	@Autowired
	UserDAOService userDAOService;
	
	private static final Logger log= LoggerFactory.getLogger(UserDAOServiceCommanLineRunner.class);
	
	@Override
	public void run(String... args) throws Exception {
//		User user= new User("Abhishek", "Admin");
//		User user2= new User("Bhanu", "Com");
//		User user3= new User("Sneha", "con");
//		User user4= new User("Kartik", "low");
		log.info("Inserted 1st user"+ " " +userDAOService.insertUser(user));
		log.info("Inserted 2nd user"  + " " +userDAOService.insertUser(user2));
		log.info("Inserted 3rd user"+ " "+userDAOService.insertUser(user3));
		log.info("Inserted 4th user"+ " " +userDAOService.insertUser(user4));
		
		String name= userDAOService.getUser(user);
		log.info("Name present in db" +name);
		
		
		
	}

}
*/
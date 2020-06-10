/*package com.example.spring.jpa.JPADemo.Service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.spring.jpa.JPADemo.User.User;

@Repository
@Transactional
@Service
public class UserDAOService {
	
	@PersistenceContext
	private EntityManager entityManager;

	
     public int insertUser(User user)
     {
    	 entityManager.persist(user);
    	 return  user.getId();
    	 
     }
     
//     @Transactional
//     public String getUser(User user)
//     {
//    	 entityManager.persist(user);;
//    	 return user.getName();
//     }
	
}
*/
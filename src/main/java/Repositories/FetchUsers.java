package Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Entities.Role;
import  Entities.Users;

@Repository
public interface FetchUsers extends JpaRepository<Users, Integer> {
	
	List<Users> findByRole(Role role);
	
	
	Users findByPhno(String phno);
	
	
		
	
}

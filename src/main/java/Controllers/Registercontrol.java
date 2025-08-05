package Controllers;

import java.util.PriorityQueue;
import java.util.Queue;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Entities.Users;
import Repositories.FetchUsers;

@RestController
public class Registercontrol {
	
	@Autowired
	FetchUsers fetchuser;
	
	public ResponseEntity RegisterUser(@RequestBody Users user) {
		
		try {
		
			fetchuser.save(user);
			
			return ResponseEntity.ok("Successfull");
		
		}
		catch(RuntimeException e) {
			
			return ResponseEntity.badRequest().build();
		}
		
	
		
		
	}

}

package Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Entities.Role;
import Entities.Users;
import Repositories.FetchUsers;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
public class Admincontrol {
	
	@Autowired
	Users user;
	
	@Autowired
	FetchUsers fetchuser;
	
	
	@GetMapping("/interns")
	public ResponseEntity getAllInterns() {
		
		List<Users> users = fetchuser.findByRole(Role.intern);
		
		if(users.isEmpty()) {
			
			return ResponseEntity.badRequest().body("No interns");
		}
		else {
			
			return ResponseEntity.ok(users);
		}
		
		
	}
	
	
	@GetMapping("/volenteers")
	public ResponseEntity getAllVolenteers() {
		
		List<Users> users = fetchuser.findByRole(Role.volenteer);
		
		if(users.isEmpty()) {
			
			return ResponseEntity.badRequest().body("No volenteers");
		}
		else {
			
			return ResponseEntity.ok(users);
		}
		
		
	}
		

	
	@GetMapping("/user/{phno}")
	public ResponseEntity getMember(@PathVariable String phno) {
		
		Users user = fetchuser.findByPhno(phno);
		
		if(user==null) {
			
			return ResponseEntity.badRequest().body("No user found");
		}
		else {
			
			return ResponseEntity.ok(user);
		}
		
	}
	
	
	

}

package registration;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


 
@RestController

public class AppController {
 
    @Autowired
    private UserRepository userRepo;
     
    @GetMapping("")
    public String viewHomePage() {
        return "index";
    }
    
    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
         
        return "signup_form";
    }
    
    @PostMapping("process_register")
    @CrossOrigin(origins="http://localhost:4200")
    public ResponseEntity<User> processRegister(@RequestBody User user) {
       /* BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder() ;
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);*/
        return ResponseEntity.ok(userRepo.save(user));
    }
    @GetMapping("/users")
    public String listUsers(Model model) {
        List<User> listUsers = userRepo.findAll();
        model.addAttribute("listUsers", listUsers);
        return "users";
    }
    @PostMapping("/UserLogin")
    @CrossOrigin(origins="http://localhost:4200")
    public ResponseEntity<?> processLogin(@RequestBody User userdata) {
    	User user = userRepo.findByEmail(userdata.getEmail());
    	/*String pass ;
    	BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder() ;
    	pass = passwordEncoder.encode(userdata.getPassword());*/
    	if(user!=null) {
    	if(user.getPassword().equals(userdata.getPassword()))
    		return ResponseEntity.ok(user);
    	}
    	
        return ResponseEntity.notFound().build();
    	}

    
}

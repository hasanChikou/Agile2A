package tech.getarrays.Usermanager.resource;

import org.apache.catalina.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import tech.getarrays.Usermanager.service.UserService;

@RestController
@RequestMapping("/User")
public class UserResource {
    private final UserService UserService;

    public UserResource(UserService UserService) {
        this.UserService = UserService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<User>> getAllUsers () {
        List<User> Users = UserService.findAllUsers();
        return new ResponseEntity<>(Users, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<User> getUserById (@PathVariable("id") Long id) {
        User User = UserService.findUserById(id);
        return new ResponseEntity<>(User, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<User> updateUser(@RequestBody User User) {
        User updateUser = UserService.updateUser(User);
        return new ResponseEntity<>(updateUser, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable("id") Long id) {
        UserService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

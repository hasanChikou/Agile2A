package tech.getarrays.Usermanager.service;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.getarrays.Usermanager.exception.UserNotFoundException;
import tech.getarrays.Usermanager.repo.UserRepo;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService {
    private final UserRepo UserRepo;

    @Autowired
    public UserService(UserRepo UserRepo) {
        this.UserRepo = UserRepo;
    }

    public List<User> findAllUsers() {
        return UserRepo.findAll();
    }

    public User updateUser(User User) {
        return UserRepo.save(User);
    }

    public User findUserById(Long id) {
        return UserRepo.findUserById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }

    public void deleteUser(Long id){
        UserRepo.deleteUserById(id);
    }
}

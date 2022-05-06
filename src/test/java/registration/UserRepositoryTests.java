package registration;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;
 
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {
    @Autowired
    private TestEntityManager entityManager;
     
    @Autowired
    private UserRepository repo;

    @Test
public void testCreateUser() {
    User user = new User();
    user.setEmail("hasan@gmail.com");
    user.setPassword("chikou1é");
    user.setFirstName("hasan");
    user.setLastName("CHIKOU");
    user.setAdresse("RABAT AGDAL ENSIAS");
    user.setNumTele("0657263099");
    user.setPreference("CATS");
     
    User savedUser = repo.save(user);
     
    User existUser = entityManager.find(User.class, savedUser.getid());
     
    assertThat(user.getEmail()).isEqualTo(existUser.getEmail());
     
}
    @Test
    public void testfinduserByEmail() {
    	
    	String email = "hasan@gmail.com" ; 
    	User user = repo.findByEmail(email) ; 
    	assertThat(user).isNotNull(); 
    }
}

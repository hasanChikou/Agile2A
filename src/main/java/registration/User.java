package registration;

import javax.persistence.*;
@Entity
@Table(name = "users")
public class User {
     
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 
    @Column(nullable = false, unique = true, length = 50)
    private String email;
     
    @Column(nullable = false, length = 64)
    private String password;
     
    @Column(name = "first_name", nullable = false, length = 20)
    private String firstName;
     
    @Column(name = "last_name", nullable = false, length = 20)
    private String lastName;

    @Column(name = "adresse", nullable = false, length = 100)
    private String adresse;

    @Column(name = "numTele", nullable = false, length = 20)
    private String numTele;

    @Column(name = "preference", nullable = false, length = 50)
    private String preference;


    // getters and setters 
    public Long getid(){
        return id ; 
    }
    public void  setid(Long id ){
        this.id = id ; 
    }

    public String getEmail(){
        return email; 
    }
    public void setEmail(String email){
        this.email = email ; 
    }

    public String getPassword(){
        return password; 
    }
    public void setPassword(String Password){
        this.password = Password ; 
    }

    public String getFirstName(){
        return firstName ; 
    }
    public void setFirstName(String firstname)
    {
        this.firstName = firstname; 
    }

    public String getLastName(){
        return lastName ; 
    }
    public void setLastName(String lastname)
    {
        this.lastName = lastname; 
    }

    public String getAdresse(){
        return adresse ;
    }
    public void setAdresse(String adresse){
        this.adresse = adresse;
    }

    public String getNumTele(){
        return numTele ;
    }
    public void setNumTele(String numtele){
        this.numTele  = numtele ; 
    }

    public String getPreference(){
        return preference; 
    }
    public void setPreference(String preference){
        this.preference = preference ; 
    }
}

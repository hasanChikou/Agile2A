package tech.getarrays.Usermanager.model;

import javax.persistence.*;

import java.io.Serializable;

@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String first_name;
    private String email;
    private String last_name;
    private String num_tele;
    private String preference;
    private String adresse;
    @Column(nullable = false, length  = 64)
    private String password;

    public User() {}

    public User(String first_name, String email, String last_name, String num_tele, String password, String adresse,String preference) {
        this.first_name = first_name;
        this.email = email;
        this.last_name = last_name;
        this.num_tele = num_tele;
        this.password = password;
        this.adresse = adresse;
        this.preference = preference;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getfirst_name() {
        return first_name;
    }

    public void setfirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getlast_name() {
        return last_name;
    }

    public void setlast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getnum_tele() {
        return num_tele;
    }

    public void setnum_tele(String num_tele) {
        this.num_tele = num_tele;
    }

    public String getadresse() {
        return adresse;
    }

    public void setadresse(String adresse) {
        this.adresse = adresse;
    }

    public String getpassword() {
        return password;
    }

    public void setpassword(String password) {
        this.password = password;
    }
    public String getpreference() {
        return preference;
    }

    public void setpreference(String preference) {
        this.preference = preference;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", email='" + email + '\'' +
                ", last_name='" + last_name + '\'' +
                ", num_tele='" + num_tele + '\'' +
                ", password='" + password + '\'' +
                ", adresse='" + adresse + '\'' +
                ", preference='" + preference + '\'' +
                '}';
    }
}

package com.adoption.adoptionanimal.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="anonce")
public class Anonce  implements Serializable {
    @Id
    @Column(name="Animal_ID")
    private Long Animal_ID ;

    @Column(name="Email_annonceur ")
    private String Email_annonceur;

    @Column(name="telephone_annonceur ")
    private String 	telephone_annonceur;

    @Column(name="Animal_NOM")
    private String Animal_NOM ;

    @Column(name="Animal_RACE")
    private String Animal_RACE ;

    @Column(name="Animal_AGE")
    private String Animal_AGE ;

    @Column(name="Vaccin")
    private String 	Vaccin;

    @Column(name="Animal_genre")
    private String Animal_genre ;

    @Column(name="DESCRIPTION")
    private String DESCRIPTION ;

    @Column(name="DATE_ANONCE")
    private String DATE_ANONCE ;

    public Anonce() {
    }

    @Override
    public String toString() {
        return "Anonce{" +
                "Animal_ID=" + Animal_ID +
                ", Email_annonceur='" + Email_annonceur + '\'' +
                ", telephone_annonceur='" + telephone_annonceur + '\'' +
                ", Animal_NOM='" + Animal_NOM + '\'' +
                ", Animal_RACE='" + Animal_RACE + '\'' +
                ", Animal_AGE='" + Animal_AGE + '\'' +
                ", Vaccin='" + Vaccin + '\'' +
                ", Animal_genre='" + Animal_genre + '\'' +
                ", DESCRIPTION='" + DESCRIPTION + '\'' +
                ", DATE_ANONCE='" + DATE_ANONCE + '\'' +
                '}';
    }

    public Anonce(Long animal_ID, String email_annonceur, String telephone_annonceur, String animal_NOM, String animal_RACE,
                  String animal_AGE,
                  String vaccin, String animal_genre, String DESCRIPTION, String DATE_ANONCE) {
        Animal_ID = animal_ID;
        Email_annonceur = email_annonceur;
        this.telephone_annonceur = telephone_annonceur;
        Animal_NOM = animal_NOM;
        Animal_RACE = animal_RACE;
        Animal_AGE = animal_AGE;
        Vaccin = vaccin;
        Animal_genre = animal_genre;
        this.DESCRIPTION = DESCRIPTION;
        this.DATE_ANONCE = DATE_ANONCE;
    }

    public String getEmail_annonceur() {
        return Email_annonceur;
    }

    public String getTelephone_annonceur() {
        return telephone_annonceur;
    }

    public void setEmail_annonceur(String email_annonceur) {
        Email_annonceur = email_annonceur;
    }

    public void setTelephone_annonceur(String telephone_annonceur) {
        this.telephone_annonceur = telephone_annonceur;
    }

    public Long getAnimal_ID() {
        return Animal_ID;
    }

    public void setAnimal_ID(Long animal_ID) {
        Animal_ID = animal_ID;
    }

    public String getAnimal_NOM() {
        return Animal_NOM;
    }

    public void setAnimal_NOM(String animal_NOM) {
        Animal_NOM = animal_NOM;
    }

    public String getAnimal_RACE() {
        return Animal_RACE;
    }

    public void setAnimal_RACE(String animal_RACE) {
        Animal_RACE = animal_RACE;
    }

    public String getAnimal_AGE() {
        return Animal_AGE;
    }

    public void setAnimal_AGE(String animal_AGE) {
        Animal_AGE = animal_AGE;
    }

    public String getVaccin() {
        return Vaccin;
    }

    public void setVaccin(String vaccin) {
        Vaccin = vaccin;
    }

    public String getAnimal_genre() {
        return Animal_genre;
    }

    public void setAnimal_genre(String animal_genre) {
        Animal_genre = animal_genre;
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }

    public String getDATE_ANONCE() {
        return DATE_ANONCE;
    }

    public void setDATE_ANONCE(String DATE_ANONCE) {
        this.DATE_ANONCE = DATE_ANONCE;
    }
}

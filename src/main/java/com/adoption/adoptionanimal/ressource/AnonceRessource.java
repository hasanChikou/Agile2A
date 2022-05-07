package com.adoption.adoptionanimal.ressource;

import com.adoption.adoptionanimal.Model.Anonce;
import com.adoption.adoptionanimal.repository.AnonceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins ="*" ,allowedHeaders = "*")

@RestController
@RequestMapping(value="/annonce")

public class AnonceRessource {
    @Autowired
    AnonceRepository anonceRepository ;

  
    @PostMapping("/all")
    public ResponseEntity<Anonce> createApplication(@RequestBody Anonce anonce) {

       /* Optional<Anonce> applicationdata = anonceRepository.findById(anonce.getAnimal_ID());
        if(!applicationdata.isPresent()){
            try {*/
                Anonce _application = anonceRepository.save(new Anonce(anonce.getAnimal_ID(),anonce.getEmail_annonceur(),anonce.getTelephone_annonceur(), anonce.getAnimal_NOM(),anonce.getAnimal_RACE(),anonce.getAnimal_AGE(),anonce.getVaccin(),anonce.getAnimal_genre(),anonce.getDESCRIPTION(),anonce.getDATE_ANONCE()));
                return new ResponseEntity<>(_application, HttpStatus.CREATED);
          /* } catch (Exception e) {
                return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);

            }}
        return null ;*/
    }

}

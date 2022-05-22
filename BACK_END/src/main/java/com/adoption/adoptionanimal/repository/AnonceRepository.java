package com.adoption.adoptionanimal.repository;

import com.adoption.adoptionanimal.Model.Anonce;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnonceRepository extends JpaRepository<Anonce,Long > {
}

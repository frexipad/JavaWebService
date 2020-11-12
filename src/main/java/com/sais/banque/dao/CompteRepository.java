package com.sais.banque.dao;

import com.sais.banque.metier.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;


@RepositoryRestResource
public interface CompteRepository extends JpaRepository<Compte,Long> {
    //http://localhost:8081/comptes/search/byId?id=2  or http://localhost:8081/comptes/search/findAllById?id=2
    @RestResource(path = "/byId")
    List<Compte> findAllById(@Param("id") Long id);
}

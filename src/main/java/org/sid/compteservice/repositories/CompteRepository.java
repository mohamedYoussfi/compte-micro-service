package org.sid.compteservice.repositories;

import org.sid.compteservice.entities.Compte;
import org.sid.compteservice.enums.TypeCompte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource
public interface CompteRepository extends JpaRepository<Compte,Long> {
    @RestResource(path = "/byType")
    List<Compte> findByType(@Param(value="type") TypeCompte typeCompte);
}

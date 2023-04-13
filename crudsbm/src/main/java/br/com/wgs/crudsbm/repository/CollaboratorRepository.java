package br.com.wgs.crudsbm.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import br.com.wgs.crudsbm.model.Collaborator;

public interface CollaboratorRepository extends MongoRepository<Collaborator, String> {

    @Query("{name:'?0'}")
    List<Collaborator> findByName(String name);

    long count();
}

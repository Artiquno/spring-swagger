package thingy.temp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import thingy.temp.model.Pet;

@Repository
public interface PetRepository extends MongoRepository<Pet, String> {
    
}
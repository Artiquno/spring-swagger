package thingy.temp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import thingy.temp.model.Pet;

@Service
public interface PetService {
    /**
     * Save a new cuddly pet
     * 
     * @param pet your request for a cuddly pet
     * @return your new cuddly pet
     */
    public Pet save(Pet pet);

    /**
     * Find some cuddly pets with a cuddly name
     * 
     * @param name cuddly name of the cuddly pets
     * @return the cuddly pets
     */
    public List<Pet> findByName(String name);
}
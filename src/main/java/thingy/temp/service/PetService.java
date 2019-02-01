package thingy.temp.service;

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
}
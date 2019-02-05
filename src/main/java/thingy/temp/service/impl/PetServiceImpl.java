package thingy.temp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import thingy.temp.model.Pet;
import thingy.temp.repository.PetRepository;
import thingy.temp.service.PetService;

@Service
public class PetServiceImpl implements PetService {

    @Autowired
    PetRepository petRepository;

    @Override
    public Pet save(Pet pet) {
        return petRepository.save(pet);
    }
}
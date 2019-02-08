package thingy.temp.service.impl;

import java.util.List;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import thingy.temp.model.Pet;
import thingy.temp.repository.PetRepository;
import thingy.temp.service.PetService;
import thingy.temp.service.mapper.PetMapper;

@Service
public class PetServiceImpl implements PetService {

    @Autowired
    PetRepository petRepository;

    private final PetMapper petMapper = Mappers.getMapper(PetMapper.class);

    @Override
    public Pet save(Pet pet) {
        return petRepository.save(pet);
    }

    @Override
    public List<Pet> findByName(String name) {
        List<Pet> pets = petRepository.findByName(name);
        return pets;
    }
}
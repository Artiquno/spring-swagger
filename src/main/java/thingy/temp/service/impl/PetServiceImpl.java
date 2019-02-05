package thingy.temp.service.impl;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import thingy.temp.model.Pet;
import thingy.temp.repository.PetRepository;
import thingy.temp.service.PetService;
import thingy.temp.service.dto.PetDTO;
import thingy.temp.service.mapper.PetMapper;

@Service
public class PetServiceImpl implements PetService {

    @Autowired
    PetRepository petRepository;

    private PetMapper petMapper = Mappers.getMapper(PetMapper.class);

    @Override
    public Pet save(Pet pet) {
        return petRepository.save(pet);
    }
}
package thingy.temp.service.mapper;

import org.mapstruct.Mapper;

import thingy.temp.model.Pet;
import thingy.temp.service.dto.PetDTO;

@Mapper
public interface PetMapper extends EntityMapper<PetDTO, Pet> {

}
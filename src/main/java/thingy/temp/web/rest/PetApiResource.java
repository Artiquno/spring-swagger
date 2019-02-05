package thingy.temp.web.rest;

import java.util.List;

import thingy.temp.model.Pet;
import thingy.temp.service.PetService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PetApiResource implements PetsApi {

    @Autowired
    private Environment env;

    @Autowired
    private PetService petService;

    @Override
    public ResponseEntity<List<Pet>> getPets(String name) {
        System.out.println("Yaaay! Kitties!!!");
        List<Pet> pets = petService.findByName(name);
        return ResponseEntity.ok(pets);
    }

    @Override
    public ResponseEntity<Pet> savePet(Pet pet) {
        System.out.println("Saving a cuddly pet");
        return ResponseEntity.ok(petService.save(pet));
    }

}
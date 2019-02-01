package thingy.temp.web.rest;

import java.util.ArrayList;
import java.util.List;

import thingy.temp.model.Pet;
import thingy.temp.service.PetService;

import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PetApiResource implements PetsApi {

    private final Environment env;

    private final PetService petService;

    public PetApiResource(Environment env,
                          PetService petService) {
        this.env = env;
        this.petService = petService;
    }

    @Override
    public ResponseEntity<List<Pet>> getPets(String name) {
        System.out.println("Yaaay! Kitties!!!");

        ArrayList<Pet> pets = new ArrayList<Pet>();

        Pet pet = new Pet();
        pet.setName(name);
        pets.add(pet);

        pet = new Pet();
        pet.setName("Plopper");
        pets.add(pet);

        pet = new Pet();
        pet.setName("Meowsers Ph.D");
        pets.add(pet);

        return ResponseEntity.ok(pets);
    }

    @Override
    public ResponseEntity<Pet> savePet(Pet pet) {
        return ResponseEntity.ok(petService.save(pet));
    }

}
package thingy.temp.web.rest;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import thingy.temp.model.Pet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import thingy.temp.web.rest.PetApi;

@RestController
public class PetApiResource implements PetApi {

    @Autowired
    private final Environment env;

    public PetApiResource(Environment env) {
        this.env = env;
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

}
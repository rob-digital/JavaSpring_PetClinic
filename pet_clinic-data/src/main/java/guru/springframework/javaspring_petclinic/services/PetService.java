package guru.springframework.javaspring_petclinic.services;

import guru.springframework.javaspring_petclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}

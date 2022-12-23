package guru.springframework.javaspring_petclinic.services;

import guru.springframework.javaspring_petclinic.model.Owner;
import guru.springframework.javaspring_petclinic.model.Pet;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastname);

    Set<Pet> findAllPetsBelongingToOwner(String lastName);

    // no need after adding CrudService
//    Owner findById(Long id);
//
//    Owner save(Owner owner);
//
//    Set<Owner> findAll();
}

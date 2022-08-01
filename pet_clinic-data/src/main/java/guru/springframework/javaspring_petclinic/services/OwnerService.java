package guru.springframework.javaspring_petclinic.services;

import guru.springframework.javaspring_petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastname);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}

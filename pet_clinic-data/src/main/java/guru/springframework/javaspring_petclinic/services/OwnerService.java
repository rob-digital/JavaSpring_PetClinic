package guru.springframework.javaspring_petclinic.services;

import guru.springframework.javaspring_petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastname);

    // no need after adding CrudService
//    Owner findById(Long id);
//
//    Owner save(Owner owner);
//
//    Set<Owner> findAll();
}

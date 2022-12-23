package guru.springframework.javaspring_petclinic.repositories;

import guru.springframework.javaspring_petclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<Pet,Long> {
}

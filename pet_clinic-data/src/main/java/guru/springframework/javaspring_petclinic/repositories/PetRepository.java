package guru.springframework.javaspring_petclinic.repositories;

import guru.springframework.javaspring_petclinic.model.Pet;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface PetRepository extends CrudRepository<Pet, Long> {

    @Query(value = "from Pet p left join Owner o on p.owner.id = o.id where o.lastName = :lastName")
    Set<Pet>  getAllPetsOfOwner(String lastName);
}

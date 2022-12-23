package guru.springframework.javaspring_petclinic.repositories;

import guru.springframework.javaspring_petclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}

package guru.springframework.javaspring_petclinic.repositories;

import guru.springframework.javaspring_petclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}

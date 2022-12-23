package guru.springframework.javaspring_petclinic.repositories;

import guru.springframework.javaspring_petclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}

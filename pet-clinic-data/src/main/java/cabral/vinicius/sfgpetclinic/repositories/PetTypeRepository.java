package cabral.vinicius.sfgpetclinic.repositories;

import cabral.vinicius.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}

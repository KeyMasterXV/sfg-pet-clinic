package cabral.vinicius.sfgpetclinic.repositories;

import cabral.vinicius.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}

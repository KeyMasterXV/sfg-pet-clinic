package cabral.vinicius.sfgpetclinic.services.springdatajpa;

import cabral.vinicius.sfgpetclinic.model.Pet;
import cabral.vinicius.sfgpetclinic.repositories.PetRepository;
import cabral.vinicius.sfgpetclinic.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class PetSDJpa implements PetService {

    private final PetRepository petRepository;

    public PetSDJpa(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public Set<Pet> findAll() {

        Set<Pet> pets = new HashSet<>();

        petRepository.findAll().iterator().forEachRemaining(pets::add);

        return pets;
    }

    @Override
    public Pet findById(Long id) {
        return petRepository.findById(id).orElse(null);
    }

    @Override
    public Pet save(Pet object) {
        return petRepository.save(object);
    }

    @Override
    public void delete(Pet object) {
        petRepository.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        petRepository.deleteById(id);
    }
}

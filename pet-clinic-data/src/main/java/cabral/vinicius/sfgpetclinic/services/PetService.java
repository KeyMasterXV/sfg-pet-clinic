package cabral.vinicius.sfgpetclinic.services;

import cabral.vinicius.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();

}

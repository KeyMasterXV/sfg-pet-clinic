package cabral.vinicius.sfgpetclinic.services.springdatajpa;

import cabral.vinicius.sfgpetclinic.model.Owner;
import cabral.vinicius.sfgpetclinic.repositories.OwnerRepository;
import cabral.vinicius.sfgpetclinic.repositories.PetRepository;
import cabral.vinicius.sfgpetclinic.repositories.PetTypeRepository;
import cabral.vinicius.sfgpetclinic.services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class OwnerSDJpa implements OwnerService {

    private final OwnerRepository ownerRepository;
    private final PetRepository petRepository;
    private final PetTypeRepository petTypeRepository;

    public OwnerSDJpa(OwnerRepository ownerRepository, PetRepository petRepository, PetTypeRepository petTypeRepository) {
        this.ownerRepository = ownerRepository;
        this.petRepository = petRepository;
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Owner findByLastName(String lastName) {
        return ownerRepository.findByLastName(lastName);
    }

    @Override
    public Set<Owner> findAll() {

        Set<Owner> owners = new HashSet<>();

        ownerRepository.findAll().iterator().forEachRemaining(owners::add);

        return owners;
    }

    @Override
    public Owner findById(Long aLong) {

        return ownerRepository.findById(aLong).orElse(null);
    }

    @Override
    public Owner save(Owner object) {
        return ownerRepository.save(object);
    }

    @Override
    public void delete(Owner object) {
        ownerRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        ownerRepository.deleteById(aLong);
    }
}

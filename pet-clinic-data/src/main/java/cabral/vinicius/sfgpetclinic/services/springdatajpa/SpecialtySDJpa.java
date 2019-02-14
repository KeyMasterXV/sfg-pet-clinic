package cabral.vinicius.sfgpetclinic.services.springdatajpa;

import cabral.vinicius.sfgpetclinic.model.Specialty;
import cabral.vinicius.sfgpetclinic.repositories.SpecialtyRepository;
import cabral.vinicius.sfgpetclinic.services.SpecialtyService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class SpecialtySDJpa implements SpecialtyService {

    private final SpecialtyRepository specialtyRepository;

    public SpecialtySDJpa(SpecialtyRepository specialtyRepository) {
        this.specialtyRepository = specialtyRepository;
    }

    @Override
    public Set<Specialty> findAll() {

        Set<Specialty> specialties = new HashSet<>();

        specialtyRepository.findAll().iterator().forEachRemaining(specialties::add);

        return specialties;
    }

    @Override
    public Specialty findById(Long id) {
        return specialtyRepository.findById(id).orElse(null);
    }

    @Override
    public Specialty save(Specialty object) {
        return specialtyRepository.save(object);
    }

    @Override
    public void delete(Specialty object) {
        specialtyRepository.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        specialtyRepository.deleteById(id);
    }
}

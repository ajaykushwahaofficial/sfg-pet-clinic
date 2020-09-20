package sfgpetclinicweb.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import sfgpetclinicweb.model.Pet;
import sfgpetclinicweb.repositories.PetRepository;
import sfgpetclinicweb.services.PetService;

import java.util.HashSet;
import java.util.Set;
@Service
@Profile("springjpadata")
public class PetSDJpaService implements PetService {
    private final PetRepository petRepository;

    public PetSDJpaService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public Set<Pet> findAll() {
        Set<Pet> petList=new HashSet<>();
        petRepository.findAll().forEach(petList::add);
        return petList;
    }

    @Override
    public Pet save(Pet entity) {
        return petRepository.save(entity);

    }

    @Override
    public Pet findById(Long aLong) {
        return petRepository.findById(aLong).orElse(null);
    }

    @Override
    public void deleteById(Long aLong) {
        petRepository.deleteById(aLong);
    }

    @Override
    public void delete(Pet entity) {
        petRepository.delete(entity);
    }
}

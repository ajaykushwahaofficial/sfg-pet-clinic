package sfgpetclinicweb.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import sfgpetclinicweb.model.PetType;
import sfgpetclinicweb.repositories.PetTypeRepository;
import sfgpetclinicweb.services.PetTypeService;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springjpadata")
public class PetTypeSDJpaService implements PetTypeService {
    private final PetTypeRepository petTypeRepository;

    public PetTypeSDJpaService(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Set<PetType> findAll() {
        Set<PetType> petTypeList=new HashSet<>();
        petTypeRepository.findAll().forEach(petTypeList::add);
        return petTypeList;
    }

    @Override
    public PetType save(PetType entity) {
        return petTypeRepository.save(entity);
    }

    @Override
    public PetType findById(Long aLong) {
        return petTypeRepository.findById(aLong).orElse(null);
    }

    @Override
    public void deleteById(Long aLong) {
        petTypeRepository.deleteById(aLong);
    }

    @Override
    public void delete(PetType entity) {
        petTypeRepository.delete(entity);
    }
}

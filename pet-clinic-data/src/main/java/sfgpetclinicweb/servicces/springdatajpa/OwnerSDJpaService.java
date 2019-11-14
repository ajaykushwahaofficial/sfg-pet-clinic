package sfgpetclinicweb.servicces.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import sfgpetclinicweb.model.Owner;
import sfgpetclinicweb.repositories.OwnerRepository;
import sfgpetclinicweb.repositories.PetRepository;
import sfgpetclinicweb.repositories.PetTypeRepository;
import sfgpetclinicweb.servicces.OwnerService;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@Profile("ownerSpringDataJpa")
public class OwnerSDJpaService implements OwnerService {

    private final OwnerRepository ownerRepository;
    private final PetRepository petRepository;
    private final PetTypeRepository petTypeRepository;

    public OwnerSDJpaService(OwnerRepository ownerRepository, PetRepository petRepository, PetTypeRepository petTypeRepository) {
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
        Set<Owner> ownerList=new HashSet<>();
        ownerRepository.findAll().forEach(ownerList::add);
        return ownerList;
    }

    @Override
    public Owner save(Owner entity) {
        return ownerRepository.save(entity);
    }

    @Override
    public Owner findById(Long aLong) {
        Optional<Owner> owner=ownerRepository.findById(aLong);
        return (owner.isPresent()?owner.get():null);
    }

    @Override
    public void deleteById(Long aLong) {
        ownerRepository.deleteById(aLong);
    }

    @Override
    public void delete(Owner entity) {
        ownerRepository.delete(entity);
    }

}

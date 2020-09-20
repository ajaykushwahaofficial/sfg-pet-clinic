package sfgpetclinicweb.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import sfgpetclinicweb.model.Vet;
import sfgpetclinicweb.repositories.OwnerRepository;
import sfgpetclinicweb.repositories.PetRepository;
import sfgpetclinicweb.repositories.PetTypeRepository;
import sfgpetclinicweb.repositories.VetRepository;
import sfgpetclinicweb.services.VetService;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@Profile("springjpadata")
public class VetSDJpaService implements VetService {
    private final OwnerRepository ownerRepository;
    private final PetRepository petRepository;
    private final PetTypeRepository petTypeRepository;
    private final VetRepository vetRepository;

    public VetSDJpaService(OwnerRepository ownerRepository, PetRepository petRepository, PetTypeRepository petTypeRepository, VetRepository vetRepository) {
        this.ownerRepository = ownerRepository;
        this.petRepository = petRepository;
        this.petTypeRepository = petTypeRepository;
        this.vetRepository = vetRepository;
    }

    @Override
    public Set<Vet> findAll() {
        Set<Vet> vetList=new HashSet<>();
        vetRepository.findAll().forEach(vetList::add);
        return vetList;
    }

    @Override
    public Vet save(Vet entity) {
        return vetRepository.save(entity);
    }

    @Override
    public Vet findById(Long aLong) {
        Optional<Vet> vet=vetRepository.findById(aLong);
        return (vet.isPresent()?vet.get():null);
    }

    @Override
    public void deleteById(Long aLong) {
        vetRepository.deleteById(aLong);
    }

    @Override
    public void delete(Vet entity) {
        vetRepository.delete(entity);
    }
}

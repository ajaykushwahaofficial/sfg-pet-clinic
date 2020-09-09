package sfgpetclinicweb.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import sfgpetclinicweb.model.Speciality;
import sfgpetclinicweb.repositories.SpecialityRepository;
import sfgpetclinicweb.services.SpecialitiesService;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springjpadata")
public class SpecialitiesSDjpaService implements SpecialitiesService {
    private final SpecialityRepository specialityRepository;

    public SpecialitiesSDjpaService(SpecialityRepository specialityRepository) {
        this.specialityRepository = specialityRepository;
    }

    @Override
    public Set<Speciality> findAll() {
        Set<Speciality> specialities=new HashSet<>();
        specialityRepository.findAll().forEach(specialities::add);
        return specialities;
    }

    @Override
    public Speciality save(Speciality entity) {
        return specialityRepository.save(entity);
    }

    @Override
    public Speciality findById(Long aLong) {
        return specialityRepository.findById(aLong).orElse(null);
    }

    @Override
    public void deleteById(Long aLong) {
        specialityRepository.deleteById(aLong);
    }

    @Override
    public void delete(Speciality entity) {
        specialityRepository.delete(entity);
    }
}

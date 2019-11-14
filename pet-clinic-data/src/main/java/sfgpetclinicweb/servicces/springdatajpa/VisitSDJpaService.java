package sfgpetclinicweb.servicces.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import sfgpetclinicweb.model.Visit;
import sfgpetclinicweb.repositories.VisitRepository;
import sfgpetclinicweb.servicces.VisitService;

import java.util.HashSet;
import java.util.Set;
@Service
@Profile("visitSpringJpaData")
public class VisitSDJpaService implements VisitService {
    private final VisitRepository visitRepository;

    public VisitSDJpaService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Set<Visit> findAll() {
        Set<Visit> visitList=new HashSet<>();
        visitRepository.findAll().forEach(visitList::add);
        return visitList;
    }

    @Override
    public Visit save(Visit entity) {
        return visitRepository.save(entity);
    }

    @Override
    public Visit findById(Long aLong) {
        return visitRepository.findById(aLong).orElse(null);
    }

    @Override
    public void deleteById(Long aLong) {
        visitRepository.deleteById(aLong);
    }

    @Override
    public void delete(Visit entity) {
        visitRepository.delete(entity);
    }
}

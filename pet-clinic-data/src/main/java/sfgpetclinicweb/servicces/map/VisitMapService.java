package sfgpetclinicweb.servicces.map;

import org.springframework.stereotype.Service;
import sfgpetclinicweb.model.Visit;
import sfgpetclinicweb.servicces.VisitService;

import java.util.Set;

@Service
public class VisitMapService extends AbstractMapService<Visit,Long> implements VisitService {
    @Override
    public Set<Visit> findAll() {
        return super.finadAll();
    }

    @Override
    public void delete(Visit entity) {
        super.delete(entity);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Visit save(Visit entity) {
        return super.save(entity);
    }
}

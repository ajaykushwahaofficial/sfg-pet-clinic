package sfgpetclinicweb.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import sfgpetclinicweb.model.Speciality;
import sfgpetclinicweb.services.SpecialitiesService;

import java.util.Set;

@Service
@Profile({"default","map"})
public class SpecialitiesMapService extends AbstractMapService<Speciality,Long> implements SpecialitiesService{
    @Override
    public Set<Speciality> findAll() {
        return super.finadAll();
    }

    @Override
    public void delete(Speciality entity) {
        super.delete(entity);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Speciality save(Speciality entity) {
        return super.save(entity);
    }
}

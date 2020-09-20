package sfgpetclinicweb.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import sfgpetclinicweb.model.PetType;
import sfgpetclinicweb.services.PetTypeService;

import java.util.Set;

@Service
@Profile({"default","map"})
public class PetTypeMapService extends AbstractMapService<PetType,Long> implements PetTypeService {

    @Override
    public Set<PetType> findAll() {
        return super.finadAll();
    }

    @Override
    public void delete(PetType entity) {
        super.delete(entity);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }

    @Override
    public PetType save(PetType entity) {
        return super.save(entity);
    }
}

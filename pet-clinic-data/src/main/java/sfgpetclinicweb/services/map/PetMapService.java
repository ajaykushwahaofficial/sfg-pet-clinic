package sfgpetclinicweb.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import sfgpetclinicweb.model.Pet;
import sfgpetclinicweb.services.CrudService;
import sfgpetclinicweb.services.PetService;

import java.util.Set;
@Service
@Profile({"default","map"})
public class PetMapService extends AbstractMapService<Pet,Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.finadAll();
    }

    @Override
    public void delete(Pet entity) {
        super.delete(entity);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet entity) {
        return super.save(entity);
    }
}

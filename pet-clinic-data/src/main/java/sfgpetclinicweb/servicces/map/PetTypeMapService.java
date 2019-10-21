package sfgpetclinicweb.servicces.map;

import sfgpetclinicweb.model.PetType;
import sfgpetclinicweb.servicces.PetTypeService;

import java.util.Set;

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
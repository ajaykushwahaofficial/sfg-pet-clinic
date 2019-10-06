package sfgpetclinicweb.servicces.map;

import sfgpetclinicweb.model.Owner;
import sfgpetclinicweb.servicces.CrudService;

import java.util.Set;

public class OwnerMapService extends AbstractMapService<Owner,Long> implements CrudService<Owner,Long> {

    @Override
    public Set<Owner> findAll() {
        return super.finadAll();
    }

    @Override
    public void delete(Owner entity) {
        super.delete(entity);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner entity) {
        return super.save(entity.getId(),entity);
    }
}

package sfgpetclinicweb.servicces.map;

import sfgpetclinicweb.model.Vet;
import sfgpetclinicweb.servicces.CrudService;

import java.util.Set;

public class VetService extends  AbstractMapService<Vet,Long> implements CrudService<Vet,Long> {
    @Override
    public Set<Vet> findAll() {
        return super.finadAll();
    }

    @Override
    public void delete(Vet entity) {
        super.delete(entity);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet entity) {
        return super.save(entity.getId(),entity);
    }
}

package sfgpetclinicweb.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import sfgpetclinicweb.model.Owner;
import sfgpetclinicweb.services.OwnerService;
import sfgpetclinicweb.services.PetService;
import sfgpetclinicweb.services.PetTypeService;

import java.util.Set;
@Service
@Profile({"default","map"})
public class OwnerMapService extends AbstractMapService<Owner,Long> implements OwnerService {

    private final PetTypeService petTypeService;
    private final PetService petService;
    public OwnerMapService(PetTypeService petTypeService,PetService petService){
        this.petService=petService;
        this.petTypeService=petTypeService;
    }
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
        return super.save(entity);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return this.findAll().stream().filter(owner->owner.getLastName().equalsIgnoreCase(lastName)).findFirst().orElse(null);
    }
}
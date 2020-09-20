package sfgpetclinicweb.repositories;

import org.springframework.data.repository.CrudRepository;
import sfgpetclinicweb.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType,Long> {
}

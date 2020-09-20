package sfgpetclinicweb.repositories;

import org.springframework.data.repository.CrudRepository;
import sfgpetclinicweb.model.Pet;

public interface PetRepository extends CrudRepository<Pet,Long> {
}

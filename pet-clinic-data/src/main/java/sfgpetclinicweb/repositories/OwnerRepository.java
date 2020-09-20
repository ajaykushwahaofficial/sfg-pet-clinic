package sfgpetclinicweb.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import sfgpetclinicweb.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner,Long> {

    public Owner findByLastName(String lastName);
    public List<Owner> findAllByLastNameLike(String lastName);

}

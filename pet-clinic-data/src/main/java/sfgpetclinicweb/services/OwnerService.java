package sfgpetclinicweb.services;

import java.util.List;

import sfgpetclinicweb.model.Owner;

public interface OwnerService extends CrudService<Owner,Long>{
    Owner findByLastName(String lastName);
    List<Owner> findAllByLastNameLike(String lastName);
}

package sfgpetclinicweb.servicces;

import sfgpetclinicweb.model.Owner;

public interface OwnerService extends CrudService<Owner,Long>{
    OwnerService findByLastName(String lastName);
}

package sfgpetclinicweb.servicces;

import sfgpetclinicweb.model.Owner;

public interface OwnerService extends CrudService<Owner,Long>{
    Owner findByLastName(String lastName);
}

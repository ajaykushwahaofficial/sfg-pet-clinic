package sfgpetclinicweb.servicces;

import java.util.Set;

public interface OwnerService {
    OwnerService findById(Long id);
    OwnerService findByLastName(String lastName);
    OwnerService save(OwnerService ower);
    Set<OwnerService> findAll();
}

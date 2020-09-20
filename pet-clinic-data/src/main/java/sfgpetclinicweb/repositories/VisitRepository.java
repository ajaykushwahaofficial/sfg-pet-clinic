package sfgpetclinicweb.repositories;

import org.springframework.data.repository.CrudRepository;
import sfgpetclinicweb.model.Visit;

public interface VisitRepository extends CrudRepository<Visit,Long> {
}

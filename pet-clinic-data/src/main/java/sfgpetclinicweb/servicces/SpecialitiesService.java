package sfgpetclinicweb.servicces;

import org.springframework.stereotype.Service;
import sfgpetclinicweb.model.Speciality;
import sfgpetclinicweb.servicces.CrudService;

@Service
public interface SpecialitiesService extends CrudService<Speciality,Long> {
}

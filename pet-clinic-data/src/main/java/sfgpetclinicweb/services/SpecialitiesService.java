package sfgpetclinicweb.services;

import org.springframework.stereotype.Service;
import sfgpetclinicweb.model.Speciality;

@Service
public interface SpecialitiesService extends CrudService<Speciality,Long> {
}

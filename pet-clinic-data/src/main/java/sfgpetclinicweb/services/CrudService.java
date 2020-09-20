package sfgpetclinicweb.services;

import java.util.Set;

public interface CrudService<T,ID> {
    Set<T> findAll();
    T save(T entity);
    T findById(ID id);
    void deleteById(ID id);
    void delete(T entity);

}

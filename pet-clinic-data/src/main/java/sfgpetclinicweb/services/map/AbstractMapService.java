package sfgpetclinicweb.services.map;

import sfgpetclinicweb.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity,ID extends Long> {
    protected Map<Long,T> map=new HashMap<>();
    Set<T> finadAll(){
        return new HashSet<>(map.values());
    }

    T findById(ID id){
        return map.get(id);
    }

    T save(T entity){
        if(null != entity && null == entity.getId())
            entity.setId(getNextId());
        else if(null == entity){
            throw new RuntimeException("Entity can not be null");
        }
        map.put(entity.getId(),entity);
        return entity;
    }

    void delete(T entity){
        map.entrySet().removeIf(entry->entry.getValue().equals(entity));
    }

    void deleteById(ID id){
        map.remove(id);
    }

    public Long getNextId(){
        if(map.isEmpty())
            return 1L;
        else
            return Collections.max(map.keySet())+1;
    }


}

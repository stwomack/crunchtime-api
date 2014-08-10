package io.crunchtime.lib.service;

import java.io.Serializable;
import java.util.List;

public interface GenericCrudService<T, PK extends Serializable> {
	
	void save(T object);
	
	void update(T object);
	
	T findById(PK id);
	
	T loadById(PK id);
	
	List<T> findAll();

    List<T> findAll(int firstResult, int maxResults, String orderCriteria);
	
	void delete(T object);

    long getCount();
	
}

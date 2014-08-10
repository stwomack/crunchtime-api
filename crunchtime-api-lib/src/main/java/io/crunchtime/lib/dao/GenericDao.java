package io.crunchtime.lib.dao;

import java.io.Serializable;
import java.util.List;

public interface GenericDao<T, PK extends Serializable> {

	abstract PK save(T object);
	
	abstract T find(PK id);
	
	/**
	 * Just returns a 'ghost' or proxy of the object without initially hitting the database to determine
	 * if object actually exists. This is intended to be used for delete functionality without having
	 * to actually load existing object first.
	 * @param id
	 * @return
	 */
	abstract T load(PK id);
	
	/**
	 * Returns all records for this type. BE CAREFUL as there could potentially be tons of records returned.
	 * @return
	 */
	abstract List<T> findAll();

	abstract T findUniqueByProperty(String propertyName, Object value);

    abstract List<T> findAll(int firstResult, int maxResults, String sortCriteria);

    abstract void update(T object);
	
	abstract void saveOrUpdate(T object);

	abstract void delete(T object);

	abstract boolean exists(PK id);

    abstract long count();
}
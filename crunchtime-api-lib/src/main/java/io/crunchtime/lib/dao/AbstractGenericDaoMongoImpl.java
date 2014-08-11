package io.crunchtime.lib.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

public class AbstractGenericDaoMongoImpl <T, PK extends Serializable> implements GenericDao<T, PK> {

    public static final String SORT_ORDER_ASC = "ASC";
    public static final String SORT_ORDER_DESC = "DESC";

	private Class<T> type;
	
	@SuppressWarnings("unchecked")
	public AbstractGenericDaoMongoImpl() {
		this.type = (Class<T>) ((ParameterizedType) getClass()  
	        .getGenericSuperclass())
	        .getActualTypeArguments()[0];
	}


//  @Override
//	public T find(PK id) {
//  	T object = (T) getSession().get(type, id);
//  	if (object == null) {
//			throw new ObjectNotFoundException(type, "id", id);
//		}
//  	return object;
//  }
	
//  protected Session getSession() {
//  	return sessionFactory.getCurrentSession();
//  }
	
	@Override
	public PK save(T object) {
		return null;
	}

	@Override
	public T find(PK id) {
		return null;
	}

	@Override
	public T load(PK id) {
		return null;
	}

	@Override
	public List<T> findAll() {
		return null;
	}

	@Override
	public T findUniqueByProperty(String propertyName, Object value) {
		return null;
	}

	@Override
	public List<T> findAll(int firstResult, int maxResults, String sortCriteria) {
		return null;
	}
	
//    @Override
//    public List<T> findAll() {
//    	return getSession()
//    		.createCriteria(type)
//    		.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY)
//    		.list();
//    }

	@Override
	public void update(T object) {
	}

	@Override
	public void saveOrUpdate(T object) {
	}

	@Override
	public void delete(T object) {
	}

	@Override
	public boolean exists(PK id) {
		return false;
	}

	@Override
	public long count() {
		return 0;
	}
	
}

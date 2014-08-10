package io.crunchtime.lib.service;

import io.crunchtime.lib.dao.GenericDao;

import java.io.Serializable;
import java.util.List;

//@Transactional
public abstract class GenericCrudServiceImpl<T, PK extends Serializable> implements GenericCrudService<T, PK> {
	
	@Override
	public void save(T object) {
		getDao().save(object);
	}

	@Override
	public void update(T object) {
		getDao().update(object);
	}

	@Override
	public T findById(PK id) {
		return getDao().find(id);
	}

	@Override
	public T loadById(PK id) {
		return getDao().load(id);
	}

	@Override
	public List<T> findAll() {
		return getDao().findAll();
	}

    @Override
    public List<T> findAll(int firstResult, int maxResults, String orderCriteria) {
        return getDao().findAll(firstResult, maxResults, orderCriteria);
    }

    @Override
	public void delete(T object) {
		getDao().delete(object);
	}

    @Override
    public long getCount() {
        return getDao().count();
    }

    protected abstract GenericDao<T, PK> getDao();

}

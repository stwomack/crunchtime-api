package io.crunchtime.rest.resources;

import io.crunchtime.lib.service.GenericCrudService;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLEncoder;
import java.util.List;

import javax.ws.rs.core.Response;

public abstract class GenericCrudResourceImpl<T, PK extends Serializable, SERVICE extends GenericCrudService> implements GenericCrudResource<T, PK> {

	/**
	 * 
	 * @param id
	 * @return Response
	 */
	@Override
	public T getById(PK id) {
		return (T) getService().findById(id);
	}

	@Override
	public void delete(PK id) {
		T object = (T) getService().loadById(id);
		getService().delete(object);
	}

//    @Override
    public List<T> getAllWithPagination(int firstResult, int maxResults, String orderCriteria) {
        return getService().findAll(firstResult, maxResults, orderCriteria);
    }

    @Override
    public long getCount() {
        return getService().getCount();
    }

    @Override
	public Response create(T object) {
		getService().save(object);
		return Response.created(URI.create(getUTF8EncodedResponsePath(object))).entity(object).build();
	}

	@Override
	public void update(PK id, T object) {
		getService().update(object);
	}

    private String getUTF8EncodedResponsePath(T object) {
        String retVal = getCreateResponsePath(object);
        try {
            retVal = URLEncoder.encode(getCreateResponsePath(object), "UTF-8");
        } catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
            // log that
        }
        return retVal;
    }
	
	abstract SERVICE getService();
	
	/**
	 * This method should generate the restful service path to retrieve the
	 * newly created object.
	 * You can do something like the following (just an example):
	 * return "/actions/" + object.getIdentifier();
	 * @param object
	 * @return
	 */
	abstract String getCreateResponsePath(T object);

}

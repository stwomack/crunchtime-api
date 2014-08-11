package io.crunchtime.rest.resources;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Produces({ MediaType.APPLICATION_JSON })
@Consumes({ MediaType.APPLICATION_JSON })
public interface GenericCrudResource<T, PK extends Serializable> {
	
	/**
	 * 
	 * @param id
	 * @return Response
	 */
	@GET
	@Path("{id}")
	public T getById(
		@PathParam("id") 
		@NotNull(message = "id is a required field.") PK id);
	
	/**
	 * 
	 * @param id
	 * @return Response
	 */
	@DELETE
	@Path("{id}")
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN })
	public void delete(
		@PathParam("id") 
		@NotNull(message = "id is a required field.") PK id);
	
//	/**
//	 *
//	 * @return Response
//	 */
//	@GET
//	List<T> getAll();

//    @GET
//    List<T> getAllWithPagination(
//            @QueryParam("firstResult") int firstResult,
//            @QueryParam("maxResults") int maxResults,
//            @QueryParam("orderCriteria") String orderCriteria);

    @GET
    @Path("/count")
    long getCount();
	
	/**
	 * 
	 * @param object
	 * @return Response
	 */
	@POST
	public Response create(T object);
	
	/**
	 * 
	 * @param object
	 * @return Response
	 */
	@PUT
	@Path("{id}")
	public void update(
		@PathParam("id") 
		@NotNull(message = "id is a required field.") PK id,
		T object);
	
//	/**
//	 * 
//	 * @param actionType
//	 * @return Response
//	 */
//	@PUT
//	public Response createActionType(@QueryParam("id") String id, @QueryParam("name") String name);
}

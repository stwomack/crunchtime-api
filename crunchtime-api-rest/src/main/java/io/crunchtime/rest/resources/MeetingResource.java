package io.crunchtime.rest.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import javax.ws.rs.core.MediaType;

@Path("/meeting")
@Consumes({ MediaType.TEXT_HTML, MediaType.APPLICATION_XHTML_XML, MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
public interface MeetingResource {
	@GET
	Response getAllMeetings();
}

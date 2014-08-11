package io.crunchtime.rest.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/meeting")
public interface MeetingResource {
	@GET
	Response getAllMeetings();
}

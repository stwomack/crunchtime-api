package io.crunchtime.rest.resources;

import javax.ws.rs.core.Response;

public class MeetingResourceImpl implements MeetingResource {

	public Response getAllMeetings() {
		Response response = Response.ok("{Hello!}").build();

		return response;
	}
}

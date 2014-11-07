package io.crunchtime.rest.resources;

import io.crunchtime.lib.domain.Meeting;
import io.crunchtime.lib.helpers.testdata.MeetingTestDataBuilder;

import java.util.List;

import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;

public class MeetingResourceImpl implements MeetingResource {

	public Response getAllMeetings() {
		GenericEntity<List<Meeting>> entity = new GenericEntity<List<Meeting>>(
				new MeetingTestDataBuilder().buildAll()) {
		};
		return Response.ok(entity).build();
	}

}
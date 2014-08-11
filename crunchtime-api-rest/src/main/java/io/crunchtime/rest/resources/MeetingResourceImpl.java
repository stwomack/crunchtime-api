package io.crunchtime.rest.resources;

import java.util.List;

import io.crunchtime.lib.domain.Meeting;
import io.crunchtime.lib.service.MeetingService;

import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

public class MeetingResourceImpl extends
		GenericCrudResourceImpl<Meeting, String, MeetingService> implements
		MeetingResource {

	@Autowired
	private MeetingService meetingService;

	public Response getAllMeetings() {
		GenericEntity<List<Meeting>> entity = new GenericEntity<List<Meeting>>(
				meetingService.findAll()) {
		};

		System.out.println("Entity: " + entity.toString()) ;

		Response response = null;
		try {
			response = Response.ok(entity).build();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}

	@Override
	MeetingService getService() {
		return meetingService;
	}

	@Override
	String getCreateResponsePath(Meeting meeting) {
		return "/meeting/" + meeting.toString();
	}
}
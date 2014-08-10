package io.crunchtime.rest.resources;

import io.crunchtime.lib.domain.Meeting;
import io.crunchtime.lib.service.MeetingService;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

public class MeetingResourceImpl extends GenericCrudResourceImpl<Meeting, String, MeetingService >implements MeetingResource {

	@Autowired
	private MeetingService meetingService;
	
	public Response getAllMeetings() {
		Response response = Response.ok(meetingService.findAll()).build();

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
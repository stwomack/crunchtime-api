package io.crunchtime.rest.resources;

import io.crunchtime.lib.domain.meeting.Meeting;
import io.crunchtime.lib.service.MeetingService;

import java.util.List;

import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

public class MeetingResourceImpl implements MeetingResource {

	@Autowired
	private MeetingService meetingService;

	public Response getAllMeetings() {
		List<Meeting> allMeetings = meetingService.findAll();
		GenericEntity<List<Meeting>> entity = new GenericEntity<List<Meeting>>(allMeetings) {};
		return Response.ok(entity).build();
	}

}
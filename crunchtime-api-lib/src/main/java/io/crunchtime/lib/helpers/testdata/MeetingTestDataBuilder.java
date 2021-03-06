package io.crunchtime.lib.helpers.testdata;

import io.crunchtime.lib.domain.Meeting;
import io.crunchtime.lib.domain.MeetingAttendee;

import java.util.ArrayList;
import java.util.List;

public class MeetingTestDataBuilder {

	List<MeetingAttendee> meetingAttendees = new ArrayList<MeetingAttendee>();

	public List<Meeting> buildAll() {
		List<Meeting> exampleMeetings = new ArrayList<Meeting>();
		exampleMeetings.add(buildOne("Test1", "Jim", "Johnson"));
		exampleMeetings.add(buildOne("Test2", "Bob", "Robertson"));
		exampleMeetings.add(buildOne("Test3", "John", "Jimson"));
		exampleMeetings.add(buildOne("Test4", "Harry", "Harelson"));
		exampleMeetings.add(buildOne("Test5", "Mike", "Michaelson"));
		exampleMeetings.add(buildOne("Test6", "Steve", "Stevenson"));
		exampleMeetings.add(buildOne("Test7", "Mohatma", "Ghandi"));
		return exampleMeetings;
	}

	public Meeting buildOne(String topic, String firstName,
			String lastName) {
		MeetingAttendee meetingAttendee = new MeetingAttendee(firstName,
				firstName);
		meetingAttendee.getComments().add("Hello everyone!");
		meetingAttendee.getComments().add("Hello everyone!");
		meetingAttendee.getComments().add("Hello everyone!");
		meetingAttendees.add(meetingAttendee);
		Meeting meeting = new Meeting(topic, meetingAttendees);
		return meeting;
	}
}

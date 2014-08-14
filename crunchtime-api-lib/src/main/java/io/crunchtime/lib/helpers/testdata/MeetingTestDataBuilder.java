package io.crunchtime.lib.helpers.testdata;

import io.crunchtime.lib.domain.meeting.Meeting;
import io.crunchtime.lib.domain.meeting.MeetingAttendee;

import java.util.ArrayList;
import java.util.List;

public class MeetingTestDataBuilder {

	static List<MeetingAttendee> meetingAttendees = new ArrayList<MeetingAttendee>();

	public static List<Meeting> buildAll() {
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

	public static Meeting buildOne(String topic, String firstName,
			String lastName) {
		MeetingAttendee meetingAttendee = new MeetingAttendee(firstName,
				firstName);
		meetingAttendees.add(meetingAttendee);
		Meeting meeting = new Meeting(topic, meetingAttendees);
		return meeting;
	}
}

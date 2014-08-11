package io.crunchtime.lib.helpers.testdata;

import io.crunchtime.lib.domain.Meeting;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class MeetingTestDataBuilder {

	public static List<Meeting> buildAll() {
		List<Meeting> exampleMeetings = new ArrayList<Meeting>();
		exampleMeetings.add(buildOne("Test1"));
		exampleMeetings.add(buildOne("Test2"));
		exampleMeetings.add(buildOne("Test3"));
		exampleMeetings.add(buildOne("Test4"));
		exampleMeetings.add(buildOne("Test5"));
		exampleMeetings.add(buildOne("Test6"));
		exampleMeetings.add(buildOne("Test7"));
		System.err.println("Hello, yes this is getting called. Motherfucker!");
		return exampleMeetings;
	}

	public static Meeting buildOne(String topic) {
		Meeting meeting = new Meeting(topic, new GregorianCalendar(), new GregorianCalendar());
		return meeting;
	}
}

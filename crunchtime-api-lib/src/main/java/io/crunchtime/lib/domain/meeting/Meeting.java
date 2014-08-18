package io.crunchtime.lib.domain.meeting;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = false)
public class Meeting implements Serializable {

	private static final long serialVersionUID = 5166689201559547513L;

	String id;

	@NotNull
	String topic;

	MeetingStatus meetingStatus;

	List<MeetingAttendee> meetingAttendees;

	public Meeting(String topic, List<MeetingAttendee> meetingAttendees) {
		id = UUID.randomUUID().toString();
		meetingStatus = MeetingStatus.NEW;
		this.topic = topic;
		this.meetingAttendees = meetingAttendees;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public MeetingStatus getMeetingStatus() {
		return meetingStatus;
	}

	public void setMeetingStatus(MeetingStatus meetingStatus) {
		this.meetingStatus = meetingStatus;
	}

	public List<MeetingAttendee> getMeetingAttendees() {
		return meetingAttendees;
	}

	public void setMeetingAttendees(List<MeetingAttendee> meetingAttendees) {
		this.meetingAttendees = meetingAttendees;
	}

	@Override
	public String toString() {
		return "Meeting [id=" + id + ", topic=" + topic + ", meetingStatus="
				+ meetingStatus + ", meetingAttendees=" + meetingAttendees
				+ "]";
	}
	
}

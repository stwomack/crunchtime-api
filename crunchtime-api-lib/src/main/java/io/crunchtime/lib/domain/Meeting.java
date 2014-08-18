package io.crunchtime.lib.domain;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = false)
public class Meeting extends CrunchtimeSerializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 987348484607973133L;

	@NotNull
	String topic;

	MeetingStatus meetingStatus;

	List<MeetingAttendee> meetingAttendees;

	public Meeting(String topic, List<MeetingAttendee> meetingAttendees) {
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

package io.crunchtime.lib.domain.meeting;

import io.crunchtime.lib.domain.meeting.chat.ChatRoom;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown=false)
public class Meeting {

	String id;

	@NotNull
	String topic;

	MeetingStatus meetingStatus;

	List<MeetingAttendee> meetingAttendees;
	
	ChatRoom chatRoom;

	public Meeting() {	}
	
	
	public Meeting(String topic, List<MeetingAttendee> meetingAttendees) {
		super();
		this.topic = topic;
		this.meetingAttendees = meetingAttendees;
		this.chatRoom = new ChatRoom();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public ChatRoom getChatRoom() {
		return chatRoom;
	}

	public void setChatRoom(ChatRoom chatRoom) {
		this.chatRoom = chatRoom;
	}

}

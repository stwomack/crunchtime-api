package io.crunchtime.lib.domain;

import java.util.Calendar;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Meeting {

	String id;

	@NotNull
	String topic;

	@NotNull
	Calendar startTime;

	@NotNull
	Calendar endTime;

	@NotNull
	String location;

	String conferenceBridge;

	String conferenceWebLink;

	List<String> comments;

	public Meeting(String topic, Calendar startTime, Calendar endTime) {
		super();
		this.topic = topic;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Calendar getStartTime() {
		return startTime;
	}

	public void setStartTime(Calendar startTime) {
		this.startTime = startTime;
	}

	public Calendar getEndTime() {
		return endTime;
	}

	public void setEndTime(Calendar endTime) {
		this.endTime = endTime;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getConferenceBridge() {
		return conferenceBridge;
	}

	public void setConferenceBridge(String conferenceBridge) {
		this.conferenceBridge = conferenceBridge;
	}

	public String getConferenceWebLink() {
		return conferenceWebLink;
	}

	public void setConferenceWebLink(String conferenceWebLink) {
		this.conferenceWebLink = conferenceWebLink;
	}

	public List<String> getComments() {
		return comments;
	}

	public void setComments(List<String> comments) {
		this.comments = comments;
	}

}

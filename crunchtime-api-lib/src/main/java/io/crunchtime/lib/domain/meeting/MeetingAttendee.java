package io.crunchtime.lib.domain.meeting;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = false)
public class MeetingAttendee implements Serializable {

	private static final long serialVersionUID = 9184097907914500115L;

	String id;

	@NotNull
	String firstName;

	@NotNull
	String lastName;
	
	List<String> comments;

	public MeetingAttendee(String firstName, String lastName) {
		id = UUID.randomUUID().toString();
		comments = new ArrayList<String>();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<String> getComments() {
		return comments;
	}

	public void setComments(List<String> comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "MeetingAttendee [id=" + id + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", comments=" + comments + "]";
	}
	
}

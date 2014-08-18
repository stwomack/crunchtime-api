package io.crunchtime.lib.domain;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.json.JSONObject;

public class MeetingAttendee extends CrunchtimeSerializable {

	private static final long serialVersionUID = 9184097907914500115L;

	@NotNull
	String firstName;

	@NotNull
	String lastName;
	
	List<String> comments;

	public MeetingAttendee(String firstName, String lastName) {
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

	@Override
	public String toString() {
		return new JSONObject(this).toString();
	}
	
}

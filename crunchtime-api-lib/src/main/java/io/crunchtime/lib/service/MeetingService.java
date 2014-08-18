package io.crunchtime.lib.service;

import java.util.List;

import io.crunchtime.lib.domain.Meeting;

public interface MeetingService {
	
	public void create(Meeting meeting);
	
	public List<Meeting> findAll();
}

package io.crunchtime.lib.service;

import io.crunchtime.lib.dao.GenericDao;
import io.crunchtime.lib.dao.MeetingDao;
import io.crunchtime.lib.domain.Meeting;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("meetingService")
public class MeetingServiceImpl extends
		GenericCrudServiceImpl<Meeting, String> implements
		MeetingService {

	private static Logger logger = Logger
			.getLogger(MeetingServiceImpl.class);
	
	@Autowired
	private MeetingDao meetingDao;

	@Override
	protected GenericDao<Meeting, String> getDao() {
		return meetingDao;
	}
}

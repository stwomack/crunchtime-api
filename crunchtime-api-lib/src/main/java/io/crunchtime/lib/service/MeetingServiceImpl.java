package io.crunchtime.lib.service;

import io.crunchtime.lib.dao.RedisDao;
import io.crunchtime.lib.domain.meeting.Meeting;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("meetingService")
public class MeetingServiceImpl implements MeetingService {

	private static final String MEETINGS_CHANNEL = "meetings";

	private static Logger logger = Logger.getLogger(MeetingServiceImpl.class);

	@Autowired
	private RedisDao<Meeting> redisDao;

	@Override
	public void createMeeting(Meeting meeting) {
		redisDao.saveAndSendToBroker(MEETINGS_CHANNEL, meeting);
	};

}

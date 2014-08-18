package io.crunchtime.lib.service;

import java.util.List;

import io.crunchtime.lib.dao.RedisDao;
import io.crunchtime.lib.domain.Meeting;
import io.crunchtime.lib.helpers.testdata.MeetingTestDataBuilder;

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
	public void create(Meeting meeting) {
		logger.info(meeting.toString());
		redisDao.saveAndSendToBroker(MEETINGS_CHANNEL, meeting);
	}

	@Override
	public List<Meeting> findAll() {
		return new MeetingTestDataBuilder().buildAll();
	};

}

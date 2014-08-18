package io.crunchtime.lib.dao;

import io.crunchtime.lib.domain.Meeting;
import io.crunchtime.lib.helpers.testdata.MeetingTestDataBuilder;
import io.crunchtime.lib.test.IntegrationTest;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

@SuppressWarnings({"rawtypes", "unchecked"})
public class RedisDaoImpl_IT extends IntegrationTest {

	@Autowired
	RedisDao redisDao;

	@Test
	public void saveAndSendToBroker() {
		Meeting meeting = new MeetingTestDataBuilder().buildOne("testMeeting", "Steve", "Womack");
		System.err.println(meeting.toString());
		redisDao.saveAndSendToBroker(meeting.getTopic(), meeting);
	}
}

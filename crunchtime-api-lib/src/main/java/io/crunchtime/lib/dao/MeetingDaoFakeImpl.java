package io.crunchtime.lib.dao;

import java.util.List;

import io.crunchtime.lib.domain.meeting.Meeting;
import io.crunchtime.lib.helpers.testdata.MeetingTestDataBuilder;

import org.springframework.stereotype.Repository;

@Repository("meetingDaoMongoImpl")
public class MeetingDaoFakeImpl extends AbstractGenericDaoFakeImpl<Meeting, String> implements MeetingDao {

	@Override
	//TODO remove me when findAll, etc are implemented in AbstractGenericDaoMongoImpl
	public List<Meeting> findAll() {
		return MeetingTestDataBuilder.buildAll();
	}

}

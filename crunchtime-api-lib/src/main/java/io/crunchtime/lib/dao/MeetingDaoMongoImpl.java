package io.crunchtime.lib.dao;

import java.util.List;

import io.crunchtime.lib.domain.Meeting;
import io.crunchtime.lib.helpers.testdata.MeetingTestDataBuilder;

import org.springframework.stereotype.Repository;

@Repository("meetingDaoMongoImpl")
public class MeetingDaoMongoImpl extends AbstractGenericDaoMongoImpl<Meeting, String> implements MeetingDao {

	@Override
	//TODO remove me when findAll, etc are implemented in AbstractGenericDaoMongoImpl
	public List<Meeting> findAll() {
		return MeetingTestDataBuilder.buildAll();
	}

}

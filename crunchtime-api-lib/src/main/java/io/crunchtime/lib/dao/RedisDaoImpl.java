package io.crunchtime.lib.dao;

import io.crunchtime.lib.service.MeetingServiceImpl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

@SuppressWarnings({"rawtypes", "unchecked"})
@Repository("redisDao")
public class RedisDaoImpl implements RedisDao {

	private static Logger logger = Logger
			.getLogger(MeetingServiceImpl.class);
	
	@Autowired
	RedisTemplate redisTemplate;

	public void saveAndSendToBroker(String channel, String name,
			String message) {
		String fullMessage = name + " : " + message;
		logger.info("Saving: " + fullMessage);
		redisTemplate.opsForValue().append(channel, fullMessage);
		redisTemplate.convertAndSend(channel, fullMessage);
	}
}

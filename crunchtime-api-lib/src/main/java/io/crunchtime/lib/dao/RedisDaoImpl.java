package io.crunchtime.lib.dao;

import java.io.Serializable;

import org.apache.log4j.Logger;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

@SuppressWarnings({"rawtypes", "unchecked"})
@Repository("redisDao")
public class RedisDaoImpl implements RedisDao {

	private static Logger logger = Logger
			.getLogger(RedisDaoImpl.class);
	
	@Autowired
	RedisTemplate redisTemplate;

	@Override
	public void saveAndSendToBroker(String channel, Serializable domainObject) {
		String jsonString = new JSONObject(domainObject).toString();
		logger.info("Sending: " + jsonString);
		redisTemplate.convertAndSend(channel, jsonString);
		redisTemplate.opsForValue().append(channel, jsonString);
	}


}

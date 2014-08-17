package io.crunchtime.lib.dao;

import io.crunchtime.lib.test.IntegrationTest;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

@SuppressWarnings({})
public class RedisDaoImpl_IT extends IntegrationTest {


	@Autowired
	RedisDaoImpl redisDao;

	@Test
	public void saveAndSendToBroker() {
		redisDao.saveAndSendToBroker("test", "test-guy", "Hello there, Redis!");
	}
}

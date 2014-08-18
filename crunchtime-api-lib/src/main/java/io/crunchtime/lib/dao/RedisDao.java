package io.crunchtime.lib.dao;

import java.io.Serializable;

public interface RedisDao<T extends Serializable> {

	public abstract void saveAndSendToBroker(String channel, T domainObject);

}

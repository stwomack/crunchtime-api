package io.crunchtime.lib.dao;

import io.crunchtime.lib.domain.CrunchtimeSerializable;

public interface RedisDao<T extends CrunchtimeSerializable> {

	public abstract void saveAndSendToBroker(String channel, T domainObject);

}

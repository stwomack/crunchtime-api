package io.crunchtime.lib.domain;

import java.io.Serializable;
import java.util.UUID;

public abstract class CrunchtimeSerializable implements Serializable {
	
	private static final long serialVersionUID = 1L;
	String id;

	public CrunchtimeSerializable() {
		id = UUID.randomUUID().toString();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}

package com.tmdt.domain;
/**
 * <p>Domain class cho table QUYEN_TRUY_CAP</p>
 * @author ttlang
 *
 */

import java.util.Map;

public class Permission {
	private Map<User, Role>permistions;

	public Permission(Map<User, Role> permistions) {
		super();
		this.permistions = permistions;
	}

	
	public Map<User, Role> getPermistions() {
		return permistions;
	}


	public void setPermistions(Map<User, Role> permistions) {
		this.permistions = permistions;
	}


	@Override
	public String toString() {
		return "Permission [permistions=" + permistions + "]";
	}
	
	

	

}

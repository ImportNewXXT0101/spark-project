package com.xxt.sparkproject.domain;

import lombok.Data;

/**
 * top10活跃session
 */
@Data
public class Top10Session {

	private long taskid;
	private long categoryid;
	private String sessionid;
	private long clickCount;
	
}

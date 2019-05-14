package com.xxt.sparkproject.domain;

import lombok.Data;

/**
 * top10品类
 */
@Data
public class Top10Category {

	private long taskid;
	private long categoryid;
	private long clickCount;
	private long orderCount;
	private long payCount;
	
}

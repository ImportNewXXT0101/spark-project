package com.xxt.sparkproject.domain;

import lombok.Data;

/**
 * 用户广告点击量
 */
@Data
public class AdUserClickCount {

	private String date;
	private long userid;
	private long adid;
	private long clickCount;
	
}

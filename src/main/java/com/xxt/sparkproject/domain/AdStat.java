package com.xxt.sparkproject.domain;

import lombok.Data;

/**
 * 广告实时统计
 * @author Administrator
 *
 */
@Data
public class AdStat {

	private String date;
	private String province;
	private String city;
	private long adid;
	private long clickCount;
	
}

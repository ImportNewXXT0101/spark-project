package com.xxt.sparkproject.domain;

import lombok.Data;

/**
 * 广告点击趋势
 */
@Data
public class AdClickTrend {

	private String date;
	private String hour;
	private String minute;
	private long adid;
	private long clickCount;
	
}

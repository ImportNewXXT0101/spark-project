package com.xxt.sparkproject.domain;

import lombok.Data;

/**
 * 各省top3热门广告
 */
@Data
public class AdProvinceTop3 {

	private String date;
	private String province;
	private long adid;
	private long clickCount;
	
}

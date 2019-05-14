package com.xxt.sparkproject.domain;

import lombok.Data;

/**
 * 各区域top3热门商品
 */
@Data
public class AreaTop3Product {

	private long taskid;
	private String area;
	private String areaLevel;
	private long productid;
	private String cityInfos;
	private long clickCount;
	private String productName;
	private String productStatus;
	
}

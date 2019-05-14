package com.xxt.sparkproject.domain;

import lombok.Data;

/**
 * Session明细
 */
@Data
public class SessionDetail {

	private long taskid;
	private long userid;
	private String sessionid;
	private long pageid;
	private String actionTime;
	private String searchKeyword;
	private long clickCategoryId;
	private long clickProductId;
	private String orderCategoryIds;
	private String orderProductIds;
	private String payCategoryIds;
	private String payProductIds;
	
}

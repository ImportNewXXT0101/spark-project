package com.xxt.sparkproject.domain;

import lombok.Data;

/**
 * 随机抽取的session
 */
@Data
public class SessionRandomExtract {

	private long taskid;
	private String sessionid;
	private String startTime;
	private String searchKeywords;
	private String clickCategoryIds;
	
}

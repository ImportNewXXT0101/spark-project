package com.xxt.sparkproject.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * 任务
 */
@Data
public class Task implements Serializable {
	
	private static final long serialVersionUID = 3518776796426921776L;

	private long taskid;
	private String taskName;
	private String createTime;
	private String startTime;
	private String finishTime;
	private String taskType;
	private String taskStatus;
	private String taskParam;

}

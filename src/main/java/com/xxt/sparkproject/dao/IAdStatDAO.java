package com.xxt.sparkproject.dao;

import java.util.List;

import com.xxt.sparkproject.domain.AdStat;

/**
 * 广告实时统计DAO接口
 *
 */
public interface IAdStatDAO {

	void updateBatch(List<AdStat> adStats);
	
}

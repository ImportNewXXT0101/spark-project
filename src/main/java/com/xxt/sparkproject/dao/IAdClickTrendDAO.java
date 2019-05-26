package com.xxt.sparkproject.dao;

import java.util.List;

import com.xxt.sparkproject.domain.AdClickTrend;

/**
 * 广告点击趋势DAO接口
 *
 */
public interface IAdClickTrendDAO {

	void updateBatch(List<AdClickTrend> adClickTrends);
	
}

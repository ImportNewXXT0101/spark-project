package com.xxt.sparkproject.dao;

import java.util.List;

import com.xxt.sparkproject.domain.AdProvinceTop3;

/**
 * 各省份top3热门广告DAO接口
 *
 */
public interface IAdProvinceTop3DAO {

	void updateBatch(List<AdProvinceTop3> adProvinceTop3s);
	
}

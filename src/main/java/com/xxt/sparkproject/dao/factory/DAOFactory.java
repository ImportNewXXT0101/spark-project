package com.xxt.sparkproject.dao.factory;

import com.xxt.sparkproject.dao.IAdBlacklistDAO;
import com.xxt.sparkproject.dao.IAdClickTrendDAO;
import com.xxt.sparkproject.dao.IAdProvinceTop3DAO;
import com.xxt.sparkproject.dao.IAdStatDAO;
import com.xxt.sparkproject.dao.IAdUserClickCountDAO;
import com.xxt.sparkproject.dao.IAreaTop3ProductDAO;
import com.xxt.sparkproject.dao.IPageSplitConvertRateDAO;
import com.xxt.sparkproject.dao.ISessionAggrStatDAO;
import com.xxt.sparkproject.dao.ISessionDetailDAO;
import com.xxt.sparkproject.dao.ISessionRandomExtractDAO;
import com.xxt.sparkproject.dao.ITaskDAO;
import com.xxt.sparkproject.dao.ITop10CategoryDAO;
import com.xxt.sparkproject.dao.ITop10SessionDAO;
import com.xxt.sparkproject.dao.impl.AdBlacklistDAOImpl;
import com.xxt.sparkproject.dao.impl.AdClickTrendDAOImpl;
import com.xxt.sparkproject.dao.impl.AdProvinceTop3DAOImpl;
import com.xxt.sparkproject.dao.impl.AdStatDAOImpl;
import com.xxt.sparkproject.dao.impl.AdUserClickCountDAOImpl;
import com.xxt.sparkproject.dao.impl.AreaTop3ProductDAOImpl;
import com.xxt.sparkproject.dao.impl.PageSplitConvertRateDAOImpl;
import com.xxt.sparkproject.dao.impl.SessionAggrStatDAOImpl;
import com.xxt.sparkproject.dao.impl.SessionDetailDAOImpl;
import com.xxt.sparkproject.dao.impl.SessionRandomExtractDAOImpl;
import com.xxt.sparkproject.dao.impl.TaskDAOImpl;
import com.xxt.sparkproject.dao.impl.Top10CategoryDAOImpl;
import com.xxt.sparkproject.dao.impl.Top10SessionDAOImpl;

/**
 * DAO工厂类
 *
 */
public class DAOFactory {


	public static ITaskDAO getTaskDAO() {
		return new TaskDAOImpl();
	}

	public static ISessionAggrStatDAO getSessionAggrStatDAO() {
		return new SessionAggrStatDAOImpl();
	}
	
	public static ISessionRandomExtractDAO getSessionRandomExtractDAO() {
		return new SessionRandomExtractDAOImpl();
	}
	
	public static ISessionDetailDAO getSessionDetailDAO() {
		return new SessionDetailDAOImpl();
	}
	
	public static ITop10CategoryDAO getTop10CategoryDAO() {
		return new Top10CategoryDAOImpl();
	}
	
	public static ITop10SessionDAO getTop10SessionDAO() {
		return new Top10SessionDAOImpl();
	}
	
	public static IPageSplitConvertRateDAO getPageSplitConvertRateDAO() {
		return new PageSplitConvertRateDAOImpl();
	}
	
	public static IAreaTop3ProductDAO getAreaTop3ProductDAO() {
		return new AreaTop3ProductDAOImpl();
	}
	
	public static IAdUserClickCountDAO getAdUserClickCountDAO() {
		return new AdUserClickCountDAOImpl();
	}
	
	public static IAdBlacklistDAO getAdBlacklistDAO() {
		return new AdBlacklistDAOImpl();
	}
	
	public static IAdStatDAO getAdStatDAO() {
		return new AdStatDAOImpl();
	}
	
	public static IAdProvinceTop3DAO getAdProvinceTop3DAO() {
		return new AdProvinceTop3DAOImpl();
	}
	
	public static IAdClickTrendDAO getAdClickTrendDAO() {
		return new AdClickTrendDAOImpl();
	}
	
}

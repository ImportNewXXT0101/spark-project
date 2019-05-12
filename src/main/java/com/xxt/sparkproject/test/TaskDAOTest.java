package com.xxt.sparkproject.test;

import com.xxt.sparkproject.dao.ITaskDAO;
import com.xxt.sparkproject.dao.factory.DAOFactory;
import com.xxt.sparkproject.domain.Task;

/**
 * 任务管理DAO测试类
 *
 */
public class TaskDAOTest {
	
	public static void main(String[] args) {
		ITaskDAO taskDAO = DAOFactory.getTaskDAO();
		Task task = taskDAO.findById(2);
		System.out.println(task.getTaskName());  
	}
	
}

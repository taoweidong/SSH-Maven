package com.taowd.pms.base;

import java.util.List;

import com.taowd.pms.domain.User;

/**
 * 
 * @author Taowd
 *
 * @param <T>
 */
public interface BaseDao<T> {

	/**
	 * 
	 * Author:Taowd 功能：保存实体 开发日期：2017-12-22-上午10:45:49
	 * 
	 * @param entry
	 */
	void save(T entry);

	/**
	 * 
	 * Author:Taowd 功能：删除实体 开发日期：2017-12-22-上午10:46:15
	 * 
	 * @param id
	 */
	void delete(String id);

	/**
	 * 查询所有信息
	 * 
	 * @return
	 */
	List<User> findAll();

	/**
	 * 
	 * Author:Taowd 功能：更新实体 开发日期：2017-12-22-上午10:46:39
	 * 
	 * @param t
	 */
	void update(T t);

	/**
	 * 
	 * Author:Taowd 功能：根据id查询单个实体 开发日期：2017-12-22-上午10:47:06
	 * 
	 * @param id
	 * @return
	 */
	T getById(String id);

}

package com.taowd.pms.service;

import com.taowd.pms.base.BaseDao;
import com.taowd.pms.domain.User;

/**
 * 
 * @author Taowd
 *
 */
public interface UserService extends BaseDao<User> {

	/**
	 * 清空表中的数据
	 */
	void clear();

}

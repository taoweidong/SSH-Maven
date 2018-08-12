package com.taowd.pms.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.taowd.pms.base.BaseDaoImpl;
import com.taowd.pms.domain.User;
import com.taowd.pms.service.UserService;

/**
 * 
 * @author Taowd 让checked（可查异常）例外也回滚
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl extends BaseDaoImpl<User> implements UserService {

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		getSession().createQuery("DELETE User WHERE 1=1").executeUpdate();
	}

}

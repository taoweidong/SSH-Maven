package com.taowd.pms.test;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.taowd.pms.domain.User;

/**
 * 
 * @author Taowd
 *
 */
@Service("testServer")
@SuppressWarnings("unchecked")
public class TestServer {

	private static final Logger logger = LoggerFactory.getLogger(TestServer.class);
	@Resource
	private SessionFactory sessionFactory;

	/**
	 * 让checked（可查异常）例外也回滚
	 */
	@Transactional(rollbackFor = Exception.class)
	public void saveUser() {

		Session session = sessionFactory.getCurrentSession();
		int count = 10;
		for (int i = 0; i < count; i++) {
			User user = new User();
			// user.setId(UUID.randomUUID().toString());
			user.setName("test_" + i);
			user.setAge(i + count);
			user.setSex("M");

			session.save(user);
		}

		logger.info("Add Success!");

	}

	/**
	 * 让checked（可查异常）例外也回滚
	 */
	@Transactional(rollbackFor = Exception.class)
	public List<User> findAll() {
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("FROM User").list();

	}

}

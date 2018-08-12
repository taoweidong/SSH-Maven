package com.taowd.pms.test;

import java.util.List;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.taowd.pms.domain.User;

/**
 * 
 * @author Taowd
 *
 */
public class SpringTest {

	private static final Logger logger = LoggerFactory.getLogger(SpringTest.class);

	private ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

	@Test
	public void testSessionFactory() {
		SessionFactory sessionFactory = (SessionFactory) ac.getBean("sessionFactory");

		logger.info(sessionFactory.toString());

	}

	@Test
	public void addUser() {
		try {
			TestServer testServer = (TestServer) ac.getBean("testServer");
			testServer.saveUser();
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("添加出错", e);
		}

	}

	@Test
	public void queryUser() {
		TestServer testServer = (TestServer) ac.getBean("testServer");
		List<User> userList = testServer.findAll();
		for (User user : userList) {
			System.out.println(user.toString());
		}
	}
}

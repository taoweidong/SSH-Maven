package com.taowd.pms.base;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.taowd.pms.domain.User;

/**
 * 
 * @author Taowd 让checked（可查异常）例外也回滚
 * @param <T>
 */
@SuppressWarnings("unchecked")
@Transactional(rollbackFor = Exception.class)
public class BaseDaoImpl<T> implements BaseDao<T> {

	@Resource
	private SessionFactory sessionFactory;

	private Class<T> clazz;

	public BaseDaoImpl() {
		// 使用反射获取泛型的真实类型
		ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
		this.clazz = (Class<T>) pt.getActualTypeArguments()[0];

	}

	/**
	 * 
	 * Author:Taowd 功能：获取当前Session对象，可供子类调用 开发日期：2017-12-22-上午11:23:29
	 * 
	 * @return
	 */
	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void save(T entry) {
		getSession().save(entry);
	}

	@Override
	public void delete(String id) {
		getSession().delete(id);
	}

	@Override
	public void update(T entry) {
		getSession().update(entry);
	}

	@Override
	public T getById(String id) {
		if (StringUtils.isEmpty(id)) {
			return null;
		} else {
			return (T) getSession().get(clazz, id);
		}
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return getSession().createQuery("FROM " + clazz.getSimpleName()).list();
	}

}

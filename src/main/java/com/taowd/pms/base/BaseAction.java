package com.taowd.pms.base;

import java.lang.reflect.ParameterizedType;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.taowd.pms.service.UserService;

/**
 * 
 * @author Taowd
 *
 * @param <T>
 */
@SuppressWarnings("unchecked")
public class BaseAction<T> extends ActionSupport implements ModelDriven<T> {

	private static final long serialVersionUID = 1L;

	/**
	 * ModelDriver封装
	 */
	public BaseAction() {
		try {
			// 使用反射获取泛型的真实类型
			ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
			Class<T> clazz = (Class<T>) pt.getActualTypeArguments()[0];
			// new 一个新对象
			model = clazz.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

	}

	protected T model;

	@Override
	public T getModel() {
		return model;
	}

	// =================>Services实例的声明
	@Resource
	protected UserService userService;

}

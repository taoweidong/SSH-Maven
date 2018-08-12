package com.taowd.pms.domain;

/**
 * 
 * @author Taowd
 *
 */
public class User {

	private String id;
	private String name;
	private String sex;
	private int age;

	public final String getId() {
		return id;
	}

	public final void setId(String id) {
		this.id = id;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final String getSex() {
		return sex;
	}

	public final void setSex(String sex) {
		this.sex = sex;
	}

	public final int getAge() {
		return age;
	}

	public final void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}

}

package com.taowd.pms.action;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.taowd.pms.base.BaseAction;
import com.taowd.pms.domain.User;

/**
 * 
 * @author Taowd
 *
 */
@Controller
@Scope("prototype")
public class Hello extends BaseAction<User> {

	private static final long serialVersionUID = -5084591841191486419L;

	public String clear() throws Exception {
		userService.clear();

		List<User> userList = userService.findAll();

		for (User user : userList) {
			System.out.println(user.toString());
		}

		ActionContext.getContext().put("success", "清除数据成功！");
		ActionContext.getContext().put("userList", userList);

		return "test001";
	}

	public String test() throws Exception {

		System.out.println(model.getName());
		userService.save(model);

		List<User> userList = userService.findAll();

		for (User user : userList) {
			System.out.println(user.toString());
		}

		ActionContext.getContext().put("success", "添加成功！");
		ActionContext.getContext().put("userList", userList);

		return "test001";
	}

	public String test001() throws Exception {
		int count = 10;
		for (int i = 0; i < count; i++) {
			User user = new User();
			// user.setId(UUID.randomUUID().toString());
			user.setName("test_" + i);
			user.setAge(i + count);
			user.setSex("M");

			userService.save(user);
		}

		List<User> userList = userService.findAll();

		for (User user : userList) {
			System.out.println(user.toString());
		}

		ActionContext.getContext().put("success", "添加成功！");
		ActionContext.getContext().put("userList", userList);
		;

		return "test001";
	}

	@Override
	public void validate() {
		// if (model.getName() == null || "".equals(model.getName())) {
		// this.addFieldError("userName", "姓名不能为空");
		// }

	}

}

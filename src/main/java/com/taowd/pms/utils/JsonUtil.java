package com.taowd.pms.utils;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.annotation.Resource;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.taowd.pms.service.UserService;

/**
 * 
 * @author Taowd<br>
 *         功 能：将数据集转成JSON串 <br>
 *         编写时间：2017-4-25-下午7:31:34
 */
public class JsonUtil {

	@Resource
	protected UserService userService;

	/**
	 * 功能：数据集封装在json数组中
	 * 
	 * @param rs
	 * @return
	 * @throws Exception
	 */
	public static JSONArray formatRsToJsonArray(ResultSet rs) throws Exception {
		// 得到ResultSet对象中列类型和属性信息对象
		ResultSetMetaData md = rs.getMetaData();
		// 得到列总数
		int num = md.getColumnCount();
		// 得到json数组对象
		JSONArray array = new JSONArray();
		while (rs.next()) {
			// Json对象
			JSONObject mapOfColValues = new JSONObject();
			for (int i = 1; i <= num; i++) {
				Object o = rs.getObject(i);
				if (o instanceof Date) {
					mapOfColValues.put(md.getColumnName(i), DateUtil.formatDate((Date) o, "yyyy-MM-dd"));
				} else {
					mapOfColValues.put(md.getColumnName(i), rs.getObject(i));
				}
			}
			// json数组添加json对象
			array.add(mapOfColValues);
		}

		return array;
	}

}

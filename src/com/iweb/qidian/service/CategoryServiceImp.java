package com.iweb.qidian.service;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.iweb.qidian.model.Category;
import com.iweb.qidian.utils.JdbcUtil;

public class CategoryServiceImp implements CategoryServiceI {

	@Override
	public List<Category> selectAllCategory() {
		String sql = "select * from category";
		List<Category> cateList = new ArrayList<>();
		ResultSet result = JdbcUtil.select(sql);
		try{
			while(result.next()){
				Category cate = new Category();
				cate.setCno(result.getInt(1));
				cate.setCname(result.getString(2));
				cateList.add(cate);
			}
			return cateList;
		}catch(Exception e){
			return null;
		}
	}

}

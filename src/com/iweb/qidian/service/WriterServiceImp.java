package com.iweb.qidian.service;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.iweb.qidian.model.Writer;
import com.iweb.qidian.utils.JdbcUtil;

public class WriterServiceImp implements WriterServiceI{

	@Override
	public List<Writer> selectAllWriter() {
		List<Writer> writerList = new ArrayList<>();
		String sql = "select * from writer";
		ResultSet result = JdbcUtil.select(sql);
		
		try{
			
			while(result.next()){
				Writer writer = new Writer();
				writer.setWno(result.getInt(1));
				writer.setWname(result.getString(2));
				writer.setWaccount(result.getString(3));
				writer.setWpasswd(result.getString(4));
				writer.setCreatetime(result.getTimestamp(5));
				writer.setIssign(result.getInt(6));
				writerList.add(writer);
				
			}
			return writerList;
		}catch(Exception e){
			return null;
		}
	}

}

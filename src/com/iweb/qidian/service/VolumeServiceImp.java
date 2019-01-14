package com.iweb.qidian.service;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.iweb.qidian.model.Volume;
import com.iweb.qidian.utils.JdbcUtil;

public class VolumeServiceImp implements VolumeServiceI{

	@Override
	public List<Volume> selectAllVolume(String bno) {
		List<Volume> volumeList = new ArrayList<>();
		String sql = "select * from volume where bno="+bno;
		ResultSet result = JdbcUtil.select(sql);
		try{
				while(result.next()){
					Volume volume = new Volume();
					volume.setVno(result.getInt(1));
					volume.setVname(result.getString(2));
					volume.setBno(result.getInt(3));
					volume.setChaptercount(result.getInt(4));
					volume.setChaptercount(result.getInt(5));
					volume.setCreatetime(result.getTimestamp(6));
					//volume.setState(result.getInt(7));
					volumeList.add(volume);
				}
			return volumeList;
		}catch(Exception e){
			
			return null;
		}
		
		
	}

}

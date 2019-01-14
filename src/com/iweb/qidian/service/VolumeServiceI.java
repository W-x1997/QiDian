package com.iweb.qidian.service;

import java.util.List;

import com.iweb.qidian.model.Volume;

public interface VolumeServiceI {
	List<Volume> selectAllVolume(String bno);
}

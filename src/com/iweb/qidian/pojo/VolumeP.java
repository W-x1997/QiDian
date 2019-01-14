package com.iweb.qidian.pojo;

import java.util.ArrayList;
import java.util.List;

import com.iweb.qidian.model.Chapter;
import com.iweb.qidian.model.Volume;

public class VolumeP extends Volume {
	private List<Chapter> chapterList = new ArrayList<>();

	public List<Chapter> getChapterList() {
		return chapterList;
	}

	public void setChapterList(List<Chapter> chapterList) {
		this.chapterList = chapterList;
	}
	
	
}

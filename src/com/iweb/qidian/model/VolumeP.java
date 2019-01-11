package com.iweb.qidian.model;

import java.util.ArrayList;
import java.util.List;



public class VolumeP extends Volume {
	private List<Chapter> chapterList = new ArrayList<>();

	public List<Chapter> getChapterList() {
		return chapterList;
	}

	public void setChapterList(List<Chapter> chapterList) {
		this.chapterList = chapterList;
	}
	
	
}

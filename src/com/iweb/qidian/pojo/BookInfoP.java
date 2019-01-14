package com.iweb.qidian.pojo;

import java.util.ArrayList;
import java.util.List;

import com.iweb.qidian.model.BookInfo;
import com.iweb.qidian.model.Category;
import com.iweb.qidian.model.Writer;

public class BookInfoP extends BookInfo{
	private Writer writer;
	
	private Category category;
	
	private List<VolumeP> volumeList = new ArrayList<>();
	
	public List<VolumeP> getVolumeList() {
		return volumeList;
	}
	public void setVolumeList(List<VolumeP> volumeList) {
		this.volumeList = volumeList;
	}
	public Writer getWriter() {
		return writer;
	}
	public void setWriter(Writer writer) {
		this.writer = writer;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
	
}

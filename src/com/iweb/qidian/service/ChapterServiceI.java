package com.iweb.qidian.service;

import java.util.List;

import com.iweb.qidian.model.Chapter;

public interface ChapterServiceI {
	List<Chapter> selectAllChapterByNo(String bno);
}

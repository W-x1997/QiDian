package com.iweb.qidian.service;

import java.util.List;

import com.iweb.qidian.model.BookInfo;
import com.iweb.qidian.model.Chapter;
import com.iweb.qidian.pojo.BookInfoP;

public interface BookServiceI {
	List<BookInfoP> selectAllBook(String sql);
	List<BookInfo> selectByBname();
	List<BookInfo> selectByBid();
	BookInfoP selectBookDetailByBno(String bno);
	Chapter selectChapterByVnoChno(String bno, String chno);
}

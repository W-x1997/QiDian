package com.iweb.qidian.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class ReadWriter {

	public static List<String> readChapterByUrl(String url) {
		// 建立file对象 读取硬盘文件
		File file = new File(url);
		Reader reader = null;
		//缓冲字符流
		BufferedReader buff = null;
		// 每一行 作为元素 装入List
		List<String> chapterList = new ArrayList<>();
		try {
			reader = new FileReader(file);
			// 缓冲字符流 读取每一行信息   \n
			buff = new BufferedReader(reader);
			String len;
			while ((len = buff.readLine()) != null) {
				chapterList.add(len);
			}
		} catch (Exception e) {

			return null;
		} finally {
			try {
				if (buff != null)
					buff.close();
				if (reader != null)
					reader.close();
			} catch (IOException e) {
				e.printStackTrace();
				return null;
			}
		}

		return chapterList;

	}

}

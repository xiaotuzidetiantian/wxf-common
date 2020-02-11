package com.wuxufang.util;
/**
 * 
 * @ClassName: StreamUtil 
 * @Description: ������TODO
 * @author: ��
 * @date: 2020��1��3�� ����9:39:34
 */

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @ClassName: StreamUtil 
 * @Description: 流处理
 * @author: 煜
 * @date: 2020年2月11日 下午5:12:36
 */
public class StreamUtil {

	//读取文件对象到list集合中
	public static List<String> readFileList(File file) throws FileNotFoundException {
		FileInputStream fileInputStream = new FileInputStream(file);
		return readFileList(fileInputStream);
	}
	
	//读取文件地址，并根据编码，把内容放入list集合中
	public static List<String> readFileList(String filename,String charset) throws FileNotFoundException {
		FileInputStream fileInputStream = new FileInputStream(filename);
		return readFileList(fileInputStream,charset);
	}
	
	//读取InputStream对象，把其内容放入集合中
	public static List<String> readFileList(InputStream in) {
		return readFileList(in,"utf-8");
	}
	
	//读取InputStream对象，并根据编码 把其内容放入集合中
	public static List<String> readFileList(InputStream inputStream,String charset) {
		List<String> list = new ArrayList<String>();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(inputStream,charset));
			String s = null;
			while((s = br.readLine()) != null) {
				list.add(s);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	
	
	
	/**
	 * 
	 * @Title: readLine 
	 * @Description: 
	 * @param ins
	 * @return
	 * @return: List<String>
	 */
//	public static List<String> readLine(InputStream in) {
//		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
//		String str = null;
//		List<String> list = new ArrayList<String>();
//		try {
//			while((str = reader.readLine()) != null) {
//				list.add(str);
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		return list;
//	}
}

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
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StreamUtil {

	/**
	 * 
	 * @Title: readLine 
	 * @Description: ������TODO
	 * @param ins
	 * @return
	 * @return: List<String>
	 */
	public static List<String> readLine(InputStream in) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		String str = null;
		List<String> list = new ArrayList<String>();
		try {
			while((str = reader.readLine()) != null) {
				list.add(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}
}

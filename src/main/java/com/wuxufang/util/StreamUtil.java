package com.wuxufang.util;
/**
 * 
 * @ClassName: StreamUtil 
 * @Description: ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½TODO
 * @author: ï¿½ï¿½
 * @date: 2020ï¿½ï¿½1ï¿½ï¿½3ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½9:39:34
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
	 * @Description: Á÷´¦ÀíTODO
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

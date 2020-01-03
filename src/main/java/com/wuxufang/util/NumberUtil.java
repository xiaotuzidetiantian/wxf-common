package com.wuxufang.util;

public class NumberUtil {
/**
 * 
 * @Title: isNumber 
 * @Description: ÅÐ¶ÏÊÇ·ñÊÇÊý×ÖTODO
 * @param src
 * @return
 * @return: boolean
 */
	public static boolean isNumber(String src) {
		String reg = "^(-)?[0-9]+(\\.[0-9]+)?$";
		return src.matches(reg);
	}
	/*
	 * public static void main(String[] args) {
	 * 
	 * boolean b = NumberUtil.isNumber("-d12"); System.out.println(b); }
	 */
}

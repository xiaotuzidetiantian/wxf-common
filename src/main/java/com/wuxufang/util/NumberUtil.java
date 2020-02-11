package com.wuxufang.util;
/**
 * 
 * @ClassName: NumberUtil 
 * @Description: TODO
 * @author: 煜
 * @date: 2020年2月11日 下午5:10:28
 */
public class NumberUtil {
/**
 * 
 * @Title: isNumber 
 * @Description: 判断是否是数字（正负数，小数，整数）
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

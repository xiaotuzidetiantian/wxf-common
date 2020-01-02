package com.wuxufang.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
//		boolean b = StringUtil.hasLength("");
//		boolean b = StringUtil.hasLength(null);
		boolean b = StringUtil.hasLength(" ");
		System.out.println(b);
	}

	@Test
	public void testHasText() {
		boolean b = StringUtil.hasText(" ");
//		boolean b = StringUtil.hasLength("");
//		boolean b = StringUtil.hasLength(null);
		System.out.println(b);
	}

	@Test
	public void testRandomChineseString() {
		String name = StringUtil.randomChineseString();
		System.out.println(name);
	}
	
	@Test
	public void testRandomChineseString2() {
		String name = StringUtil.randomChineseString(100);
		System.out.println(name);
	}

	@Test
	public void testGenerateChineseName() {
		String name = StringUtil.generateChineseName();
		System.out.println(name);
	}
	
	@Test
	public void testIsPhoneNumber() {
//		boolean b = StringUtil.isPhoneNumber("12352564313");
		boolean b = StringUtil.isPhoneNumber("18352543133");
		System.out.println(b);
	}
	
	@Test
	public void testIsEmail() {
//		boolean b = StringUtil.isEmail("12324qq.com");
		boolean b = StringUtil.isEmail("12324@qq.com");
		System.out.println(b);
	}

}

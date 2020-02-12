package com.wuxufang.util;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	@Test
	public void testRandomDate() {
		System.out.println(new Date(0));
		System.out.println(new Date());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for (int i = 0; i < 100; i++) {
			Date date = DateUtil.randomDate(new Date(0), new Date());
			System.out.println(sdf.format(date));
		}
	}
	
	@Test
	public void testInitMonth() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = DateUtil.initMonth(new Date());
		System.out.println(sdf.format(date));
	}
	
	@Test
	public void testEndMonth() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = DateUtil.endMonth(new Date());
		System.out.println(sdf.format(date));
	}

	@Test
	public void testSubDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = DateUtil.subDate(new Date());
		String format = sdf.format(date);
		System.out.println(format);
	}
}

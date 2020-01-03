package com.wuxufang.util;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class PersonTest {

	@Test
	public void test() {
		for (int i = 0; i < 10000; i++) {
			Person person = new Person();
			//��������ֵ����StringUtil.generateChineseName()
			person.setName(StringUtil.generateChineseName());
			//��������ֵ����RandomUtil.random()
			person.setAge(RandomUtil.random(1, 120));
			//��������ֵ����StringUtil.randomChineseString()
			person.setAbout(StringUtil.randomChineseString(140));
			//ע����������ֵģ��2010��1��1�������������ʱ��
			Calendar calendar = Calendar.getInstance();
			calendar.set(2010, 0, 1);
			person.setCreated(DateUtil.randomDate(calendar.getTime(), new Date()));
			System.out.println(person);
		}
	}

}

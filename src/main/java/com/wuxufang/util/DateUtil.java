package com.wuxufang.util;
/**
 * 
 * @ClassName: DateUtil 
 * @Description: TODO
 * @author: ��
 * @date: 2020��1��2�� ����10:56:20
 */

import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	//��ȡһ���µ��³� �磺2020-01-01 00:00:00
	public static Date initMonth(Date date) {
		//��ȡһ��������
		Calendar calendar = Calendar.getInstance();
		//�ô�������ڳ�ʼ������
		calendar.setTime(date);
		//����Ϊ��ǰ���ڵĵ�һ��
		calendar.set(calendar.DAY_OF_MONTH, 1);
		//����Сʱ
		calendar.set(calendar.HOUR_OF_DAY, 0);
		//���÷���
		calendar.set(calendar.MINUTE, 0);
		//������
		calendar.set(calendar.SECOND, 0);
		return calendar.getTime();
	}
	
	//����һ���µ���ĩ
	public static Date endMonth(Date date) {
		//���¼�һ������³����ڼ�ȥһ��
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		//���·ݼ�һ
		calendar.add(calendar.MONTH, 1);
		//��ʱ�����³�
		Date initMonth = initMonth(calendar.getTime());
		calendar.setTime(initMonth);
		//�����ڼ�ȥ1��
		calendar.add(calendar.SECOND,-1);
		return calendar.getTime();
	}
	
	
	/**
	 * 
	 * @Title: getAgeByBirthday 
	 * @Description: ���ݳ������ڼ�������TODO
	 * @param date
	 * @return
	 * @return: int
	 */
	public static int getAgeByBirthday(Date date) {
		//ʹ���������������
		//��ϵͳʱ���ȡ������
		Calendar calendar = Calendar.getInstance();
		//��ȡϵͳ����
		int s_year = calendar.get(calendar.YEAR);
		//��ȡϵͳ����
		int s_month = calendar.get(calendar.MONTH);
		//��ȡϵͳ����
		int s_day = calendar.get(calendar.DAY_OF_MONTH);
		
		//�ô�������ڳ�ʼ��һ��������
		calendar.setTime(date);
		//��ȡ�������ڵ���
		int b_year = calendar.get(calendar.YEAR);
		//��ȡ�������ڵ���
		int b_month = calendar.get(calendar.MONTH);
		//��ȡ�������ڵ���
		int b_day = calendar.get(calendar.DAY_OF_MONTH);
		
		//��ϵͳ��-������
		int age = s_year - b_year;
		//���ϵͳ��С�ڳ����������һ
		if(s_month < b_month) {
			age--;
		}
		//�¹�ϵͳ�ºͳ�ʼ��һ�²���ϵͳ��С�ڳ����ռ�һ
		if(s_month == b_month && s_day < b_day) {
			age--;
		}
		return age;
	}
	
	
	/**
	 * 
	 * @Title: randomDate 
	 * @Description: TODO
	 * @param start
	 * @param end
	 * @return
	 * @return: Date
	 */
	public static Date randomDate(Date start,Date end) {
		//��ȡ��ʼ���ڵĺ�����
		long t1 = start.getTime();
		//��ȡ�������ڵĺ�����
		long t2 = end.getTime();
		
		long t = (long) ((Math.random() * (t2 - t1) +1) + t1);
		return new Date(t);
	}
}

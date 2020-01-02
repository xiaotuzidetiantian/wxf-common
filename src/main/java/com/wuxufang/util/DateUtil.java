package com.wuxufang.util;
/**
 * 
 * @ClassName: DateUtil 
 * @Description: TODO
 * @author: 煜
 * @date: 2020年1月2日 下午10:56:20
 */

import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	//获取一个月的月初
	public static Date initMonth(Date date) {
		//获取一个日期类
		Calendar calendar = Calendar.getInstance();
		//用传入的日期初始日历类
		calendar.setTime(date);
		//设置为当前日期的第一天
		calendar.set(calendar.DAY_OF_MONTH, 1);
		//设置小时
		calendar.set(calendar.HOUR_OF_DAY, 0);
		//设置分钟
		calendar.set(calendar.MINUTE, 0);
		//设置秒
		calendar.set(calendar.SECOND, 0);
		return date;
	}
	
	//返回一个月的月末
	public static Date endMonth(Date date) {
		//让月加一，变成月初，在减去一秒
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		//让月份加一
		calendar.add(calendar.MONTH, 1);
		//让时间变成月初
		Date initMonth = initMonth(calendar.getTime());
		calendar.setTime(initMonth);
		//让日期减去1秒
		calendar.add(calendar.SECOND,-1);
		return calendar.getTime();
	}
	
	
	/**
	 * 
	 * @Title: getAgeByBirthday 
	 * @Description: 根据出生日期计算年龄TODO
	 * @param date
	 * @return
	 * @return: int
	 */
	public static int getAgeByBirthday(Date date) {
		//使用日历类计算年龄
		//用系统时间获取日历类
		Calendar calendar = Calendar.getInstance();
		//获取系统的年
		int s_year = calendar.get(calendar.YEAR);
		//获取系统的月
		int s_month = calendar.get(calendar.MONTH);
		//获取系统的日
		int s_day = calendar.get(calendar.DAY_OF_MONTH);
		
		//用传入的日期初始化一个日历类
		calendar.setTime(date);
		//获取出生日期的年
		int b_year = calendar.get(calendar.YEAR);
		//获取出生日期的月
		int b_month = calendar.get(calendar.MONTH);
		//获取出生日期的日
		int b_day = calendar.get(calendar.DAY_OF_MONTH);
		
		//用系统年-出生年
		int age = s_year - b_year;
		//如果系统月小于出生月年龄减一
		if(s_month < b_month) {
			age--;
		}
		//吐过系统月和初始月一致并且系统日小于出生日减一
		if(s_month == b_month && s_day < b_day) {
			age--;
		}
		return 0;
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
		//获取开始日期的毫秒数
		long t1 = start.getTime();
		//获取结束日期的毫秒数
		long t2 = end.getTime();
		
		long t = (long) ((Math.random() * (t2 - t1) +1) + t1);
		return new Date(t);
	}
}

package com.songjn.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * 
 * @ClassName: LastMonthDay
 * @Description: TODO(计算上个月最后一天)
 * @author songjn
 * @date 2018-9-18 下午05:30:53
 * 
 */
public class LastMonthDay {
	private static String lastDay;
	public static void main(String[] args) {
		SimpleDateFormat formatter = new SimpleDateFormat("yy-MM-dd");
		Calendar cale = Calendar.getInstance();//获取当前日期 
		cale.set(Calendar.DAY_OF_MONTH, 0);// 设置为0号,上个月最后一天
		lastDay = formatter.format(cale.getTime());//格式化
		System.out.println(lastDay);
	}
}

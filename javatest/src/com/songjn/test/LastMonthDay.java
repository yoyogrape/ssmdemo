package com.songjn.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * 
 * @ClassName: LastMonthDay
 * @Description: TODO(�����ϸ������һ��)
 * @author songjn
 * @date 2018-9-18 ����05:30:53
 * 
 */
public class LastMonthDay {
	private static String lastDay;
	public static void main(String[] args) {
		SimpleDateFormat formatter = new SimpleDateFormat("yy-MM-dd");
		Calendar cale = Calendar.getInstance();//��ȡ��ǰ���� 
		cale.set(Calendar.DAY_OF_MONTH, 0);// ����Ϊ0��,�ϸ������һ��
		lastDay = formatter.format(cale.getTime());//��ʽ��
		System.out.println(lastDay);
	}
}

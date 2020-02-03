package com.kh.example.chap03_Date.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateController {
	public void method1() {
		Date today = new Date();
		System.out.println(today); //����ð� ���
		//Mon Jan 13 21:06:51 KST 2020
	
		System.out.println(today.getTime());
		//1970�� 1�� 1�� 0��0��0�� ���ķ� �帥 �ð��� �����ö�
		//1578917301683
		
		Date time = new Date(1578917301683L);
		System.out.println(time);
		//Mon Jan 13 21:08:21 KST 2020

		Date origin = new Date(0);
		System.out.println(origin);
		//Thu Jan 01 09:00:00 KST 1970
		
		Date date = new Date(2020, 1, 13);
		//- The constructor Date(int, int, int) is deprecated
		
	}
	public void mathed2() {
//		Calendar c = new Calendar(); // �߻�Ŭ�����ε� ��ü�������ؼ� ����.
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		
		int year = c.get(Calendar.YEAR);
		System.out.println(year);
		//2020
		
		int month = c.get(Calendar.MONTH)+1; //�����δ콺 ����̶� �÷���1 
		System.out.println(month);
		//1
		
		int date = c.get(Calendar.DATE);
		System.out.println(date);
		//13
		
		int amPm = c.get(Calendar.AM_PM);
		System.out.println(amPm);//������ 0, ���Ĵ� 1
		//1
		
		int hour = c.get(Calendar.HOUR);
		System.out.println(hour); //9
		hour = c.get(Calendar.HOUR_OF_DAY);
		System.out.println(hour); //21
		
		int min = c.get(Calendar.MINUTE);
		System.out.println(min); //22
		
		int sec = c.get(Calendar.SECOND);
		System.out.println(sec); //25
	}
	public void method3() {
		//GregorianCalendar�� Ư�� ��¥ ���� �Է��ؼ� ��ü �����ϴ� ��� ����
		//2020.6.17
		int year =2020;
		int month = 5; // �ε��� �����̱⶧���� 6�̾ƴ� 5�� ����
		int date = 7;
		int hour = 22;
		int min = 0;
		int sec =0;
		
		GregorianCalendar gc = new GregorianCalendar(year, month, date, hour, min, sec);
		long time = gc.getTimeInMillis();
		Date endDay = new Date(time);
		
		System.out.println(endDay);
		//Tue Jul 07 22:00:00 KST 2020
		//Sun Jun 07 22:00:00 KST 2020
		
		System.out.println(gc.get(Calendar.YEAR));
		System.out.println(gc.get(Calendar.MONTH)+1);
		System.out.println(gc.get(Calendar.DATE));
		/*
		 2020
		 6
		 7*/
		
		//���õ���Ʈ ������ �̿��ؼ� ���ϴ� ��¥ ����� ������ش�.
		//2020-06-17 ������ ���� 22�� 00�� 00�� �� ������ְ� �ʹ�.
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E���� HH�� mm�� ss��");
		String fmt = sdf.format(endDay);
		System.out.println(fmt);
		//2020-06-07 �Ͽ��� 22�� 00�� 00��
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

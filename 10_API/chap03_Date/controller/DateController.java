package com.kh.example.chap03_Date.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateController {
	public void method1() {
		Date today = new Date();
		System.out.println(today); //현재시간 출력
		//Mon Jan 13 21:06:51 KST 2020
	
		System.out.println(today.getTime());
		//1970년 1월 1일 0시0분0초 이후로 흐른 시간을 가져올때
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
//		Calendar c = new Calendar(); // 추상클래스인데 객체생성을해서 오류.
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		
		int year = c.get(Calendar.YEAR);
		System.out.println(year);
		//2020
		
		int month = c.get(Calendar.MONTH)+1; //제로인댁스 기반이라서 플러스1 
		System.out.println(month);
		//1
		
		int date = c.get(Calendar.DATE);
		System.out.println(date);
		//13
		
		int amPm = c.get(Calendar.AM_PM);
		System.out.println(amPm);//오전은 0, 오후는 1
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
		//GregorianCalendar는 특정 날짜 값을 입력해서 객체 생성하는 기능 제공
		//2020.6.17
		int year =2020;
		int month = 5; // 인덱스 기준이기때문에 6이아닌 5로 수정
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
		
		//심플데이트 포멧을 이용해서 원하는 날짜 양식을 만들어준다.
		//2020-06-17 수요일 오후 22시 00분 00초 로 만들어주고 싶다.
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E요일 HH시 mm분 ss초");
		String fmt = sdf.format(endDay);
		System.out.println(fmt);
		//2020-06-07 일요일 22시 00분 00초
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

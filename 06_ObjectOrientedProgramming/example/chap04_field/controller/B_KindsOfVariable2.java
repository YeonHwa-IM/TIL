package com.kh.example.chap04_field.controller;

public class B_KindsOfVariable2 {
	
	public static int staticNum;
	
	private int testNum =10;
	private static int staticTestNum =10;
	
	public B_KindsOfVariable2() { // »ý¼ºÀÚ
		testNum++;
		System.out.println("testNum : " + testNum);
		
		staticTestNum++;
		System.out.println("staticNum : "+ staticTestNum);
		/*
		testNum : 11
		staticNum : 11
		testNum : 11
		staticNum : 12
		*/
		
		
	}

}

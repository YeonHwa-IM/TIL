package com.kh.example.chap02.control.controller;

import java.util.Scanner;

import com.kh.example.chap02.control.thread.Thread4;

public class InterruptController { // thread4 실행예제 만들기.
	public void sleepInterrupt() {
		Thread4 th4 = new Thread4();
		Thread thread = new Thread(th4);
		thread.start();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("아무 값이나 입력하세요 : ");
		String input = sc.nextLine();
		System.out.println("입력한 값 : " + input);
		//10초 카운트 중 아무 값이나 입력 받으면 카운트 종료하기
		 
		//interrupted가 발생되도록 만들기
		thread.interrupt();//잠자는 애 깨우기. interrupted 익셉션 발생
		System.out.println("isInterrupted() : "+thread.isInterrupted());
//		8초
//
//		입력한 값 : 5
//		isInterrupted() : true
//		8초에 카운트 종료
//		9초
//		10초
		// 시나리오와 다르게 종료되지않고 9초 10초가 계속 실행된다.
		
		//캐치안에 코드 넣어주고 다시 실행
		
//		아무 값이나 입력하세요 : 
//		1초
//		2초
//		5
//		입력한 값 : 5
//		isInterrupted() : true
//		2초에 카운트 종료
	}
}

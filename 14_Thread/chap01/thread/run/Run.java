package com.kh.example.chap01.thread.run;

import com.kh.example.chap01.thread.thread.Thread1;
import com.kh.example.chap01.thread.thread.Thread2;
import com.kh.example.chap01.thread.thread.Thread3;

public class Run {
	public static void main(String[] args) {
		
		Thread1 thread1 = new Thread1();
//		thread1.run();// run(); 으로 수행하면 스레드 먼저 진행하고 메인이 끝난다.
		thread1.start(); //start(); 로 수행할경우 메인엔드 먼저 나오고 스레드가 진행된다.
		
		Thread2 t2 = new Thread2();
		Thread thread2 = new Thread(t2);//런안에 스레드 메소드가 없기 때문에 스레드 객체 만들어줘야함
		thread2.start();
		
		Thread3 thread3 = new Thread3(); 
		thread3.start();
		
//		thread1.start();
		//java.lang.IllegalThreadStateException : 한번 종료된 스레드는 다시 호출 불가.

		System.out.println("t1 우선순위 : "+ thread1.getPriority());
		System.out.println("t2 우선순위 : "+ thread2.getPriority());
		System.out.println("t3 우선순위 : "+ thread3.getPriority());
		
		thread1.setPriority(3); //3번째 진행 
		thread2.setPriority(Thread.MAX_PRIORITY); // 최고 우선순위 10 제일 먼저 오래
		thread3.setPriority(Thread.MIN_PRIORITY); // 최하위 우선순위 1 제일 늦게 짧게
		
		System.out.println("t1 우선순위 : "+ thread1.getPriority());
		System.out.println("t2 우선순위 : "+ thread2.getPriority());
		System.out.println("t3 우선순위 : "+ thread3.getPriority());
		
//		t1 우선순위 : 3
//		t2 우선순위 : 10
//		t3 우선순위 : 1
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		
		//스레드컨트롤
		try {
			thread1.join();
			thread2.join();
			thread3.join();
			//자신(main thread)이 하던 작업을 잠시 멈추고 다른 스레드(thread1, thread2, thread3)가 지정된 시간동안 실행되도록함.
			//내가 실행되고 있는 위치를 본다.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(".....................main end!");
	}

}

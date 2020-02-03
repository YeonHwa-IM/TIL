package com.kh.example.chap01.thread.thread;

//스레드 생성 : Thread 클래스 상속
public class Thread1 extends Thread {
	//런메소드를 오버라이딩해줘야한다.
	@Override
	public void run() {
		//스레드 이름을 지정해주고 싶으면
		setName("귀여운 스레드");
		for(int i=0; i<10; i++) {
			System.out.println(getName()+ "ON...");
			//getName() : 스레드 이름 반환
			
			try {
				Thread.sleep(500);
				// sleep() : 스레드를 지연시키는 메소드(1000 = 1s 1초) // 트라이캐치 해줘야함.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

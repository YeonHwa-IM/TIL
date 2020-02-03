package com.kh.example.chap01.thread.thread;

// 스레드 생성방법 2 : Runnable implements하기
public class Thread2 implements Runnable{
//메소드 오버라이딩 하기 
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
//			Thread.currentThread().setName("귀여운 스레드2");
			System.out.println(Thread.currentThread().getName()+"ON...");
			// 스레드를 상속 받고 있지 않기 때문에 스레드 커렌트메소드.겟네임으로 가져와야한다.
			
			try {
				Thread.sleep(500);
				// sleep() : 스레드를 지연시키는 메소드(1000 = 1s 1초) // 트라이캐치 해줘야함
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	

}

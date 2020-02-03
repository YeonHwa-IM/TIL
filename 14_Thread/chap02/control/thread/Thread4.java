package com.kh.example.chap02.control.thread;

public class Thread4 implements Runnable{
	

	@Override
	public void run() {
		int count = 0;
		
		while(count < 10 && !Thread.currentThread().isInterrupted()) {
		//count가 10미만이면서, 현재 스레드에 Interrupted가 false인 경우 진행.
		//카운트가 10 미만이면서 Interrupted가 아닐때 false를 반환 인데 !이기때문에 true를 반환한다.
		try {
			Thread.sleep(1000);
			System.out.println((++count)+"초");
		} catch (InterruptedException e) {
			System.out.println(count + "초에 카운트 종료");
			Thread.currentThread().interrupt();
		}
		
//		재우고 깨우는 메소드를 반복하다가 인터럽트를 만나면
//		인터럽티드 익셉션이 발행하는것은 맞다 
//		때문에 "초에 카운트 종료"가 발생한것을 확인가능.
//
//		인터럽티드 익셉션이 발행하면, 이즈 인터럽티드라고 했던 상태값이 중간에 트루로 바뀌었어도
//		인터럽티드 익셉션을 만나면 (이즈 인터럽티드의 값이 초기화된다) = 다시 펄스가 된다.
//		펄스가 되어서 다시 와일문이 실행되서 조건에 맞으면 계속 실행되게 된다.
//
//		인터럽트 메소드를 부르면, 결국 인터럽티드 익셉션을 만나게 되는데
//		때문에 캐치안에서 인터럽티드메소드를 발생시킨다면 트루가 될테니까 이즈인터럽티드에 걸리지 않는다.
		
		
		}
	}

}

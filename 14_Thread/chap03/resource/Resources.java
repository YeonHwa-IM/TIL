package com.kh.example.chap03_sync.resource;

public class Resources {//공유자원(객체)를 제공하는 클래스
	private int data;
	private boolean empty = true; //data에 값이 없을 때 true
	
	public synchronized void gatData() { 
		while(empty) {//data필드에 값이 없다면
			 try {
				wait();
//	동기화된 블록 안에서 다른 스레드가 이 객체의 notify(), notifyAll()을 호출하거나 
//	지정된 시간이 지날 때 까지 현재의 스레드를 대기시킴

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		empty = true; //empty 를 true로 바꿔주기
		System.out.println("소비자 : "+ data +"번 상품을 소비하였습니다.");
		notify();
	}
	
//	동기화된 블록 안에서 호출한 객체 내부에 대기중인 	스레드를 깨움. 
//  여러 스레드가 있을 경우 임의의 스레드 하나에만 통보
	
	public synchronized void setData(int data) {
		while(!empty) {//data필드에 값이 있다면
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.data =  data;
		empty = false;
		System.out.println("생산자 : "+ data + "상품을 생산하였습니다.");
		notify();
	}

}

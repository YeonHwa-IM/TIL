package com.kh.example.chap03_sync.thread;

import javax.annotation.Resource;

import com.kh.example.chap03_sync.resource.Resources;

public class Customer extends Thread { //스레드 상속
	//공유자원을 꺼내서 사용하는 소비자 클래스
	private Resources ciriticalData; //프라이빗 필드 생성
	
	public Customer() {}//기본생성자
	
	public Customer(Resources resources) {
		this.ciriticalData = resources;
	}
	
	@Override //스레드라서 런메소드 오버라이딩
		public void run() {
			for(int i=1; i<= 10; i++) {
				ciriticalData.gatData();
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
			
		}
}

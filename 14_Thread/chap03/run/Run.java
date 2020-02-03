package com.kh.example.chap03_sync.run;

import com.kh.example.chap03_sync.resource.Resources;
import com.kh.example.chap03_sync.thread.Customer;
import com.kh.example.chap03_sync.thread.Product;

public class Run {
	public static void main(String[] args) {
		Resources resources = new Resources();
		
		Thread t1 = new Product(resources);
		Thread t2 = new Customer(resources);
		
		t1.start();
		t2.start();
	
	//1. 에러가 발생
	//java.lang.IllegalMonitorStateException	
	//wait()가 동기화 블록/동기화메소드 안에서 사용되어야 하는데 일반 메소드 안에서 사용되었기 때문에 뜨는 에러
	//2. 리소스 클래스에서 웨이트 , empty에 주석처리해주면 에러없이 진행 => 동기화 해줘야함 synchronized 적기
	//3.랜덤으로 가다가 멈춤 = 교착상태 => 깨워주려면 notify(); 넣어주기
	
	}

}

package com.kh.example.chap01.thread.thread;

public class Thread3 extends Thread{
	@Override
	public void run() {
		for(int i=0; i < 10; i++) {
//			setName("�Ϳ��� ������3");
			System.out.println(getName()+"ON...");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

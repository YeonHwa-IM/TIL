package com.kh.example.chap01.thread.thread;

// ������ ������� 2 : Runnable implements�ϱ�
public class Thread2 implements Runnable{
//�޼ҵ� �������̵� �ϱ� 
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
//			Thread.currentThread().setName("�Ϳ��� ������2");
			System.out.println(Thread.currentThread().getName()+"ON...");
			// �����带 ��� �ް� ���� �ʱ� ������ ������ Ŀ��Ʈ�޼ҵ�.�ٳ������� �����;��Ѵ�.
			
			try {
				Thread.sleep(500);
				// sleep() : �����带 ������Ű�� �޼ҵ�(1000 = 1s 1��) // Ʈ����ĳġ �������
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	

}

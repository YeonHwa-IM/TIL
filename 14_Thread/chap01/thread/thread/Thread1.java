package com.kh.example.chap01.thread.thread;

//������ ���� : Thread Ŭ���� ���
public class Thread1 extends Thread {
	//���޼ҵ带 �������̵�������Ѵ�.
	@Override
	public void run() {
		//������ �̸��� �������ְ� ������
		setName("�Ϳ��� ������");
		for(int i=0; i<10; i++) {
			System.out.println(getName()+ "ON...");
			//getName() : ������ �̸� ��ȯ
			
			try {
				Thread.sleep(500);
				// sleep() : �����带 ������Ű�� �޼ҵ�(1000 = 1s 1��) // Ʈ����ĳġ �������.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

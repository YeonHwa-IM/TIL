package com.kh.example.chap01.thread.run;

import com.kh.example.chap01.thread.thread.Thread1;
import com.kh.example.chap01.thread.thread.Thread2;
import com.kh.example.chap01.thread.thread.Thread3;

public class Run {
	public static void main(String[] args) {
		
		Thread1 thread1 = new Thread1();
//		thread1.run();// run(); ���� �����ϸ� ������ ���� �����ϰ� ������ ������.
		thread1.start(); //start(); �� �����Ұ�� ���ο��� ���� ������ �����尡 ����ȴ�.
		
		Thread2 t2 = new Thread2();
		Thread thread2 = new Thread(t2);//���ȿ� ������ �޼ҵ尡 ���� ������ ������ ��ü ����������
		thread2.start();
		
		Thread3 thread3 = new Thread3(); 
		thread3.start();
		
//		thread1.start();
		//java.lang.IllegalThreadStateException : �ѹ� ����� ������� �ٽ� ȣ�� �Ұ�.

		System.out.println("t1 �켱���� : "+ thread1.getPriority());
		System.out.println("t2 �켱���� : "+ thread2.getPriority());
		System.out.println("t3 �켱���� : "+ thread3.getPriority());
		
		thread1.setPriority(3); //3��° ���� 
		thread2.setPriority(Thread.MAX_PRIORITY); // �ְ� �켱���� 10 ���� ���� ����
		thread3.setPriority(Thread.MIN_PRIORITY); // ������ �켱���� 1 ���� �ʰ� ª��
		
		System.out.println("t1 �켱���� : "+ thread1.getPriority());
		System.out.println("t2 �켱���� : "+ thread2.getPriority());
		System.out.println("t3 �켱���� : "+ thread3.getPriority());
		
//		t1 �켱���� : 3
//		t2 �켱���� : 10
//		t3 �켱���� : 1
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		
		//��������Ʈ��
		try {
			thread1.join();
			thread2.join();
			thread3.join();
			//�ڽ�(main thread)�� �ϴ� �۾��� ��� ���߰� �ٸ� ������(thread1, thread2, thread3)�� ������ �ð����� ����ǵ�����.
			//���� ����ǰ� �ִ� ��ġ�� ����.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(".....................main end!");
	}

}

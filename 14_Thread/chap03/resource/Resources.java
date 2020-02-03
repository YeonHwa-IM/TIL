package com.kh.example.chap03_sync.resource;

public class Resources {//�����ڿ�(��ü)�� �����ϴ� Ŭ����
	private int data;
	private boolean empty = true; //data�� ���� ���� �� true
	
	public synchronized void gatData() { 
		while(empty) {//data�ʵ忡 ���� ���ٸ�
			 try {
				wait();
//	����ȭ�� ��� �ȿ��� �ٸ� �����尡 �� ��ü�� notify(), notifyAll()�� ȣ���ϰų� 
//	������ �ð��� ���� �� ���� ������ �����带 ����Ŵ

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		empty = true; //empty �� true�� �ٲ��ֱ�
		System.out.println("�Һ��� : "+ data +"�� ��ǰ�� �Һ��Ͽ����ϴ�.");
		notify();
	}
	
//	����ȭ�� ��� �ȿ��� ȣ���� ��ü ���ο� ������� 	�����带 ����. 
//  ���� �����尡 ���� ��� ������ ������ �ϳ����� �뺸
	
	public synchronized void setData(int data) {
		while(!empty) {//data�ʵ忡 ���� �ִٸ�
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.data =  data;
		empty = false;
		System.out.println("������ : "+ data + "��ǰ�� �����Ͽ����ϴ�.");
		notify();
	}

}

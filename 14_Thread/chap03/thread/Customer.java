package com.kh.example.chap03_sync.thread;

import javax.annotation.Resource;

import com.kh.example.chap03_sync.resource.Resources;

public class Customer extends Thread { //������ ���
	//�����ڿ��� ������ ����ϴ� �Һ��� Ŭ����
	private Resources ciriticalData; //�����̺� �ʵ� ����
	
	public Customer() {}//�⺻������
	
	public Customer(Resources resources) {
		this.ciriticalData = resources;
	}
	
	@Override //������� ���޼ҵ� �������̵�
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

package com.kh.example.chap03_sync.thread;

import com.kh.example.chap03_sync.resource.Resources;

public class Product extends Thread{
	//���������� �� �ִ� ���� �ϴ� ������ Ŭ����
			
		private Resources ciriticalDate;
		public Product() {}
		public Product(Resources resources) {
			this.ciriticalDate = resources;
		}
		@Override
		public void run() {
			for(int i=1; i<= 10; i++) {
				ciriticalDate.setData(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			
			
			}
			
		}
		
	}



package com.kh.example.chap02.control.controller;

import java.util.Scanner;

import com.kh.example.chap02.control.thread.Thread4;

public class InterruptController { // thread4 ���࿹�� �����.
	public void sleepInterrupt() {
		Thread4 th4 = new Thread4();
		Thread thread = new Thread(th4);
		thread.start();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�ƹ� ���̳� �Է��ϼ��� : ");
		String input = sc.nextLine();
		System.out.println("�Է��� �� : " + input);
		//10�� ī��Ʈ �� �ƹ� ���̳� �Է� ������ ī��Ʈ �����ϱ�
		 
		//interrupted�� �߻��ǵ��� �����
		thread.interrupt();//���ڴ� �� �����. interrupted �ͼ��� �߻�
		System.out.println("isInterrupted() : "+thread.isInterrupted());
//		8��
//
//		�Է��� �� : 5
//		isInterrupted() : true
//		8�ʿ� ī��Ʈ ����
//		9��
//		10��
		// �ó������� �ٸ��� ��������ʰ� 9�� 10�ʰ� ��� ����ȴ�.
		
		//ĳġ�ȿ� �ڵ� �־��ְ� �ٽ� ����
		
//		�ƹ� ���̳� �Է��ϼ��� : 
//		1��
//		2��
//		5
//		�Է��� �� : 5
//		isInterrupted() : true
//		2�ʿ� ī��Ʈ ����
	}
}

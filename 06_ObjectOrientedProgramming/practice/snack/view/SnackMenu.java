package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.conrtoller.SnackController;

public class SnackMenu {
	Scanner sc = new Scanner(System.in);
	private SnackController scr = new SnackController();
	
	public void menu() {
				
		System.out.println("�������� �Է��ϼ���");
		
		System.out.print("���� : ");
		String kind = sc.next();
		
		System.out.print("�̸� : ");
		String name = sc.next();
		
		System.out.print("�� : ");
		String flavor = sc.next();
		
		System.out.print("���� : ");
		int numOf = sc.nextInt();
		
		System.out.print("���� : ");
		int price = sc.nextInt();
		
		String result = scr.saveData(kind, name, flavor, numOf, price);
		System.out.println(result);
		
		System.out.println("������ ������ Ȯ���Ͻðڽ��ϱ�? : ");
		char ch = sc.next().charAt(0);
		if(ch == 'y') {
//			System.out.println(scr.confirmData());
			System.out.println(kind + "(" + name + "-" + flavor + ")" + numOf + "��"+ price + "��");
		}
	}

}

package com.kh.practice.numRange.view;

import java.util.Scanner;

import com.kh.practice.numRange.controller.NumberController;
import com.kh.practice.numRange.exception.NumRangeException;

public class NumberMenu {
	public void menu() { //����ڿ��� ���� �� ���� ���� ������� ���
		
		Scanner sc = new Scanner(System.in);
		NumberController nc = new NumberController();

		while(true) {
			System.out.print("����1 : ");
			int num1 = sc.nextInt();
			System.out.print("����2 : ");
			int num2 = sc.nextInt();

			try {

				System.out.println(num1+"��(��) "+num2+"�� ����ΰ� ? "+nc.checkCouble(num1, num2));

			}catch(NumRangeException nre) {
				nre.printStackTrace(); 
				break;
			}
			System.out.println("\n�Ǵ�\n");
		}
	}
}

package com.kh.practice.numRange.view;

import java.util.Scanner;

import com.kh.practice.numRange.controller.NumberController;
import com.kh.practice.numRange.exception.NumRangeException;

public class NumberMenu {
	public void menu() { //사용자에게 받은 두 정수 값이 배수인지 출력
		
		Scanner sc = new Scanner(System.in);
		NumberController nc = new NumberController();

		while(true) {
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();

			try {

				System.out.println(num1+"은(는) "+num2+"의 배수인가 ? "+nc.checkCouble(num1, num2));

			}catch(NumRangeException nre) {
				nre.printStackTrace(); 
				break;
			}
			System.out.println("\n또는\n");
		}
	}
}

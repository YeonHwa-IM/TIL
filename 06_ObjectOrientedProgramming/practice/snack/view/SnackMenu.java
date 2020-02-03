package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.conrtoller.SnackController;

public class SnackMenu {
	Scanner sc = new Scanner(System.in);
	private SnackController scr = new SnackController();
	
	public void menu() {
				
		System.out.println("스낵류를 입력하세요");
		
		System.out.print("종류 : ");
		String kind = sc.next();
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("맛 : ");
		String flavor = sc.next();
		
		System.out.print("개수 : ");
		int numOf = sc.nextInt();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		String result = scr.saveData(kind, name, flavor, numOf, price);
		System.out.println(result);
		
		System.out.println("저장한 정보를 확인하시겠습니까? : ");
		char ch = sc.next().charAt(0);
		if(ch == 'y') {
//			System.out.println(scr.confirmData());
			System.out.println(kind + "(" + name + "-" + flavor + ")" + numOf + "개"+ price + "원");
		}
	}

}

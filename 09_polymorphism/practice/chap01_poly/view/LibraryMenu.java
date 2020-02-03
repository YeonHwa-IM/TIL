package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryMenu {
	private LibraryController lc = new LibraryController();
	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		System.out.print("�̸� : ");
		String name = sc.next();
		System.out.print("���� : ");
		int age = sc.nextInt();
		System.out.print("���� : ");
		char gender = sc.next().charAt(0);
		
		Member mem = new Member(name, age, gender);
		lc.insertMember(mem);
				
		while(true) {
			System.out.println("1. ����������");
			System.out.println("2. ���� ��ü ��ȸ");
			System.out.println("3. ���� �˻�");
			System.out.println("4. ���� �뿩�ϱ�");
			System.out.println("9. ���α׷� �����ϱ�");
			System.out.print("�޴� ��ȣ : ");
			int menuNum=sc.nextInt();

			switch(menuNum) {
			case 1 : 
				System.out.println(lc.myinfo()); break;
			case 2 :  selectAll(); break;
			case 3 :  searchBook(); break;
			case 4 :  rentBook(); break;
			case 9 : 
				System.out.println("���α׷��� �����մϴ�.");
				break;
			default :	
				System.out.println("�ٽ� �Է����ּ���.");
			}
			if(menuNum==9) {
				break;
			}
		}

	}
	public void selectAll() {
		lc.selectAll();
		for(int i=0; i < lc.selectAll().length; i++) {
			System.out.println(i+ "�� ���� "+lc.selectAll()[i]);
		}
		
	}
	public void searchBook() {
		System.out.print("�˻��� ���� Ű���� : ");
		String keyword = sc.next();
		lc.searchBook(keyword);
		//��� ���� b�迭.
		for(int i=0; i <lc.searchBook(keyword).length; i++) {
			if(lc.searchBook(keyword)[i] != null) {
				System.out.println(lc.searchBook(keyword)[i]);
			}
		}
	}
	public void rentBook() {
			
		selectAll();
		System.out.print("�뿩�� ���� ��ȣ ���� : ");
		int index = sc.nextInt();
		int result = lc.rentBook(index);
		
		if(result == 0) {
			System.out.println("���������� �뿩�Ǿ����ϴ�.");
		}else if(result == 1) {
			System.out.println("���� �������� �뿩 �Ұ����Դϴ�.");
			
		}else if(result == 2) {
			System.out.println("���������� �뿩�Ǿ����ϴ�. �丮�п� ������ �߱޵Ǿ����� �������������� Ȯ���ϼ���.");
		}
	}
}

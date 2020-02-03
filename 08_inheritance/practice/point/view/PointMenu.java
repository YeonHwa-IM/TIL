package com.kh.practice.point.view;

import java.util.Scanner;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;

public class PointMenu {
	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();
	
	public void mainMenu() {

		while(true) {
			System.out.println("===== �޴� =====");
			System.out.println("1. ��");
			System.out.println("2. �簢��");
			System.out.println("9. ������");
			System.out.print("�޴� ��ȣ : ");
			int menuNum = sc.nextInt();

			switch(menuNum) {
			case 1 : circleMenu(); break;
			case 2 : rectangleMenu(); break;
			case 9 : 
				System.out.println("���α׷��� �����մϴ�."); return;
			default :
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}	
	}

	public void circleMenu() {
		
			System.out.println("===== �� �޴� =====");
			System.out.println("1. �� �ѷ�");
			System.out.println("2. �� ����");
			System.out.println("9. ��������");
			System.out.print("�޴� ��ȣ : ");
			int menuNum = sc.nextInt();

			switch(menuNum) {
			case 1 : calcCircum(); break;
			case 2 : CircleArea(); break;
			case 9 : 
				System.out.println("�������� ���ư��ϴ�."); break;
			default :
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}
	
	
	public void rectangleMenu() {
	
			System.out.println("===== �޴� =====");
			System.out.println("1. �簢�� �ѷ�");
			System.out.println("2. �簢�� ����");
			System.out.println("9. ��������");
			System.out.print("�޴� ��ȣ : ");
			int menuNum = sc.nextInt();

			switch(menuNum) {
			case 1 : calcPerimeter(); break;
			case 2 : calcRectArea(); break;
			case 9 : 
				System.out.println("�������� ���ư��ϴ�."); break;
			default :
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}
	
	
	public void calcCircum() {
		System.out.print("x ��ǥ : ");
		int x = sc.nextInt();
		System.out.print("y ��ǥ : ");
		int y = sc.nextInt();
		System.out.print("������ : ");
		int radius = sc.nextInt();		
		System.out.println(cc.calcCircum(x, y, radius));
	}
	
	public void CircleArea() {
		System.out.print("x ��ǥ : ");
		int x = sc.nextInt();
		System.out.print("y ��ǥ : ");
		int y = sc.nextInt();
		System.out.print("������ : ");
		int radius = sc.nextInt();		
		System.out.println(cc.calcArea(x, y, radius));
	}
	
	public void calcPerimeter() {
		System.out.print("x ��ǥ : ");
		int x = sc.nextInt();
		System.out.print("y ��ǥ : ");
		int y = sc.nextInt();
		System.out.print("���� : ");
		int he = sc.nextInt();
		System.out.print("�ʺ� : ");
		int wid = sc.nextInt();
		System.out.println(rc.calcPerimeter(x, y, he, wid));
	}
	
	public void calcRectArea() {
		System.out.print("x ��ǥ : ");
		int x = sc.nextInt();
		System.out.print("y ��ǥ : ");
		int y = sc.nextInt();
		System.out.print("���� : ");
		int he = sc.nextInt();
		System.out.print("�ʺ� : ");
		int wid = sc.nextInt();
		System.out.println(rc.calcArea(x, y, he, wid));
	}
}


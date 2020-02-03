package com.kh.practice.file.view;

import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {
	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();


	//���� �޴� ���
	public void mainMenu() {
	while(true) {
		System.out.println("***** My Note*****");
		System.out.println("1. ��Ʈ ���� �����");
		System.out.println("2. ��Ʈ ����");
		System.out.println("3. ��Ʈ ��� �����ϱ�");
		System.out.println("9. ������");
		System.out.print("�޴� ��ȣ  : ");
		int menuNum= Integer.parseInt(sc.nextLine());

		switch(menuNum) {
		case 1 : fileSave(); break;
		case 2 : fileOpen(); break;
		case 3 : fileEdit(); break;
		case 9 : 
			System.out.println("���α׷��� �����մϴ�.");
		}
		if(menuNum == 9) break;
	}
	}

	//���� ��� ������ ���� ����
	public void fileSave() {

		StringBuilder sb = new StringBuilder();

		while(true) {
			System.out.println("���Ͽ� ������ ������ �Է��ϼ���.");
			System.out.println("ex��it �̶�� �Է��ϸ� ����˴ϴ�.");
			System.out.print("���� : ");
			String str = sc.nextLine();


			if(str.equals("ex��it")) {
				break;
			}else {
				sb.append(str+"\n");
				
			}
		}

		while(true) {
			System.out.print("������ ���� ���� �Է��� �ּ���(ex. myFile.txt) : ");
			String file = sc.nextLine();

			if(fc.checkName(file)) {
				System.out.print("�̹� �����ϴ� �����Դϴ�. ����ðڽ��ϱ�?(y/n) : ");
				char ch = sc.next().charAt(0);
				if(ch == 'y') {
					fc.fileSave(file, sb);
					break;
				}else if(ch == 'n') {
					System.out.print("������ ���� ���� �Է����ּ��� ~");
				}
			}else {
				fc.fileSave(file, sb);
				break;

			}
		}

	}


	//���� ���� �޾� ����� ������ ���
	public void fileOpen() {
		System.out.print("�� ���� �� : ");
		String file = sc.nextLine();
		if(fc.checkName(file)){
			System.out.println(fc.fileOpen(file));
		}else {
			System.out.println("���� �����Դϴ�.");
		}
	}

	//���� ��� ������ ���� ����
	public void fileEdit() {
		System.out.print("������ ���� �� : ");
		String file = sc.nextLine();
		StringBuilder sb = new StringBuilder();
	
		if(fc.checkName(file)){
			while(true) {
				System.out.println("���Ͽ� ������ ������ �Է��ϼ���.");
				System.out.println("ex��it �̶�� �Է��ϸ� ����˴ϴ�.");
				System.out.print("���� : ");
				String str = sc.nextLine();

				if(str.equals("ex��it")) {
					break;
				}else {
					sb.append(str+"\n");
				}
			}
			fc.fileEdit(file, sb);
		}else {
			System.out.println("���� �����Դϴ�.");
		}
		
	}


}

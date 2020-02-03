package com.kh.example.chap02.loop;

import java.util.Scanner;

public class B_While {
	/* 
	 
	 While(���ǽ�){
	 	���๮��;
	 	[������ or �б⹮];(���ȣ�� ������ �������� �����ش�.)
	 }
	 ���ǽ� Ȯ�� -> (���ǽ� true �� ��) ���� ���� ���� -> ���ǽ� Ȯ�� -> (�ݺ�)
	 ���ǽ� ����� false�� �� ������ �ݺ�
	 
	 
	 */	
	public void method1() {
		//1���� 5���� ���
		int i=1;
		while(i <= 5) {
			System.out.println(i + "��° �ݺ��� ����");
			i++;//�������� ���� ������ ���� ���α׷��� ������ �ʴ´�.
		}

	}
	public void method1_1() {
		//�ڱ�Ұ� �ټ��� �ϱ� : ���̸��� �ڽſ��
		
		int i=0;
		while(i < 5) {
			System.out.println("���̸��� �ڽſ��");
			i++;
		}
	}
	public void method2() {
		//5���� 1���� ���
		
		int i=5;
		while(i >= 1) {
			System.out.println(i);
			i--;
		}
		
	}
	public void method3() {
		//1���� 10������ Ȧ���� ���
		
		int i=1;
		while(i <= 10) {
			System.out.println(i + " ");
			i += 2; 
		}
	}
	public void method4() {
		//���� �� ���� �Է¹޾� �� ���� ���� ���
		
		//���� �ΰ��� �Է��ϼ���.
		//��, ù��° ���ڰ� �ι��� ���ں��� �۰� �Է����ּ���
		//ù��° ����:
		//�ι�° ����:
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �ΰ��� �Է��ϼ���."
				+ "��, ù��° ���ڰ� �ι��� ���ں��� �۰� �Է����ּ���");
		System.out.print("ù��° ���� : ");
		int start =sc.nextInt();
		System.out.print("�ι�° ���� : ");
		int end =sc.nextInt();
		
		int max =0;
		int min =0;
		
		if(start > end) {
			max = start;
			min = end;
		}else {
			max =end;
			min =start;
		}
		
		while(min <= max) {
			System.out.print(min + " ");
			min++;
		}
	}
	public void method4_1() {
		//������ �ϳ� �Է¹޾� �� ���� 1~9 ������ �� �ϴ븸 �� ���� ���������
		//������ ���� ������ 1~9 ������ ����� �Է��Ͽ����մϴ� ���
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("���� �ϳ� �Է� :");
//		int num1 = sc.nextInt();
//		
//		int i = 1;
//				
//		while(i <= 9) {
//			System.out.println(num1 + "*" + i + "=" + (i * num1));
//			i++;
//		}
				
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է� :");
		int dan = sc.nextInt();
		
		if(dan >= 1 && dan <=9) {
			int i =1;
			while (i < 10) {
				System.out.printf("%d * %d = %d%n", dan, i, (dan*1));
				i++;				
			}
		}else {
			System.out.println("1~9������ ����� �Է��Ͽ��� �մϴ�.");
		}
			
	}
	public void method5() {
		//1���� 10������ ������ ������ ���� 1���� ���������� ���� �հ� ���
						
		int random =(int)(Math.random() * 10 )+ 1;
		int sum = 0;
		
		int i = 1;
		while(i <= random) {
			sum += i;
			i++;
		}
			System.out.printf("1���� %d������ ���� �հ� : %d", random, sum);
		}
	
	public void method6() {
		//����ڿ��� ���ڿ��� �Է¹޾� �ε��� ���� ���� ���
		//���ڿ� �Է� : apple
		//0 : a
		//1 : p
		//2 : p
		//3 : l 
		//4 : e
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� �Է� : ");
		String str = sc.nextLine();//apple
		
		//���ڿ��� ���̸� ��ȯ�ϴ� �޼ҵ� : length() //���ڿ��� ��� ����� �˷��ִ� �޼ҵ�
		int length = str.length();
		System.out.println(str + "�� ���� : " + length);
		
		//for		
		for(int i = 0; i < length; i++) {
			char ch = str.charAt(i);
			System.out.println(i + ":" + ch);
		}
				
		//while
		int i = 0;
		while(i<length) {
			char ch = str.charAt(i);
			System.out.println(i + ":" + ch);
			i++;
		}
		
	}
	public void method7() {
		//2�ܺ��� 9�ܱ��� ���
		
		int dan = 2;
		while(dan <= 9) {
			int su = 1;
			while(su<=9) {
				System.out.printf("%d * %d = %d%n",dan,su,(dan*su));
				su++;	
			}	
				dan++;
					System.out.println();
			}
						
	}
	
	public void method8() {
		//�Ƴ��α� �ð� 
		
		int hour = 0;
		while(hour <= 24) {
			int min = 0;
		 	while(min <= 60) {
		 		System.out.printf("%2d�� %2d�� %n",hour,min);
		 		//%02d�� �ϰԵǸ� �տ� 02�� �����Ǽ� 2�ڸ��� ���缭 ǥ�õȴ�.
		 		//������ ���� �ǵ� 2�ڸ��� Ȯ���ؼ� %3d�� 3�ڸ��� Ȯ���ؼ� �ְڴ�.
		 		//��ĭ�� ���Ͽ� %2d�⺻������ ������ �����̴�. %-2d�� �ϸ� ���������� �ȴ�.
		 		min++;			
		 	}
		 		hour++;
			}
	}
	public void method9() {
		//**��~~~~~~~~~~~~~~~~~~~~~�� ���� �����. 
		//�޴� �ݺ��� ��� �������� ���Ϲ��� �� ���� ����.
		
		int menuNum = 0;//�ʱ�ȭ���ش�.
		while(menuNum !=9) {
			Scanner sc = new Scanner(System.in);
			System.out.println("1. 1~5���� ���");
			System.out.println("2. 5~1���� ���");
			System.out.println("3. 1~10�縮 Ȧ�� ���");
			System.out.println("9. ����");
			System.out.print("�޴����� : ");
			menuNum = sc.nextInt();
			//int menuNum = sc.nextInt();
			//���ÿ����� �������� ������ ���� �̸��� �ΰ��� ���� ��.
			//int�� �����ָ�ȴ�.
			
			switch(menuNum) {
			case 1: method1(); break;
			case 2: method2(); break;
			case 3: method3(); break;
			case 9: System.out.println("�����մϴ�."); break;
			default: System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}
		}
		// ���Ϲ� -> �Է� -> �޴����� -> ����ġ -> �޼ҵ� ���� -> �극��ũ -> �ٽ� ���Ϲ� ���� -> ���� Ȯ�� -> �ݺ� 
		
		
	}
	
}
	
	

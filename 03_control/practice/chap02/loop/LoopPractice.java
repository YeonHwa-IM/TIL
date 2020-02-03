package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	//�ǽ����� 1
	/*����ڷκ��� �� ���� ���� �Է� �޾� 1���� �� ���ڱ����� ���ڵ��� ��� ����ϼ���.
	��, �Է��� ���� 1���� ũ�ų� ���ƾ� �մϴ�.
	���� 1 �̸��� ���ڰ� �Էµƴٸ� ��1 �̻��� ���ڸ� �Է����ּ��䡰�� ����ϼ���.
	
	ex.
	1�̻��� ���ڸ� �Է��ϼ��� : 4 
	1 2 3 4 
	
	1�̻��� ���ڸ� �Է��ϼ��� : 0
	1 �̻��� ���ڸ� �Է����ּ���.
	*/
	
	public void practice1() {
	Scanner sc = new Scanner(System.in);
	int num = 0;
	while(1>num) {
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		num = sc.nextInt();
		
		if(1<=num) {
			for(int i=1; i<=num; i++) {
				System.out.print(i +" ");
			}
			}else if(1>num) {
				System.out.println("1�̻��� ���ڸ� �Է����ּ���.");
		}
	}
	}
	//�ǽ����� 2
	/*�� ������ ��� ���� �����ϳ�, 1 �̸��� ���ڰ� �Էµƴٸ�
	��1 �̻��� ���ڸ� �Է����ּ��䡱�� ��µǸ鼭 �ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���.
	
	ex.
	1�̻��� ���ڸ� �Է��ϼ��� : 4
	1 2 3 4 
	
	1�̻��� ���ڸ� �Է��ϼ��� : 0
	
	1 �̻��� ���ڸ� �Է����ּ���.
	1�̻��� ���ڸ� �Է��ϼ��� : 8
	
	1 2 3 4 5 6 7 8 
	*/
	
	public void practice2() {
	Scanner sc = new Scanner(System.in);
	int num = 0;
	while(1>num) {
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		num = sc.nextInt();
		
		if(1<=num) {
			for(int i=1; i<=num; i++) {
				System.out.print(i +" ");
			}
			}else if(1>num) {
				System.out.println("1�̻��� ���ڸ� �Է����ּ���.");
		}
	}
	
	}
	//�ǽ����� 3
	/*����ڷκ��� �� ���� ���� �Է� �޾� 1���� �� ���ڱ����� ��� ���ڸ� �Ųٷ� ����ϼ���.
	��, �Է��� ���� 1���� ũ�ų� ���ƾ� �մϴ�.
	ex.
	1�̻��� ���ڸ� �Է��ϼ��� : 4
	4 3 2 1 
	
	1�̻��� ���ڸ� �Է��ϼ��� : 0
	1 �̻��� ���ڸ� �Է����ּ���.
	*/

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		int num=0;
		while(1>num) {
			System.out.print("1�̻��� ���ڸ� �Է��ϼ���. : ");
			num = sc.nextInt();
			
			if(1<=num) {
				for(int i=num; i>=1 ; i--) {
					System.out.print(i + " ");
				}
				}else if(1>num) {
					System.out.println("1�̻��� ���ڸ� �Է����ּ���.");
										
				}
			}
		}
	
		
		

	//�ǽ����� 4
	
	/*
	 �� ������ ��� ���� �����ϳ�, 1 �̸��� ���ڰ� �Էµƴٸ�
	��1 �̻��� ���ڸ� �Է����ּ��䡱�� ��µǸ鼭 �ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���.
	
	1�̻��� ���ڸ� �Է��ϼ��� : 4
	4 3 2 1 
	
	1�̻��� ���ڸ� �Է��ϼ��� : 0
	1 �̻��� ���ڸ� �Է����ּ���.
	
	1�̻��� ���ڸ� �Է��ϼ��� : 8
	8 7 6 5 4 3 2 1
	 */
	public void practice4() {
		{
			Scanner sc = new Scanner(System.in);
			int num=0;
			while(1>num) {
				System.out.print("1�̻��� ���ڸ� �Է��ϼ���. : ");
				num = sc.nextInt();
				
				if(1<=num) {
					for(int i=num; i>=1 ; i--) {
						System.out.print(i + " ");
					}
					}else if(1>num) {
						System.out.println("1�̻��� ���ڸ� �Է����ּ���.");
											
					}
				}
			}
	}
	//�ǽ����� 5
	/*1���� ����ڿ��� �Է� ���� �������� �������� ���� ����ϼ���.
	ex.
	������ �ϳ� �Է��ϼ��� : 8
	1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36*/
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �ϳ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		int sum = 0;
		for(int i=1; i<=num; i++) {
			sum += i;
			if(i<8) {
				System.out.print(i + " + ");
			}else if(i == 8) {
				System.out.print(i + " = " + sum);
			}
		}
	}
	
	
//���ƾ��� �˷��� Ǯ��
//	//1	
//		Scanner sc = new Scanner(System.in);
//	//2
//		System.out.print("������ �ϳ� �Է��ϼ��� : ");
//		int num = sc.nextInt();
//	//3	
//		int sum=0;//���� �հ踦 ���� ���� �����.
//	//4
//		for(int i=1; i <= num; i++) {
//			if(i == num) {
//				System.out.print(i + " = "); //i�� 8�� �Ǿ����� +�� �ƴ� =�� ���
//			}else {
//			System.out.print(i + " + "); // 1~num������ ���.
//			}
//			sum += i; //1~num������ �������� �� / sum = sum + i /0+=1 1~num���� ���� 
//		}
//		System.out.print(sum);
//	}
	
	//�ǽ����� 6
	
	/*
	 ����ڷκ��� �� ���� ���� �Է� �޾� �� ������ ���ڸ� ��� ����ϼ���.
	���� 1 �̸��� ���ڰ� �Էµƴٸ� ��1 �̻��� ���ڸ� �Է����ּ��䡰�� ����ϼ���.
	ex.
	ù ��° ���� : 8 	ù ��° ���� : 	4 	ù ��° ���� : 9
	�� ��° ���� : 4 	�� ��° ���� : 	8 	�� ��° ���� : 0
	4 5 6 7 		8 4 5 6 7 8 	1 �̻��� ���ڸ� �Է����ּ���.
	*/
	public void practice6() {
	//�ǽ����� 7 //** ����Ǯ��
	/*�� ������ ��� ���� �����ϳ�, 1 �̸��� ���ڰ� �Էµƴٸ�
	��1 �̻��� ���ڸ� �Է����ּ��䡱�� ��µǸ鼭 �ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���
	ex.
	ù ��° ���� : 8 	ù ��° ���� : 4 	ù ��° ���� : 9
	�� ��° ���� : 4 	�� ��° ���� : 8 	�� ��° ���� : 0
	4 5 6 7 8 		4 5 6 7 8 		1 �̻��� ���ڸ� �Է����ּ���.
	
	ù ��° ���� : 6
	�� ��° ���� : 2
	2 3 4 5 6		*/
		Scanner sc =new Scanner(System.in);

		System.out.print("ù��° ���� : ");
		int first = sc.nextInt();
		System.out.print("�ι�° ���� : ");
		int end = sc.nextInt();
		
		int max =0;
		int min =0;
		
		if(first < end) {
			max=end;
			min=first;
			
		}else if(first > end) {
			max=first;
			min=end;
		}
		
		if(1<min) {
			for(int i=min; min<=max; min++) {
				System.out.print(min + " ");
			}
			}else if(1>min) {
			System.out.println("1�̻��� ���ڸ� �Է��� �ּ���.");
				
			}
			System.out.println();
		}
	
	
	public void practice7() {
		Scanner sc =new Scanner(System.in); //�ӿ�ȭǮ��
//		int max =0;
//		int min =0;
	while(true) {	
		System.out.print("ù��° ���� : ");
		int first = sc.nextInt();
		System.out.print("�ι�° ���� : ");
		int end = sc.nextInt();
		
		 int max =0;
		 int min =0;
		
		if(first < end) {
			max=end;
			min=first;
			
		}else if(first > end) {
			max=first;
			min=end;
		}
		
		if(1<min) {
			for(int i=min; min<=max; min++) {
				System.out.print(min + " ");
				}break;
				
			}else if(1>min) {
			System.out.println("1�̻��� ���ڸ� �Է��� �ּ���.");
				
			}
			System.out.println();
		}
	}
		
	
// �ڽſ� �� Ǯ��		
//		Scanner sc = new Scanner(System.in);
//		
//	while(true) { 
// ù��° ���� �Էº��� �� �Է±��� ���Ϸ� ����, ���� ��µǼ� ������ ������ ������ �κп� �극��ũ �ɾ��ش�.
//		
//		System.out.print("ù ���� ���� : ");
//		int num1 = sc.nextInt();
//		System.out.print("�� ���� ���� : ");
//		int num2 = sc.nextInt();
//		
//		if(num1 >= 1 && num2 >= 1) { 
//			
//			int max = 0;
//			int min = 0;
//			
//			if(num1 > num2) {
//				max = num1;
//				min = num2;
//			}else {
//				max = num2;
//				min = num1;
//			}
//			
//			for(int i = min; i <= max; i++) {
//				System.out.print(i + " ");
//			}
//			
//			 break;
//		} else {
//			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
//		}
//	}
//}
	//�ǽ����� 8 / 8~9~10 ����� ����!
	//����ڷκ��� �Է� ���� ������ ���� ����ϼ���
	/*ex.
	���� : 4
	===== 4�� =====
	4 * 1 = 4
	4 * 2 = 8
	4 * 3 = 12
	4 * 4 = 16
	4 * 5 = 20
	4 * 6 = 24
	4 * 7 = 28
	4 * 8 = 32
	4 * 9 = 36*/
	public void practice8() { //�ӿ�ȭ Ǯ��
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("���� : ");
			int dan = sc.nextInt();
			
			if(dan<=9) {
				for(int i=dan; i<=9; i++) {
					System.out.println("====="+ dan +"�� =====");
					for(int su=1; su<=9; su++) {
						System.out.printf("%d * %d = %d%n", i, su, (i*su));
					}
				}
				break;
			}else if(dan > 9) {
				System.out.println("9������ ���ڸ� �Է����ּ���.");
			}
		}
	}
	//�ǽ����� 9 /8~9~10 ����� ����!
	/*����ڷκ��� �Է� ���� ������ �ܺ��� 9�ܱ��� ����ϼ���.
	��, 9�� �ʰ��ϴ� ���ڰ� ������ ��9 ������ ���ڸ� �Է����ּ��䡱�� ����ϼ���.
	���� : 4 ���� : 10
	===== 4�� ===== 9 ������ ���ڸ� �Է����ּ���.
	===== 5�� =====
	===== 6�� =====
	===== 7�� =====
	===== 8�� =====
	===== 9�� =====
	(�ش� ���� ������� ���� �� ����)*/
	public void practice9() { //�ӿ�ȭ Ǯ��
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("���� : ");
			int dan = sc.nextInt();
			
			if(dan<=9) {
				for(int i=dan; i<=9; i++) {
					System.out.println("====="+ dan +"�� =====");
					for(int su=1; su<=9; su++) {
						System.out.printf("%d * %d = %d%n", i, su, (i*su));
					}
				}
				break;
			}else if(dan > 9) {
				System.out.println("9������ ���ڸ� �Է����ּ���.");
			}
		}
	}
	
	//�ǽ����� 10  /8~9~10 ����� ����! //** ����Ǯ��
	/*�� ������ ��� ���� �����ϳ�, 9�� �ʰ��ϴ� ���ڰ� �Էµƴٸ�
	��9 ������ ���ڸ� �Է����ּ��䡱�� ��µǸ鼭 �ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���.
	���� : 4 ���� : 10
	===== 4�� ===== 9 ������ ���ڸ� �Է����ּ���.
	===== 5�� ===== ���� : 8
	===== 6�� ===== ===== 8�� =====
	===== 7�� ===== ===== 9�� =====
	===== 8�� =====
	===== 9�� =====
	(�ش� ���� ������� ���� �� ����)*/
	public void practice10() { //�ڽſ�� Ǯ��
		
		Scanner sc = new Scanner(System.in);
		
	while(true) {	// �ݺ��Ǿ���ϴ� ���� �Է� ���� ������� ��¿Ϸ� �Ŀ� �극��ũ �ɱ�.
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		if(num <= 9) {
			for(int i = num; i <= 9; i++) {
				System.out.print("==== " + num +"�� ====");
				for(int j = 1; j <= 9; j++) {
					System.out.printf("%d * %d = %d%n", i, j, i*j);
				}
				System.out.println();
			}
			
			break;
		}else {
			System.out.println("9������ ���ڸ� �Է����ּ���.");
		}
	}	
}
	//�ǽ����� 11 /**����Ǯ��
	/*
	 ����ڷκ��� ���� ���ڿ� ������ �Է� �޾�
	������ ������ ���ڰ� Ŀ���ų� �۾����� ���α׷��� �����ϼ���.
	��, ��µǴ� ���ڴ� �� 10���Դϴ�.
	* ���������� ���ڵ� ���̿��� ������ ������ ���� �����ϴ� ���� ���Ѵ�.
	ex) 2, 7, 12, 17, 22 ��
	5 5 5 5 => ���⼭ ������ 5
	ex.
	���� ���� : 4
	���� : 3
	4 7 10 13 16 19 22 25 28 31*/
	public void practice11() { //Ǯ�� �������� �����ϰų� �ܿ��
// ī���� ������ ������ �ӿ�ȭ Ǯ�� ����.
//		Scanner sc = new Scanner(System.in);
//		System.out.print("���� ���� : ");
//		int start = sc.nextInt();
//		System.out.print("���� ���� : ");
//		int num = sc.nextInt();
//		
//		int num1 = num*10+1;
//		
//		for(int i=start; start <= num1; i+=num) {
//			System.out.println(i + " ");
//			
//		}
//	}
// ������ Ǯ��
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� : ");
		int start = sc.nextInt();
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		
		int count = 0; //�� 10���� �Ǿ����� �����ִ� ���� , 10���� �����ִ� ������ �ϳ� ������.
		for(int i = start; ; i += num) { //ī��Ʈ�� ���ű⶧���� ��������� ������ ���� ����.
			System.out.print(i + " "); // �ѹ� ���1 , �ι� ��� 2, ...��� 10 
			count++;
			
			if(count == 10) { // ���� ī��Ʈ�� 10�� �Ǿ��ٸ� �극��ũ �ɾ��شٴ� ��.
				break;
			}
		}		
	}
		
	//�ǽ����� 12 //**���� Ǯ��
	/*���� �� ���� �����ڸ� �Է� �ް� �Էµ� �����ڿ� ���� �˸��� ����� ����ϼ���.
	��, �ش� ���α׷��� ������ �Է¿� ��exit����� ���� ���� ������ ���� �ݺ��ϸ�
	exit�� ������ �����α׷��� �����մϴ�.���� ����ϰ� �����մϴ�.
	���� �����ڰ� �������̸鼭 �� ��° ������ 0���� ������
	��0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.���� ����ϸ�,
	���� �����ڰ� ���� �� ������ �������Դϴ�. �ٽ� �Է����ּ���.����� ����ϰ�
	�� ��� ��� ó������ ���ư� ����ڰ� �ٽ� �����ں��� �Է��ϵ��� �ϼ���.
	[���� �� ��� ���� ����]
	������(+, -, *, /, %) : +
	����1 : 10
	����2 : 4
	10 + 4 = 14
	
	
	������(+, -, *, /, %) : / 	������(+, -, *, /, %) : /
	����1 : 10 					����1 : 10
	����2 : 4 					����2 : 0
	10 / 4 = 2 					0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.
	
	
	������(+, -, *, /, %) : ^ 	������(+, -, *, /, %) : exit
	����1 : 10 					���α׷��� �����մϴ�.
	����2 : 4
	���� �������Դϴ�. �ٽ� �Է����ּ���.			*/
	
	public void practice12() {
	//0
		Scanner sc = new Scanner(System.in);
		
	while(true) {	
		
		//1
		System.out.print("������(+, -, *, /, %) : ");
		String op = sc.nextLine();
		
		//3
		if(op.equals("exit")) {
			System.out.println("���α׷��� �����մϴ�.");
			break;
		}
		
		//1-1
		System.out.print("����1 : ");
		int num1 = sc.nextInt();
		// int num1 = Integer.parseInt(sc.nextLine()); �Ľ��ϴ� ���
		System.out.print("����2 : ");
		int num2 = sc.nextInt(); 
		// int num2 = Integer.parseInt(sc.nextLine()); �Ľ��ϴ� ���
		
		//** ��Ƽ�� ���Ŀ� 1�� ��Ʈ�������� ���⿡ �����ִ� �ٳѱ⸦ ������ ������ �׷���.
		//�ذ���1)  1���� �ؽ�Ʈ�� �ϰų�, 
		//�ذ���2) �Ľ��ϰų�.
		//�ذ���3) ����2�� �����ִ� �ٹٲ��� ��������
		//sc.nextLine(); �ؽ�Ʈ ������ �ϳ� ����ֱ�.
		sc.nextLine(); 
		
		//2 �������̸鼭 
		
		if(op.equals("/") && num2 == 0) {
			System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.\n");
			continue;
		}
		//4
		
		switch(op) {
		case "+" :
			System.out.printf("%d %s %d = %d%n", num1, op, num2, (num1 + num2));
			break;
		case "-" :
			System.out.printf("%d %s %d = %d%n", num1, op, num2, (num1 - num2));
			break;
		case "*" :
			System.out.printf("%d %s %d = %d%n", num1, op, num2, (num1 * num2));
			break;
		case "/" :
			System.out.printf("%d %s %d = %d%n", num1, op, num2, (num1 / num2));
			break;
		case "%" :
			System.out.printf("%d %s %d = %d%n", num1, op, num2, (num1 % num2));
			break;
//5
		default:
			System.out.println("���� ������ �Դϴ�. �ٽ� �Է����ּ���.\n");
		}
	}
		
		
		
		
		
		
	}
	//�ǽ����� 13
	/*
	 * ������ ���� ���� ������ �����ϼ���.
	ex.
	���� �Է� : 4
	*
	**
	***
	****		*/
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
			  
		for(int i=1; i<=num; i++) { // 1���� 4���� �þ��.
			for(int j=1; j<=i; j++) { //1���� 4���� �þ�� ����
				System.out.print("*");
			}
				System.out.println();
	}
	}
	
	
	//�ǽ����� 14
	/*������ ���� ���� ������ �����ϼ���.
	ex.
	���� �Է� : 4
	****
	***
	**
	*		*/

	
	public void practice14() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt(); 

		for(int i=1; i<=num; i++) { // 1���� 4���� �þ��.
			for(int j =num; j>=i; j--) { //4���� 1���� �پ��� ����.
				System.out.print("*");
			}
				System.out.println();
		}
	}
}

		



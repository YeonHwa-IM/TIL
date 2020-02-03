package com.kh.example.chap02.loop;

import java.util.Scanner;

public class A_For {
	/*
	 for(�ʱ��;���ǽ�;������){
	 	���๮��;
	 }
	 �ʱ�� -> ���ǽ�->(���ǹ��� true�϶�)���๮�� -> ������ -> ���ǽ� Ȯ�� ->(�ݺ�)
	 ���ǽ� ����� false�� �� ������ �ݺ�
	 �������� for���� ���������� ��ġ.
	 
	 for�� �ȿ� �ִ� �ʱ��, ���ǽ�, ������ ��� ���� ����
	  ������, ��� ���������� �ݺ����� �������� ���� ������ 
	  for�� ���̳� �ۿ��ٰ� �ʱ���� �������� ������ �������� ������ �󸶳� �ɰ����� ��� ǥ���ؾ���.
	  ��, for() �ȿ����� ������ �� ��� �ʿ��� �����.
	 	 
	 */
	public void method1() {
		//1���� 5���� ���
		
		for(int i=1; i <= 5; i++) {
			System.out.println(i+ "��° �ݺ��� ����");
			
		}
	}
	
	public void method1_1() {
		//�ڱ�Ұ� 5�� �ϱ� : �� �̸��� �ڽſ��.
		
		for(int i=0; i <=4; i++) { //�������� �� 1�� �ƴϾ �ȴ�.
			System.out.println("�� �̸��� �ڽſ��");//i�� �� Ȱ������ �ʾƵ� �ȴ�.
		}
	}
	
	public void method2() {
		//5����1���� ����ϱ�
		
		for(int i=5; i >= 1; i--) {
			System.out.println(i);
		}	
//		for(int i=1; i >= 5; i++) {
//			System.out.println(6 - i);
//		}
	}
	public void method2_1() {
		// 8���� 3���� ���
		
		for(int i=8; i >=3; i--) {
			System.out.println(i);
		}
	}
	public void method3() {
		//1���� 10������ Ȧ���� ���
		// 1 3 5 7 9
		
		for(int i=1; i <= 10; i+= 2) {
			System.out.print(i + " ");
		}//�Ǵ� 
		for(int i=1; i <= 10; i++) {
			if(i % 2 != 0) { // if(i %2 == 1)
				System.out.print(i + " ");
			}
			
		}
	}
	public void method4() {
		// ���� �ΰ��� �Է¹޾� �׻��� ���� ���
		/*
		 * ���� �ΰ��� �Է��ϼ���.
		 * ��, ù��° ���ڰ� �ι�° ���ں��� �۰� �Է����ּ���.
		 * ù��° ���� : 1
		 * �ι�° ���� : 5
		 * 1 2 3 4 5
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �ΰ��� �Է��ϼ���. "
				+ "��, ù��° ���ڰ� �ι�° ���ں��� �۰� �Է����ּ���.");
		
		System.out.println("ù��° ���� : ");
		int start =sc.nextInt();
		System.out.println("�ι�° ���� : ");
		int end =sc.nextInt();
		
		int max = 0;
		int min = 0;
		
		if(start > end) {
			max = start;
			min = end;
		}else {
			max = end;
			min = start;
		}
					
		for(int i = min; i <= max; i++ ) {
			System.out.print(i + " ");
		}
		
//		for(; min <= max; min++) {
//			System.out.print(min + " "); //�����ؼ� ĥ�� �ִٴ°� �׳� �˾Ƶα�.
			
		}
	public void method4_1() {
		//���� �ϳ��� �Է¹޾� �� ���� 1~9 ������ ���϶��� �� ���� ������ ���
		//������ ���� ������ "1~9 ������ ����� �Է��Ͽ��� �մϴ�." ���
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �ϳ��� �Է��ϼ��� : ");
		int dan = sc.nextInt();
			for(int i =1; i<=9; i++) {
				System.out.println(dan + " * " + i + " = " + (dan*i));
			}
		if(dan >= 1 && dan <= 9) {
			
		}else {
			System.out.println("1~9������ ����� �Է��Ͽ��� �մϴ�.");
		}
		
	}
	public void method5() {
		//1���� 10������ ������ ������ ���� 1���� ���������� ���� �հ�
		//Ȩ������ �̺�Ʈ ������ �� ���鶧 ���.
		
		//Math.random();//������ ����(�Ǽ�)�� ��ȯ�ϴ� �޼ҵ�
		//���� Math.random()�� ���� : 0 <= Math.random() < 1
		// 10���� ����� ���� 10���ϱ�: 0 <= Math.random() * 10 < 10
		// 10�� �����ϱ� ���� 1���ϱ� : 1 <= Math.random() * 10 + 1 < 11
		//������ ����� ���� int����ȯ : 1 <= (int)(Math.random() * 10 + 1) < 11
	
		int random = (int)(Math.random() * 10 + 1);
		//������ ��Ʈ�� �������ؼ� ������
//		System.out.println(random);//���� ���� ����.
		int sum=0;//���� �հ踦 ���� ���� �����
		
		for(int i = 1; i <= random; i++) {
			sum += i;
		}
		System.out.printf("1���� %d���� �����հ� : %d", random, sum);
	}
	public void method6() {
		//2�ܺ��� 9�ܱ��� ��� //�ٹٲ� %n /n
		
		for(int dan = 2; dan <=9; dan++) {
			for(int su = 1; su <= 9; su++) {
				System.out.printf("%d * %d = %d%n", dan, su, (dan*su));
			}
			System.out.println();//�ٹٲ޸�����ش�. **���̿� ������ �����غ���. **���� ������ ���� �Ƚ��� ���� �ִ���.
		}		
		
	}
	public void method7() {
		//�Ƴ��α� �ð� ��� : 0��0�� ~ 23��59��
		//�ݺ��Ǵ°� 0��~59��, ���� ���ʿ� �־�� �Ѵ�.
		
		for(int hour = 0; hour < 24; hour++) {
			for(int min = 0; min < 60; min++) {
				System.out.printf("%d�� %d��%n", hour, min);
			}
		}
		
		
	}
	public void method8() {
		//���ٿ� ��(*)ǥ�� 5�� ��µǴµ�
		//�� ���� ����ڰ� �Է��� ����ŭ ���
		/*
		 ����� �ټ� :3
		 *****
		 *****
		 *****
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����� �� �� : ");
		int row = sc.nextInt();
		
		for(int i = 1; i <= row; i++) {
			for(int j = 1; j <= 5; j++) {
			System.out.print('*');
			
		}
		System.out.println();
		}	
	}
	public void method9() {
		//�� �ٿ� ��ǥ ���ڸ� �Էµ� �� ���� ĭ �� ��ŭ �Է�
		//��, �� ���� ĭ���� ��ġ�ϴ� ��ġ���� �� ��ȣ�� ���� ������ ���
		/*  
		 	�� �� : 6    �� �� : 5    �� �� : 4
		 	ĭ �� : 6    ĭ �� : 4    ĭ �� : 5
		 	1*****   1***		1****
		 	*2****   *2**		*2***
		 	**3***   **3*		**3**
		 	****4**  ***4		***4*
		 	*****5*  ****
		 	******6
		 		 	
		*/
	  Scanner sc = new Scanner(System.in);
	  System.out.print("�� �� : ");
	  int row = sc.nextInt();
	  System.out.print("ĭ �� : ");
	  int lin = sc.nextInt();
	  
	  for(int i = 1; i <= row; i++) {
		  for(int j =1; j <= lin; j++) {
			  if(i == j) {
				  System.out.print(i);
			 }else {
				  System.out.print("*");
			 }
		  }
			  System.out.println();
		  }
	  }
}


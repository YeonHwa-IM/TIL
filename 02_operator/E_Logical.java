package com.kh.operator;

import java.util.Scanner;

public class E_Logical {

		//&& : �ǿ����ڰ� ��� true �϶� true ��ȯ(�׸���, ~�鼭)
		//|| : �ǿ����� �߿��� �ϳ��� true�϶� true ��ȯ(�Ǵ�, ~�ų�)
		
	public void method1() {
		//�Է��� ���� ���� 1~100 ������ �������� Ȯ��
		//���� �ϳ� �Է� :
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �ϳ� �Է� : ");
		int num = sc.nextInt();
		
		// 1~100������ ����
		// ���ڰ� 1���� ũ�ų� ��<<<��>>>,100���� �۰ų� ����. ===> and
		
		System.out.println("1���� 100������ �������� Ȯ�� : " + (num >= 1 && num <= 100));
		
	}
	public void method2() {
	 // �Է��� ���� ���� �빮������ Ȯ��
	 // ���� �ϳ� �Է� :
	
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("���� �ϳ� �Է� : ");
	 char ch = sc.nextLine().charAt(0); //�𸣰ڴ�
	 
	 boolean isCap = (ch >= 'A' && ch <= 'Z'); 
	 //�����ϳ��� ���ڷ� ġȯ�Ҽ��ֱ⶧���� ũ�� �۴ٷ� ǥ���Ҽ� �ִ�.
	 System.out.println("���� �빮�ڰ� �½��ϱ�? : " + isCap);
	 
	 //����Ͻ÷��� y Ȥ�� Y�� �Է��ϼ��� :
	 //����ϰڴٰ� �ϼ̽��ϱ�? :_______(��� ���� ���̵���)
	 
	 System.out.println("����Ͻ÷��� y Ȥ�� Y�� �Է��ϼ��� : ");
	 char ch2 = sc.nextLine().charAt(0); 
	 //��������� ����
	 System.out.println("��� �ϰڴٰ� �ϼ̽��ϱ�? : " +(ch2 == 'y' || ch2 == 'Y')); 
	 //**�ݺ������� ���� ���� �� �����ϱ�
	 //	 boolean isCap = (ch2 = "y" && ch2 = 'Y'); ���� Ʋ��.
	 
	
	 
	 
	 
	 		
	}

}

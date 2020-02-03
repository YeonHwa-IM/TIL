package com.kh.example.chap01.condition;

import java.util.Scanner;

public class D_Switch {
	//���ǽ��� ��� ���� case���� ã�� ����� �����ϴ� ���ǹ�
	//�ش��ϴ� ���� case�� ���� ��� default�� ��ɹ� ����
	
	//case�� ���๮ ���̿��� �ݷ�(;)�� ����ϸ�
	//break�� ������ ������ �ʰ� ��� ������
	
	public void method1() {
		//���� �ΰ��� ���� ��ȣ ���� 1���� �Է¹޾Ƽ�
		//���� ��ȣ ���ڿ� �ش��ϴ� ����� �����ϰ� ����ϼ���
		/*
		 * ù��° �� :
		 * �ι�° �� :
		 * ������ (+,-,*,/) :
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° �� : ");
		int first =sc.nextInt();
		
		System.out.print("�ι�° �� : ");
		int second =sc.nextInt(); //���Ϳ� �ٹٲ��� ������ �ִ»���
		sc.nextLine();
		
		System.out.print("������(+,-,*,/) : ");
		char op = sc.nextLine().charAt(0);
		//**String str =sc.next();
		// java.lang.StringIndexOutOfBoundsException: String index out of range: 0
		//�̹��� nextInt���� ���ܳ��� �ٹٲ��� nextLine���� ���ۿ� �������ִ� �ٹٲ��� �����ͼ� ��������.
		//�ٹٲ��� 100���ص� �ٹٲ��� ���� �� 1���� ������ ����
		//OutOfBoundsException �迭������ �ִ� ����.
		//**���ø����̼� ���鶧���� �������� �����⶧���������س��°� ����
		//1. �Ľ��� �ϰų� 2. �ؽ�Ʈ�������� ���ų�..
				
		int result = 0; //���� ��� ����� ���� 
		
		switch(op) {
		case '+':
			result = first + second;
			break;
		case '-':
			result = first - second;
			break;	
		case '*':
			result = first * second;
			break;
		case '/':
			result = first / second;
		}	
			//�������̴ϱ� break �ȵ��� �ȴ�.
		System.out.println(first + " " + op + " " + second + " = " + result);	
			
		}
	public void method2() {
		//������ �Է��Ͽ� ����� 1000, �ٳ����� 3000, �����ƴ� 2000, Ű���� 5000,
		//���ϰ��Կ� ���� ������ �Է��������� "�߸��Է��Ͽ����ϴ�." ����ϰ� �Ͽ���
		//���� �̸��� �Է��Ͻÿ� :
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �̸��� �Է��Ͻÿ� : ");
		String fruit = sc.nextLine();
		
		int price = 0;
		
		switch(fruit) {
		case "���":
			price = 1000;
			break;
		case "�ٳ���":
			price = 3000;
			break;
		case "������":
			price = 2000;
			break;
		case "Ű��":
			price = 5000;
			break;
		default:
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
			return; //break�� Ŀ���� ������ switch�� ���� ������ �� ���̽� ���� ���������ٴ� ��.
			//return���� Ŀ���� �ø��� void�� ���� ���´�.
			//"���� ȣ���� �޼ҵ忡�� ���ư��� ���".�̶�, "���� ������ ���ư������ְ� �ƹ��͵� ���� ���ư����� ����."
			//���ϵڿ� ���� �Է��س����� ���� ��� ȣ���� �޼ҵ�� ���ư����� ����.
			//���Ϲ��� �ƹ����� ��������� �ʴ´�.
			//��Ʈ�� Ŀ�� �ø��� ���� ȣ��Ǵ��� ��������
			//���ر������� , ���ؿ� ���̰� �׿��� �ͺ��� ����Ǵ� �����  LIPO ��� ��Ʈ�� �޽�Ʈ �ƿ� ��� �Ѵ�.
			//�⺻������ ���� �Ʒ����� �ڵ带 ���� ������, ���ǿ� ���� ���ϾƷ� �ڵ忡 �����Ҽ� �ִ°�� ���� �������� �ʴ´�.
		}
				
		System.out.println(fruit + "�� ������ " + price + "���Դϴ�.");
	}
	
	public void method3() {
		//����ڰ� �Է��� �޴� ��ȣ�� ���� �޴��� ��µǰ� �Ͻÿ�.
		/*
		  1. ȸ�����
		  2. ȸ������
		  3. ȸ������
		   �޴���ȣ�� �Է��ϼ��� :
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1. ȸ�����");
		System.out.println("2. ȸ������");
		System.out.println("3. ȸ������");
		System.out.println("�޴� ��ȣ�� �Է��ϼ��� : ");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1:
			System.out.println("ȸ����� �޴��Դϴ�.");
//			method1(); �޼ҵ� ȣ��~
			break;
		
		case 2:
			System.out.println("ȸ������ �޴��Դϴ�.");
			break;
	    case 3:
			System.out.println("ȸ������ �޴��Դϴ�.");
			break;
		default:
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
			
	}
	public void method4() {
		//1������ 12������ �Է¹޾� �ش��ϴ� ���� ������ ��¥�� ����ϼ���
		//�Է��Ͻ� ���� 00�ϱ��� �Դϴ�.
		Scanner sc = new Scanner(System.in);
		System.out.print("1��~12������ �� �ϳ��� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("�Է��Ͻ� ���� 31�ϱ��� �Դϴ�.");
			break;
		case 4:	case 6:	case 9: case 11:
			System.out.println("�Է��Ͻ� ���� 30�ϱ��� �Դϴ�.");			
			break;
		case 2:	
			System.out.println("�Է��Ͻ� ���� 28�� Ȥ�� 29�ϱ��� �Դϴ�.");
			break;
		default:
			System.out.println("�ݵ�� 1~12 ������ ���ڸ� �Է��� �ּ���.");
		}//����� 
				
		switch(num) {
		case 1:
			System.out.println("�Է��Ͻ� ���� 31�ϱ��� �Դϴ�.");
			break;
		case 2:
			System.out.println("�Է��Ͻ� ���� 29�ϱ��� �Դϴ�.");
			break;
		case 3:
			System.out.println("�Է��Ͻ� ���� 31�ϱ��� �Դϴ�.");
			break;
		case 4:
			System.out.println("�Է��Ͻ� ���� 30�ϱ��� �Դϴ�.");
			break;
		case 5:
			System.out.println("�Է��Ͻ� ���� 31�ϱ��� �Դϴ�.");
			break;
		case 6:
			System.out.println("�Է��Ͻ� ���� 30�ϱ��� �Դϴ�.");
			break;
		case 7:
			System.out.println("�Է��Ͻ� ���� 31�ϱ��� �Դϴ�.");
			break;
		case 8:
			System.out.println("�Է��Ͻ� ���� 31�ϱ��� �Դϴ�.");
			break;
		case 9:
			System.out.println("�Է��Ͻ� ���� 30�ϱ��� �Դϴ�.");
			break;
		case 10:
			System.out.println("�Է��Ͻ� ���� 31�ϱ��� �Դϴ�.");
			break;
		case 11:
			System.out.println("�Է��Ͻ� ���� 30�ϱ��� �Դϴ�.");
			break;
		case 12:
			System.out.println("�Է��Ͻ� ���� 31�ϱ��� �Դϴ�.");
			break;
		default:
		}
		
		
	}
}


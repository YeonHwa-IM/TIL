package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	
	//�ǽ�����1
	/*�Ʒ� ���ÿ� ���� �޴��� ����ϰ� �޴� ��ȣ�� ������ ��OO�޴��Դϴ١���,
	���� ��ȣ�� ������ �����α׷��� ����˴ϴ�.���� ����ϼ���.
	ex.
	1. �Է�
	2. ����
	3. ��ȸ
	4. ����
	7. ����
	�޴� ��ȣ�� �Է��ϼ��� : 3
	��ȸ �޴��Դϴ�.*/
	public void practice1() {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("1. �Է�");
	System.out.println("2. ����");
	System.out.println("3. ��ȸ");
	System.out.println("4. ����");
	System.out.println("7. ����");
	System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
	int menuNum = sc.nextInt(); 
	
	switch(menuNum) {
		case 1:
			System.out.println("�Է� �޴��Դϴ�.");
			break;
		case 2:
			System.out.println("���� �޴��Դϴ�.");
			break;
		case 3:
			System.out.println("��ȸ �޴��Դϴ�.");
			break;
		case 4:
			System.out.println("���� �޴��Դϴ�.");
			break;
		case 7:
			System.out.println("���α׷��� ����˴ϴ�.");
			break;
		default:
		}		
	}
	
	//�ǽ�����2
	/*Ű����� ������ �Է� ���� ������ ����̸鼭 ¦���� ���� ��¦���١��� ����ϰ�
	¦���� �ƴϸ� ��Ȧ���١��� ����ϼ���.
	����� �ƴϸ� ������� �Է����ּ���.���� ����ϼ���.
	ex.
	���ڸ� �� �� �Է��ϼ��� : -8
	����� �Է����ּ���.*/
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �� �� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
				
		if(num > 0 && num %2 == 0) {
			System.out.println("¦����");
		}else if(num %2 !=0) {   // num %2 ==1 �� ���� 
			System.out.println("Ȧ����");
		}else if(num < 0) {
			System.out.println("����� �Է��� �ּ���.");
		}		
	}
	
	//�ǽ�����3
	/*����, ����, ���� �� ������ ������ Ű����� �Է� �ް� �հ�� ����� ����ϰ�
	�հ�� ����� �̿��Ͽ� �հ� / ���հ� ó���ϴ� ����� �����ϼ���.
	(�հ� ���� : �� ������ ������ ���� 40�� �̻��̸鼭 ����� 60�� �̻��� ���)
	�հ� ���� ��� ���� �� ������ �հ�, ���, �������մϴ�, �հ��Դϴ�!���� ����ϰ�
	���հ��� ��쿡�� �����հ��Դϴ�.���� ����ϼ���.
	[��� ���ô� ���� �忡]
	*/
	
	public void practice3() {
		//���� ���� ���� 
		// �հ�
		// ���
		//�հ� ���հ� ���� 40�� �̻� ��� 60�� �̻�
		//�հ� ����, ����, ���� ����, �հ�, ���, �����մϴ�. �հ�
		//���հ� ���հ��Դϴ�. ���
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� : ");
		int kor = sc.nextInt();
		
		System.out.print("���� ���� : ");
		int math = sc.nextInt();
		
		System.out.print("���� ���� : ");
		int eng = sc.nextInt();
		
		int sum = kor + math + eng;
//		double avg = sum/3; �̰͵� ����
		double avg = (kor + math + eng) / 3; 
		
		if(kor >= 40 && math >= 40 && eng >= 40 && avg >= 60) {
				System.out.println("���� : " + kor );
				System.out.println("���� : " + math );
				System.out.println("���� : " + eng );
				System.out.println("�հ� : " + sum );
				System.out.println("��� : " + avg );
				System.out.println("�����մϴ�, �հ��Դϴ�!");
			}else {
				System.out.println("���հ��Դϴ�.");
			}
		}
				

	//�ǽ����� 4
	
	/*���� �ڷ�(7page)���� if������ �Ǿ��ִ� ��, ����, ����, �ܿ� ������ switch������ �ٲ㼭 ����ϼ���.
	ex 1.
	1~12 ������ ���� �Է� : 8
	8���� �����Դϴ�.
	ex 2.
	1~12 ������ ���� �Է� : 99
	99���� �߸� �Էµ� ���Դϴ�.*/
	
	public void practice4() {
		/*
		if(month == 1 || month == 2 || month == 12)
		{
				season = "�ܿ�";
		} else if(month >= 3 && month <= 5) {
				season = "��";
		} else if(month >= 6 && month <= 8) {
				season = "����";
		} else if(month >= 9 && month <= 11) {
				season = "����";
		} else {
				season = "�ش��ϴ� ������ �����ϴ�.";
		}
		*/
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 ������ ���� �Է� : ");
		int num = sc.nextInt();
	
		switch(num)	{
		case 1: case 2: case 12: 
			System.out.print(num + "���� �ܿ��Դϴ�."); break;
		case 3: case 4: case 5: 
			System.out.print(num + "���� ���Դϴ�."); break;
		case 6: case 7: case 8: 
			System.out.print(num + "���� �����Դϴ�."); break;
		case 9: case 10: case 11: 
			System.out.print(num + "���� �����Դϴ�."); break;
		default : 
			System.out.print(num + "���� �߸� �Էµ� ���Դϴ�.");
		}
	}
	
	//�ǽ����� 5
	
	/*���̵�, ��й�ȣ�� ���صΰ� �α��� ����� �ۼ��ϼ���.
	�α��� ���� �� ���α��� ������,
	���̵� Ʋ���� �� �����̵� Ʋ�Ƚ��ϴ�.��,
	��й�ȣ�� Ʋ���� �� ����й�ȣ�� Ʋ�Ƚ��ϴ�.���� ����ϼ���.*/
		
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̵� : ");
		String id = sc.next();
		System.out.print("��й�ȣ : ");
		String pw = sc.next();
		
		String ID = "myId";
		String PW = "myPassword12";

//������ ����
//if(name.equals("�ڽſ�"))	
//!str.equals("exit")

		if(id.equals(ID) && pw.equals(PW)){
			System.out.println("�α��� ����");
		}else if(!id.equals(ID)) {
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		}else if(!pw.equals(PW)) {
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		}
	}
// ������ ������ ����ϴ� ��� : �������� ����Ű�� �־ �ǰ�.
//		if(id.equals("myId") && pw.equals("myPassword12")) {
//			System.out.println("�α��� ����");
//		} 	
//		if(!id.equals("myId")){
//			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
//		} else if(!pw.equals("myPassword12")) {
//			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
//		}				
//	}
	
	//�ǽ����� 6
	/*����ڿ��� ������, ȸ��, ��ȸ�� �� �ϳ��� �Է� �޾� �� ����� ���� �� �ִ� ������ ����ϼ���.
	��, �����ڴ� ȸ������, �Խñ� ����, �Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ��� �����ϰ�
	ȸ���� �Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ��� �����ϰ�
	��ȸ���� �Խñ� ��ȸ�� �����մϴ�.
	ex.
	������ Ȯ���ϰ��� �ϴ� ȸ�� ��� : ������
	ȸ������, �Խñ� ���� �Խñ� �ۼ�, ��� �ۼ� �Խñ� ��ȸ*/
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ Ȯ���ϰ��� �ϴ� ȸ�� ��� : ");
		String str =sc.next();
		
//		String str1 = "ȸ������";
//		String str2 = "�Խñ� ����";
//		String str3 = "�Խñ� �ۼ�";
//		String str4 = "�Խñ� ��ȸ";
//		String str5 = "��� �ۼ�";
				
		switch(str) {
		case "������" :
			System.out.print("ȸ������, �Խñ� ����, �Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ�");
//			System.out.print(str1 + ", " + str2 + ", " + str3 + ", " + str4 + ", " + str5);
			break;
		case "ȸ��" :
			System.out.print("�Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ�");
//			System.out.print(str3 + ", " + str4 + ", " + str5);
			break;
		case "��ȸ��" :
			System.out.print("�Խñ� ��ȸ");
//			System.out.print(str4);
			break;
		default:
		}
	}
	//�ǽ�����7
	/*Ű, �����Ը� double�� �Է� �ް� BMI������ ����Ͽ� ��� ����� ����
	��ü��/����ü��/��ü��/���� ����ϼ���.
	BMI = ������ / (Ű(m) * Ű(m))
	BMI�� 18.5�̸��� ��� ��ü�� / 18.5�̻� 23�̸��� ��� ����ü��
	BMI�� 23�̻� 25�̸��� ��� ��ü�� / 25�̻� 30�̸��� ��� ��
	BMI�� 30�̻��� ��� �� ��
	ex.
	Ű(m)�� �Է��� �ּ��� : 1.65
	������(kg)�� �Է��� �ּ��� : 58.4
	BMI ���� : 21.45087235996327
	����ü��*/
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ű(m)�� �Է��� �ּ��� : ");
		double dnum = sc.nextDouble();
		System.out.print("������(kg)�� �Է��� �ּ��� : ");
		double dnum2 =sc.nextDouble();
		
		double bmi = dnum2 / (dnum * dnum);
		System.out.println("BMI ���� : "+ bmi);
		
		if(bmi < 18.5) {
			System.out.println("��ü��");
		}else if(bmi <= 18.5 || bmi < 23) {
			System.out.println("����ü��");
		}else if(bmi <= 23 || bmi < 25) {
			System.out.println("��ü��");
		}else if(bmi <= 25 || bmi < 30) {
			System.out.print("��");
		}else if(bmi <= 30){
			System.out.println("����");
		}
	}
	//�ǽ����� 8  **����Ǯ��
	
	/*Ű����� �� ���� ������ ���� ��ȣ�� �Է� �޾� ���� ��ȣ�� ���� ���� ����� ����ϼ���.
	(��, �� ���� ���� ��� ����� ���� �۵��ϸ� ���� ���� ��ȣ�� �Է� ���� ��
	���߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.�� ���)
	ex.
	�ǿ�����1 �Է� : 15
	�ǿ�����2 �Է� : 4
	�����ڸ� �Է�(+,-,*,/,%) : /
	15 / 4 = 3.750000*/
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ǿ�����1 �Է� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�ǿ�����2 �Է� : ");
		int num2 = sc.nextInt();
		
		System.out.print("�����ڸ� �Է�(+,-,*,/,%) : ");
		char num3 = sc.next().charAt(0);
		
				
		double result = 0;
	
		if(num1> 0 && num2 > 0) { //**���� ������ �κ�
		
		switch(num3) {
		case '+':
//			System.out.println(num1 " + " num2 " = " (num1+num2)); break;
			result = num1 + num2; break;
		case '-':
			result = num1 - num2; break;	
		case '*':
			result = num1 * num2; break;
		case '/':
			result = (double)num1 / num2; break; // **����� ������
			
			//���� (double)(num1/num2) �� �ϰ� �Ǹ�  ��Ʈ/��Ʈ �� �����ϰ��� ������ �ϱ� ������
			// ������� �ٸ��� �ִ�. 3.00000�� ������ ����.
		case '%':
			result = num1 % num2;break;
		default : System.out.println("�����ڸ� �߸� �Է��߽��ϴ�. ���α׷��� �����մϴ�.");
		}	
		
		if(num3 == '/') {
			System.out.printf("%d %c %d = %f", num1, num3, num2, result);
		} else if(num3 == '+' || num3 == '-' || num3 == '*' || num3 == '%') {
			System.out.printf("%d %c %d = %f", num1, num3, num2, (int)result);
//			System.out.printf(num1 + " " + num3 + " " + num2 + " = " + result);
// �̰ɷε� �������� ������ �� �� ������, �Ҽ��� 3.75 ���ϱ��� ������ �ʾƼ� ���� ���� ����������?
		}
	}else {
		System.out.println("������� �Է����ּ���. ���α׷��� �����մϴ�.");
		//�̰� �ɼ�
	}
		//15, 4, / �Է��ϸ� ������� �Ҽ����� �����ϴ� ������ �𸣰ڴ�. 15 / 4 = 3.0???
	}
	//�ǽ����� 9
	/*�߰����, �⸻���, ��������, �⼮ȸ���� �Է��ϰ� Pass �Ǵ� Fail�� ����ϼ���.
	�� ������ �߰���� 20%, �⸻��� 30%, ���� 30%, �⼮ 20%�� �̷���� �ְ�
	�� ��, �⼮ ������ �⼮ ȸ���� �� ���� ȸ�� 20ȸ �߿��� �⼮�� ���� ���� ������ ����ϼ���.
	70�� �̻��� ��� Pass, 70�� �̸��̰ų� ��ü ���ǿ� 30% �̻� �Ἦ �� Fail�� ����ϼ���.
	[��� ���ô� ���� 3�� ����]
	ex 1.
	�߰� ��� ���� : 80
	�⸻ ��� ���� : 30
	���� ���� : 60
	�⼮ ȸ�� : 18
	================= ��� =================
	�߰� ��� ����(20) : 16.0
	�⸻ ��� ����(30) : 9.0
	���� ���� (30) : 18.0
	�⼮ ���� (20) : 18.0
	���� : 61.0
	Fail [���� �̴�]
	
	ex 2.
	�߰� ��� ���� : 80
	�⸻ ��� ���� : 90
	���� ���� : 50
	�⼮ ȸ�� : 15
	================= ��� =================
	�߰� ��� ����(20) : 16.0
	�⸻ ��� ����(30) : 27.0
	���� ���� (30) : 15.0
	�⼮ ���� (20) : 15.0
	���� : 73.0
	PASS
	
	ex 3.
	�߰� ��� ���� : 100
	�⸻ ��� ���� : 80
	���� ���� : 40
	�⼮ ȸ�� : 10
	================= ��� =================
	Fail [�⼮ ȸ�� ���� (10/20)]
	*/
	
	public void practice9() { //**����Ǯ��
		//70�� �̻��� ��� pass, 70�� �̸��̰ų� ��ü ���ǿ� 30%�̻� �Ἦ �� fail�� ���
		//1. ���� �Ÿ��� : 70�� �̻��� ��� + �⼮�� 30 %�̻��̾�� ��.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�߰� ��� ���� : ");
		int mid = sc.nextInt();
		System.out.print("�⸻ ��� ���� : ");
		int fin =sc.nextInt();
		System.out.print("���� ���� : ");
		int hw = sc.nextInt();
		System.out.print("�⼮ ȸ�� : ");
		int come = sc.nextInt();
		System.out.println("============= "+"���"+" =============");
		
		if(!(come < 20*0.7)) { // �⼮ ������ 20�� ������ 70�ۼ�Ʈ �̸��� �ƴϸ�!
			System.out.println("�߰� ��� ����(20) : " + mid * 0.2);
			System.out.println("�⸻ ��� ����(30) : " + fin * 0.3);
			System.out.println("���� ����(30) : " + hw * 0.3);
			System.out.println("�⼮ ����(20) : " + (come /20.0 * 100 * 0.2));
			
			double sum = mid * 0.2 + fin * 0.3 + hw * 0.3 + (come /20.0 * 100 * 0.2);
			
			System.out.println("���� : " + sum);
			if(sum >= 70) {
				System.out.println("PASS");
			} else {
				System.out.println("Fail[���� �̴�]");
			}
			
		} else {
			System.out.println("Fail [�⼮ ȸ�� ����] (" + come + "/20)");
		} 
		
	}	
	//������ �⼮ ������ ���� Ȯ���ؾ��ϴ°� ����.
//		double dnum1 = mid * 20 / 100;
//		double dnum2 = fin * 30 / 100;
//		double dnum3 = hw * 30 / 100;
//		double dnum4 = come * 20 / 20;
//		double sum = dnum1 + dnum2 + dnum3 + dnum4;
				
//		System.out.println("�߰� ��� ����(20) : " + dnum1);
//		System.out.println("�⸻ ��� ����(30) : " + dnum2);
//		System.out.println("���� ����(30) : " + dnum3);
//		System.out.println("�⼮ ����(20) : " + dnum4);
//		System.out.println("���� : " + sum);
		
//		if(sum >= 70.0) {
//			System.out.println("PASS");
//		}
//		if(sum < 70.0 || dnum4 == (come * 30 / 20)) {
//			System.out.println("Fail[���� �̴�]");
//		}	
//		else { 
//			System.out.println("Fail [�⼮ ȸ�� ����] (" + come + "/20)");
//		}

//		if(dnum4 == (come * 30 / 20)) {
//			System.out.println("Fail [�⼮ ȸ�� ����] (" + come + "/20)");
//		} //����������~~~������ �̰ſ���~~~~
	
	//�ǽ����� 10
	/*�տ� ������ �ǽ������� �����Ͽ� ������ �� �ִ� �޴�ȭ���� �����ϼ���.
	ex.
	������ ����� �����ϼ���.
	1. �޴� ���
	2. ¦��/Ȧ��
	3. �հ�/���հ�
	4. ����
	5. �α���
	6. ���� Ȯ��
	7. BMI
	8. ����
	9. P/F
	���� : 4 (�ǽ�����4 ����)*/
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ����� �����ϼ���.");
		System.out.println("1. �޴� ���");
		System.out.println("2. ¦��/Ȧ��");
		System.out.println("3. �հ�/���հ�");
		System.out.println("4. ����");
		System.out.println("5. �α���");
		System.out.println("6. ���� Ȯ��");
		System.out.println("7. BMI");
		System.out.println("8. ����");
		System.out.println("9. P/F");
		System.out.print("���� : ");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1: practice1();{
			
		}	
			break;
		case 2: practice2();{
			
		}
			break;
		case 3: practice3();{
			
		}
			break;
		case 4: practice4();{
			
		}
			break;
		case 5: practice5();{
			
		}
			break;
		case 6: practice6();{
			
		}
			break;
		case 7: practice7();{
			
		}
			break;
		case 8: practice8();{
			
		}
			break;
		case 9: practice9();{
			
		}
			break;
		default:
		}
			
	}
}

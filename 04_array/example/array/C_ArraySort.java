package com.kr.example.array;

import java.util.Arrays;

public class C_ArraySort {
	public void method1() {
		//������ �� �� �����ϱ�
		int num1 = 10;
		int num2 = 20;
		
		System.out.println("num1 : "+ num1);
		System.out.println("num2 : "+ num2); // num1�� num2 �� ���
		
		/*num1 : 10
		num2 : 20*/
		
//		num1 = num2;
//		num2 = num1;

		System.out.println("num1 : "+ num1);
		System.out.println("num2 : "+ num2); // �ٽ� ����غ��� �̻��ϴ�.
		
		/*num1 : 20
		num2 : 20*/
		
		//�̹� ���� �� �־ ���ϴ� ���� ���� ���� �̷���쿡��
		int temp; // �ӽ÷� ���� ������ ���� ����
		temp = num1; // temp = 10
		num1 = num2; // num1 = 20
		num2 = temp; // num2 = 10
		System.out.println("num1 : "+ num1);
		System.out.println("num2 : "+ num2);
		
		
		int[] arr = {2,1,3};
		int temp2;
		temp2 = arr[0];
		arr[0]=arr[1];
		arr[1]=temp2;
	}
	
		public void method2() { //�迭 ������������ �����
			int[] iArr = {2,5,4,6,1,3};
			
			for(int i=0; i< iArr.length; i++) {
				System.out.print(iArr[i] +" "); //2 5 4 6 1 3 
	
			}
			System.out.println();
			
			Arrays.sort(iArr); //�迭 �������� �޼ҵ�
			
			for(int i=0; i< iArr.length; i++) {
				System.out.print(iArr[i] +" "); //1 2 3 4 5 6 
			}
		}
}	
			/*
			 * 2 5 4 6 1 3  ��
			   1 2 3 4 5 6  ��  */

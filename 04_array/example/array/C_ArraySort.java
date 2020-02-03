package com.kr.example.array;

import java.util.Arrays;

public class C_ArraySort {
	public void method1() {
		//변수의 두 값 변경하기
		int num1 = 10;
		int num2 = 20;
		
		System.out.println("num1 : "+ num1);
		System.out.println("num2 : "+ num2); // num1과 num2 를 출력
		
		/*num1 : 10
		num2 : 20*/
		
//		num1 = num2;
//		num2 = num1;

		System.out.println("num1 : "+ num1);
		System.out.println("num2 : "+ num2); // 다시 출력해보면 이상하다.
		
		/*num1 : 20
		num2 : 20*/
		
		//이미 값이 들어가 있어서 원하는 값이 들어가지 않음 이런경우에는
		int temp; // 임시로 값을 저장할 변수 생성
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
	
		public void method2() { //배열 오름차순으로 만들기
			int[] iArr = {2,5,4,6,1,3};
			
			for(int i=0; i< iArr.length; i++) {
				System.out.print(iArr[i] +" "); //2 5 4 6 1 3 
	
			}
			System.out.println();
			
			Arrays.sort(iArr); //배열 오름차순 메소드
			
			for(int i=0; i< iArr.length; i++) {
				System.out.print(iArr[i] +" "); //1 2 3 4 5 6 
			}
		}
}	
			/*
			 * 2 5 4 6 1 3  전
			   1 2 3 4 5 6  후  */

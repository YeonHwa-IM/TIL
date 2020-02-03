package com.kr.example.array;

import java.util.Scanner;

public class A_Array {
//	//배열: 같은 자료형의 변수를 하나의 묶음으로 다루는 것.
//	//배열 선언:
//	// 자료형 [] 배열명; 첫번째것을 더 많이 사용한다
//	// 자료형      배열명[];
//	//배열할당
//공	// 자료형 []  배열명 = new 자료형[배열크기];
//간	// 자료형 	배열명[] = new 자료형[배열크기];
//생	// new 연산자를 통해 heap 영역에 배열크기만큼 공간 생선
//성	// 공간이 생성되는 순간 그 공간에 대한 주소 값이 생김
//	// 그 주소값은 Stack에 있는 배열명 공간에 대입(참조하고 있음)
//	
//	/////////////////////////////////////
//	
//	// 배열 초기화 : 처음값을 넣어주는것.
//값	//	 1) 인덱스 이용
//	//		배열명[인덱스번호] = 값;
//넣	//	 
//	//	2) for문 이용 : 규칙이 있을 때만 사용가능
//	//		for(int i =0; i<배열명.length; i++){
//기	//		배열명[i] = 값;
//	//		}
//	//	 
//	//	3) 선언과 동시에 초기화
//	//		 자료형[] 배열명 = {값};
//	//	 	자료형[] 배열명 = new 자료형[]{값};
	
	public void method1() {
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		int num5 = 50;
		int num6 = 60;
		int num7 = 70;
		int num8 = 80;
		int num9 = 90;
		
		int sum1 = 0;
		sum1 += num1;
		sum1 += num2;
		sum1 += num3;
		sum1 += num4;
		sum1 += num5;
		sum1 += num6;
		sum1 += num7;
		sum1 += num8;
		sum1 += num9;
		
		//같은 자료형이기때문에 배열로 묶을수있다.
		int[] arr = new int[9];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		arr[5] = 60;
		arr[6] = 70;
		arr[7] = 80;
		arr[8] = 90;
//		arr[9] = 100; //ArrayIndexOutOfBoundsException: 9
		// 원래 있던 길이보다 넘쳤다는 에러. 9번째가.
		// 정한 인덱스 범위를 넘으면 일어나는 에러.  
		/*Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 9
		at com.kr.example.array.A_Array.method1(A_Array.java:61)
		at com.kr.example.run.Run.main(Run.java:8)
		*/
		
		for(int i = 0; i < arr.length; i++) {//범위를 지정하지말고, length를 가져와야함.
			arr[i]= (i + 1) * 10;
		}
		
		int sum2 = 0;
		for(int i = 0; i < arr.length; i++) {
			sum2 += arr[i];
		}
		
		for(int i =0; i < arr.length; i++) {
			System.out.println("arr["+i+"] : "+ arr[i]);
		}
		
		/*arr[0] : 10
		arr[1] : 20
		arr[2] : 30
		arr[3] : 40
		arr[4] : 50
		arr[5] : 60
		arr[6] : 70
		arr[7] : 80
		arr[8] : 90*/
	}
	public void method2() {
		// 배열은 한 번 지정한 배열의 크기를 변경할 수 없음.
		// 배열은 한번 만들면 끝이고, 새로 있는 배열이 바꿔치기 된다.
		// 수정되는 것처럼 보이나, 사실은 신규로 배열이 만들어져서 덮어쓴다?
		
		double[] dArr = new double[10];
		System.out.println("dArr의 주소 : " + dArr);
		//dArr의 주소 : [D@15db9742 가 나오는데, 실제 주소값은 아니고..
		
		Scanner sc = new Scanner(System.in);
		System.out.print("변경할 배열 크기 : ");
		int size = sc.nextInt();
		 
		dArr = new double[size];
		System.out.println("dArr의 주소 : " + dArr);
		/*dArr의 주소 : [D@15db9742
		변경할 배열 크기 : 5
		dArr의 주소 : [D@28d93b30*/
		// 주소가 변경된 것을 보면, 배열 크기가 실제로 늘거나 줄어든게 아닌,
		// 새로운 주소로 바꿔치기 하는 것이다.
		
		// 할당된 배열 지우기
		dArr = null;
	}
	public void method3() {
		// 배열 초기화
		// 1.인덱스 이용해서 초기화
		
		// iArr 이라는 int형 5개짜리 배열 생성
		
		int[] iArr = new int[5];
		
		iArr[0] = 1;
		iArr[1] = 2;
		iArr[2] = 3;
		iArr[3] = 4;
		iArr[4] = 5;
		
		// 2. for문 초기화
		
		for(int i = 0; i < iArr.length; i++) {
			iArr[i] = i + 1;
		}
		
		// 3. 선언과 동시에  초기화
		int[] iArr2 = {1,2,3,4,5};
		int [] iArr3 = new int[] {1,2,3,4,5};
		//꼭 기본 자료형이 아니어도 가능하다.
		
		
		
		
		
	}
	
	
}













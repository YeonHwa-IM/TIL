package com.kh.example.dimension;

public class DimensionalArray {
	public void method1() {
		//2차원 배열의 선언 하기.
		//1.  자료형[][]	배열명;
		//2.	자료형 배열명[][];
		//3. 자료형 [] 배열명[];
		
		int[][] iArr1;
		int iArr2[][];
		int[]iArr3[]; //선언하여 stack 영역에 공간을 만들어 줌.
		
		// 2차원 배열 할당하기
		//1. 자료형[][] 배열명 = new 자료형[행크기][열크기];
		//2. 자료형  	배열명[][] = new 자료형[행크기][열크기];
		//3. 자료형[] 배열명[]= new 자료형[행크기][열크기];
		
		iArr1 = new int[3][5]; // 정변 배열 : 행과 열의 크기가  고정적인 배열(정해져있는 배열)
		// (가변배열도 배워보겠다. 행은 정해져있지만 열의 크기가 정해져있지 않은 배열.)

	}
	public void method2() {
		//int형의 iArr이라는 이름의 3행 5열짜리 배열 생성
		
		int[][] iArr = new int[3][5];
		
		// 값을 기록해봐라
		
		//1. 배열 인덱스에 접근하여 값 기록
		
		iArr[0][0] = 1;
		iArr[0][1] = 2;
		iArr[0][2] = 3;
		iArr[0][3] = 4;
		iArr[0][4] = 5;
		
		iArr[1][0] = 6;
		iArr[1][1] = 7;
		iArr[1][2] = 8;
		iArr[1][3] = 9;
		iArr[1][4] = 10;
		
		iArr[2][0] = 11;
		iArr[2][1] = 12;
		iArr[2][2] = 13;
		iArr[2][3] = 14;
		iArr[2][4] = 15;		
		
		//2. 2중 for문을 이용하여 값 기록
		
		System.out.println("iArr.length : " + iArr.length);//iArr의 길이를 뽑아보기
		//결과 값  : iArr.length : 3
		//iArr.length의 길이는 행의 길이가 나온다.
		
		System.out.println("iArr.length : " + iArr[0].length);
		//iArr.length : 3 		iArr.length : 5
		
		int value =1;
		for(int i = 0; i < iArr.length; i++) {
			for(int j = 0; j < iArr[i].length; j++) {
				iArr[i]	[j] = value; //value부터 이해 못함
				value++; //value 증가값 으로 처음으로 올라가기...? 
			}
			//2중 포문할때 행이 0~2로 크게 한번씩 돌고, 열이 1~4까지 더 많이 돌고 있다.
			// 많이 도는 게 안으로, 크게 도는게 밖으로 놓는다.
		}
		
		// 값을 출력해봐라
		for(int i=0; i < iArr.length; i++) {
			for(int j = 0; j < iArr[i].length; j++) {
				System.out.printf("%-2d ", iArr[i][j]);
			}
			System.out.println();
		}
	}
	public void method3() {
		//가변배열 
		//		행 크기는 정해져 있으나 각 행에 대한 열 크기가 정해져 있지 않은 상태
		//		꼭 열의 크기가 같아야하는건 아니다. 
		//		자료형이 같은 1차원 배열 여러개를 하나로 씬 것이 2차원 배열이기 때문에
		//		묶여있는 2차원 배열의 길이가 꼭 같을 필요는 없음
		int[][] iArr = new int[3][];// 가변배열 할당 = 행의 크기만 3으로 정해져있음.
		iArr[0] = new int[2];  // 행만 정해져 있기 때문에 열에 대한 값을 따로따로 정해줘야함.
		iArr[1] = new int[1];
		iArr[2] = new int[3]; 
		
		for(int i=0; i < iArr.length; i++) {
			for(int j = 0; j < iArr[i].length; j++) {
				System.out.printf("%2d ", iArr[i][j]);
			}
			System.out.println();
		}
		
	// 값기록
	// 1. 인덱스 이용
	
	iArr[0][0] = 1;
	iArr[0][1] = 2;
	
	iArr[1][0] = 3;
	
	iArr[2][0] = 4;
	iArr[2][1] = 5;
	iArr[2][2] = 6;
	
	//2. 이중for문 이용  //랭스를 사용할수있기ㅣ때문에 이중포문이 가능..
	
	int value = 1;
	for(int i =0; i < iArr.length; i++) {
		for(int j = 0; j < iArr[i].length; j++) {
			iArr[i][j] = value++;
		}
	}
	for(int i =0; i < iArr.length; i++) {
		for(int j = 0; j < iArr[i].length; j++) {
			System.out.printf("%2d ", iArr[i][j]);
		}	
		System.out.println();
	}
	
	}
	public void method4() {
		//다차원 배열의 할당과 초기화 동시에 가능
		int[][] iArr1 = {{1,2,3,4,5},
						{6,7,8,9,10},
						{11,12,13,14,15}};
		
		for(int i =0; i < iArr1.length; i++) {
			for(int j = 0; j < iArr1[i].length; j++) {
				System.out.printf("%2d ", iArr1[i][j]);
			}
			System.out.println();
		}
		/*
			1  2  3  4  5 
			6  7  8  9 10 
			11 12 13 14 15 		*/
		
		int[][] iArr2 = {{1,2,3},
						{4,5,6,7,8,9},
						{10,11,12,13}};
		
		for(int i =0; i < iArr2.length; i++) {
			for(int j = 0; j < iArr2[i].length; j++) {
				System.out.printf("%2d ", iArr2[i][j]);
			}
			System.out.println();
		}
	}
}

		/*
		 1  2  3 
		 4  5  6  7  8  9 
		10 11 12 13 */

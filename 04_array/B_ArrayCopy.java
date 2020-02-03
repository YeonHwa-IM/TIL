package com.kr.example.array;

import java.util.Arrays;

public class B_ArrayCopy {
	//얕은 복사 : 배열의 주소만 복사
	
	//깊은 복사 : 동일한 새로운 배열을 생성하여 실제 내부 값 복사
	
	// 깊은 복사를 하는 4가지 방법
	//1. for문을 이용한 1:1 복사
	//2. System.arraycopy()이용한 복사
	//3. Arrays.copyOF()이용한 복사
	//4. clone() 이용한 복사 // 자바팀에서 사용하지 말라함
	
	public void method1() {
		int[] originArr ={1,2,3,4,5};
		int[] copyArr = originArr; //얕은 복사  : 얕은 복사의 경우 주소값이 같다. 수정값도 같이 바뀐다.
		
		for(int i =0; i < originArr.length; i++) {
			System.out.print(originArr[i]+ " ");   // 결과 1 2 3 4 5 
		} 
		System.out.println(); // 오리지날 출력
		
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i]+ " ");   //결과 1 2 3 4 5 
		}
		System.out.println(); //카피 출력
	
		
		//원본 배열의 0번째 인덱스를 99로 변경
		originArr[0] = 99;
		
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");    //결과 99 2 3 4 5
		}
		System.out.println(); // 오리지날 출력
		
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");   //결과 99 2 3 4 5
		}
		System.out.println(); // 카피출력
		
		System.out.println("originArr의 주소 값 : " + originArr); // 결과 originArr의 주소 값 : [I@15db9742
		System.out.println("copyArr의 주소 값 : "+ copyArr);  // 결과 copyArr의 주소 값 : [I@15db9742
	}	
	
	public void method2() {  //깊은 복사 : 주소값이 다르다, 수정해도 카피본은 바뀌지 않는다.
		//깊은 복사 1. for문 이용
		
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = new int[5]; //공간을 따로따로 만들어줌
		
		System.out.println("======처음 arr의 값 ======");
		
		for(int i = 0; i<originArr.length; i++) {
			copyArr[i] = originArr[i]; // 카피 i(배열의크기)에 오리진 i(배열의 크기)를 집어넣겠다.	
		}
		
		for(int i = 0; i<originArr.length; i++) {
			System.out.print(originArr[i]+" ");
		}
		System.out.println(); // 오리지날 출력 
		
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i]+" ");
		}
		System.out.println(); // 카피 출력
		
		/*======처음 arr의 값 ======
			1 2 3 4 5 
			1 2 3 4 5 */
				
		System.out.println("======originArr의 0번째 인덱스를 99로 변경 ======");
		originArr[0]=99; //오리진의 0번째 인덱스 배열 값변경
		
		for(int i =0; i < originArr.length; i++) {
			System.out.print(originArr[i]+" ");
		}
		System.out.println(); // 오리지날 출력 
		
		for(int i =0; i < copyArr.length; i++) {
			System.out.print(copyArr[i]+" ");
		}
		System.out.println(); // 카피출력
	}
	
		/*======originArr의 0번째 인덱스를 99로 변경 ======
			99 2 3 4 5 
			1 2 3 4 5 */
		
	public void method3() {
		//깊은 복사를 하는 4가지 방법 중 
		
		//깊은 복사 2. System.arraycopy()이용한 복사
		
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = new int[10];
		
		
		//System.arraycopy(src,   	srcPos,       dest,    	destPos,    	legnth);
		//			             원본배열      원본배열시작위치     복사배열   	 복사배열 시작위치   	복사길이
		
		//originArr배열의 모든 데이터를 copyArr배열에 복사를 하는데 
		//copyArr의 3번째에서부터 붙여넣고 싶음
		System.arraycopy(originArr, 0, copyArr, 3, originArr.length);
						//원본배열    , 원본배열 시작위치, 복사배열, 복사배열 시작위치, 복사길이.
						//오리진배열의 0번째부터 전체 크기를, 카피배열의 3번째부터 복사 붙여 넣겠다.
		for(int i = 0; i< originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}	
		System.out.println(); // 오리지날 출력
		
		for(int i=0; i<copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println(); // 카피출력
		
		/*1 2 3 4 5 
		  0 0 0 1 2 3 4 5 0 0 // 카피배열의 3번째부터 붙여넣기 했기 때문에 0~3까지는 0이다.
		 */ 				  //0인 이유는 인트의 기본값이 0이라서 이다. 0으로 초기화 되어 있기 때문이다.
		//자바에서 클래스가 세미코론으로 끝나있고, 네이티브 코드로 되어 있으면 열어볼수 없다.
		//시스템 클래스 소스 가져오는것 캡쳐해뒀음.
		
		originArr[0] = 99;  // 오리진을 99로 바꿔보면, 오리진은 바뀌고, 카피는 바뀌지 않은 것을 확인할수있다.
		
		for(int i = 0; i< originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}System.out.println(); //오리지날 출력
		
		for(int i=0; i<copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println(); //카피출력
		/*
		 99 2 3 4 5 
		 0 0 0 1 2 3 4 5 0 0 */
	}
	public void method4() {
		//깊은 복사 3: Arrays.copyOF()이용
		
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = new int[10];
		
		System.out.println("======처음 arr의 값 ======");
		
		for(int i =0; i < originArr.length; i++) {
			System.out.print(originArr[i]+" ");
		}
		System.out.println();  //오리지날 출력
		
		for(int i=0; i < copyArr.length; i++) {
			System.out.print(copyArr[i]+" ");
		}
		System.out.println(); // 카피 출력
		
		/*======처음 arr의 값 ======
		 1 2 3 4 5 
		 0 0 0 0 0 0 0 0 0 0 */
		//0인 이유는 인트의 기본값이 0이라서 이다. 0으로 초기화 되어 있기 때문이다.
		
		System.out.println("======copyOF()로 복사 후 ======");
		
		//Arrays.copyOf(original,   newLength)
		// 				원본 배열,		복사할 길이
		
		Arrays.copyOf(originArr, originArr.length);
		//어레이지 라는 클래스는 배열을 사용할 때 편리하겠다 하는 메소드들을 모아놓은 클래스이다.
		//(컬랙션즈라는 비슷한 클래스가 있음. 컬랙션즈는  컬랙션을 사용할때 편한것들을 모아놓은 클래스)
		
		copyArr = Arrays.copyOf(originArr, originArr.length); // 복사
		
		for(int i =0; i < originArr.length; i++) {
			System.out.print(originArr[i]+" ");
		}
		System.out.println();  //오리지날 출력
		
		for(int i=0; i < copyArr.length; i++) {
			System.out.print(copyArr[i]+" ");
		}
		System.out.println(); //카피 출력
		
		/*
		
		======copyOF()로 복사 후 ======
		1 2 3 4 5 
		1 2 3 4 5 
		 
		 */
	}

}

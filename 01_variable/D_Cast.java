package com.kh.variable;

public class D_Cast {
	public void rule1() {
		boolean flag = true;
//		boolean flag2 = 100;
		// boolean 자료형은 무조건 true, false만 들어갈 수 있음(형변환 예외)
	
		int num = 'A';//문자는 사실 숫자로 호환이 되기 때문에 숫자 안에 문자가 들어갈수있다.
		System.out.println("num : " + num);
		
		char ch = 97;//리터럴을 넣고 있는것.
		System.out.println("ch : " + ch);
		
		char ch2 = (char)num; //변수를 넣고 있는것. int를 char로 넣는것
		//Type mismatch: cannot convert from int to char
		//:인투에서 차로 변환할수없어.
		//97은 리터럴이지만, num은 변수다. num의 크기만 볼수있다.(4바이트)
		//예쁘게 만들고 싶으면 강제 형변환을 하자.(char)를 num앞에 붙이기.
		System.out.println("ch2 : " + ch2);
		
		int num2 = -97;
		char ch3 = (char)num2;
		System.out.println("ch3 : " + ch3); 
		// 차는 양수만 입력이 가능 음수가 들어가있기때문에 ?가 뜸. 물음표라는 값이 뜨는게 아니다.
}
	public void rule2() {	
		int iNum = 10;
		long lNum = 100;
		
//		int result = iNum + lNum;
		//Type mismatch: cannot convert from long to int
		// 연산을 큰 자료형으로 자동 형변황이 된 후 연산처리가 되기 때문에 
		//iNum +lNum 의 결과는 long형이 된 상태
		
		// iNum + lNum을 int result 에 저장할수있는방법
		//방법1.수행결과를 int로 강제 형변환하는 방법
		int result = (int)(iNum + lNum); 
		
		//방법2. long형을 int로 강제형변환시키는 방법
		int result2 = iNum + (int)lNum;
		
		//번외. 결과값을 저장하는 result를 long형으로 받는 방법
		long result3 = iNum + lNum;
		
		
	}
	
	
	public void rule3() {
		int iNum = 290;
		
//		byte bNum = iNum;
		//Type mismatch: cannot convert from int to byte
		//인트라는 큰 자료형이 바이르로 들어가기 때문에 에러가 뜸
		byte bNum = (byte)iNum;
		
		System.out.println("bNum : " + bNum);
		//결과값으로 34가 나오고 데이터 손실이 일어난다. 잘려진 부분에 데이터가 있었기 때문에 값이 290에서 34로 나타남.
		
		// 다시, int는 4바이트, 이걸 byte 1바이트 자료형에 넣으려고 하니, 구겨넣다보니 데이터 손실이 발행한다.
		//때문에 오버플로우가 아닌 데이터 손실이되었다.
		
		
	
		
		
		
		
	}

}

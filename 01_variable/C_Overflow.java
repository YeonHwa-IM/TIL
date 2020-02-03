package com.kh.variable;

public class C_Overflow {
	public void overflow() {
		byte bNum = 127;
		bNum = (byte)(bNum + 1);
		//Type mismatch: cannot convert from int to byte
		//숫자는 인트형이라서 에러가 발생
		System.out.println("bNum : " + bNum);//run으로 가서 실행
	}
	
	public void calc() {
		int num1 = 1000000;
		int num2 = 700000;
		
//		int result = num1 * num2;		
		long result = (long)num1 * num2; //num1을 롱으로 만들어줬기 때문에 num2도 롱으로 자동변환됨.
		System.out.println("계산결과 : " + result);
		//오버플로우 되기 때문에 롱으로 자료형을 바꾸어 사용하면 된다.
		
	}
	
	
	
	
	
	
	
}

package com.kh.practice.numRange.controller;

import com.kh.practice.numRange.exception.NumRangeException;

public class NumberController {
	public NumberController() {}
	public boolean checkCouble(int num1, int num2) throws NumRangeException {
		
//		매개변수로 들어온 값들이 배수인지 boolean 값 반환
		// 매개변수로 들어온 두 값이 1~100 사이 일 때 num1이 num2의 배수면 true,
		// 배수가 아니라면 false 반환
		// 1~100사이가 아니라면 NumRangeException발생, 에러 메시지는 출력 값 참고
		
		boolean b = true;
		if(num1 >= 1 && num1 <= 100 && num2 >= 1 && num2 <= 100) {
			if(num1 % num2 == 0) {
				b=true;
			}else {
				b=false;
			}
		}else {
			throw new NumRangeException("1부터 100 사이의 값이 아닙니다.");
		}
		
		return b;
	}
}

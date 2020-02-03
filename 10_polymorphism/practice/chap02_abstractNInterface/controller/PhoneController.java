package com.kh.practice.chap02_abstractNInterface.controller;

import com.kh.practice.chap02_abstractNInterface.model.vo.GalaxyNote9;
import com.kh.practice.chap02_abstractNInterface.model.vo.Phone;
import com.kh.practice.chap02_abstractNInterface.model.vo.V40;

public class PhoneController {
	
	private String[] result = new String[2];
	
	public String[] method() {
		
		Phone[] p = new Phone[2];
		
		p[0] = new GalaxyNote9();
		p[1] = new V40();
		
		// for문을 이용하여 Phone 객체배열에 각 인덱스의 printInformation()의
		// 반환 값을 String배열에 담아 반환
		// 세상에....이게 한국어라니....
		
		for(int i=0; i < p.length; i++) {
			if(p[i] instanceof GalaxyNote9) {
				 result[i] = ((GalaxyNote9)p[i]).printlnformation();
			}else if(p[i] instanceof V40) {
				result[i] = ((V40)p.clone()[i]).printlnformation();
			}
		}
		return result;
	}
}

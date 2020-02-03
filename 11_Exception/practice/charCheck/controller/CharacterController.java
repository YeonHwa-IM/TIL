package com.kh.practice.charCheck.controller;

import com.kh.example.chap03_user.model.exception.MyException;
import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterController {
	public CharacterController() {}
	public int countAlpha(String s) throws CharCheckException {
		int count = 0;
		//매개변수로 들어온 값에 있는 영문자를 세어 반환.
		for(int i=0; i < s.length(); i++) {
			if(s.charAt(i) >= 'a'&& s.charAt(i) <= 'z') { //알바벳 소문자 비교
				count++;
			}else if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') { //알바벳 대문자 비교
				count++;
			}else if(s.charAt(i) == ' ') {
				throw new CharCheckException("체크할 문자열 안에 공백이 포함되어 있습니다.");
		
			
			}
		}
		return  count;
	}
	
}

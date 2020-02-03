package com.kh.example.chap03_user.run;

import com.kh.example.chap03_user.controller.UserExceptionController;

public class Run {
	public static void main(String[] args) {
		new UserExceptionController().inputAge();//따로 변수 지정할 필요

// 가져올 메소드가 하나뿐이었기때문에, 따로 변수 지정할 필요없이 위는 아래와 동일하게 적을 수있다.		
//		UserExceptionController uc = new UserExceptionController();
//		uc.inputAge();
		
	}

}

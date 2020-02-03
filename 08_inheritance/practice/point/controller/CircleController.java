package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {
	Circle c = new Circle();
	
//	double Pi = 3.14;
	
	//받은 매개변수를 이용하여 필드들을 초기화하고 초기화한 정보와 면적 반환
	// 면적 : PI * 반지름 * 반지름

	public String calcArea(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
//		Math.PI
		double result = 0;
		result = Math.PI * radius * radius;
		
		return "둘레  : " + c.toString() + " / " + result;   
	}

	public String calcCircum(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		double result = 0;
		result = Math.PI * radius * 2;
		
		return "면적 : " + c.toString() + " / " + result;
	}


}

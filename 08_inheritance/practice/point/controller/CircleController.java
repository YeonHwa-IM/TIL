package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {
	Circle c = new Circle();
	
//	double Pi = 3.14;
	
	//���� �Ű������� �̿��Ͽ� �ʵ���� �ʱ�ȭ�ϰ� �ʱ�ȭ�� ������ ���� ��ȯ
	// ���� : PI * ������ * ������

	public String calcArea(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
//		Math.PI
		double result = 0;
		result = Math.PI * radius * radius;
		
		return "�ѷ�  : " + c.toString() + " / " + result;   
	}

	public String calcCircum(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		double result = 0;
		result = Math.PI * radius * 2;
		
		return "���� : " + c.toString() + " / " + result;
	}


}

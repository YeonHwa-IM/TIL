package com.kh.practice.snack.conrtoller;

import com.kh.practice.snack.model.vo.Snack;

public class SnackController {
	private Snack s = new Snack();
	
	public SnackController(){}
	
	public String saveData(String kind, String name, String flavor, int numOf, int price) {
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);
		return "���� �Ϸ�Ǿ����ϴ�.";
	} 
	public String confirmData() { //void�� ������ �� ������ ����Ѵ�.
		return s.information();
		}
		

}

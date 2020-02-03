package com.kh.practice.numRange.controller;

import com.kh.practice.numRange.exception.NumRangeException;

public class NumberController {
	public NumberController() {}
	public boolean checkCouble(int num1, int num2) throws NumRangeException {
		
//		�Ű������� ���� ������ ������� boolean �� ��ȯ
		// �Ű������� ���� �� ���� 1~100 ���� �� �� num1�� num2�� ����� true,
		// ����� �ƴ϶�� false ��ȯ
		// 1~100���̰� �ƴ϶�� NumRangeException�߻�, ���� �޽����� ��� �� ����
		
		boolean b = true;
		if(num1 >= 1 && num1 <= 100 && num2 >= 1 && num2 <= 100) {
			if(num1 % num2 == 0) {
				b=true;
			}else {
				b=false;
			}
		}else {
			throw new NumRangeException("1���� 100 ������ ���� �ƴմϴ�.");
		}
		
		return b;
	}
}

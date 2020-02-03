package com.kh.practice.charCheck.view;

import java.util.Scanner;

import com.kh.practice.charCheck.controller.CharacterController;
import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterMenu {
	public void menu() {  //����ڿ��� ���� ���� �ִ� ������ ���� ���
		Scanner sc = new Scanner(System.in);
		CharacterController cc = new CharacterController();

		while(true) {
			System.out.println("���ڿ� : ");
			String str = sc.nextLine();

			try {

				System.out.println(str+"�� ���Ե� ������ ���� : "+cc.countAlpha(str));

			}catch(CharCheckException cce) {
				cce.printStackTrace();
				break;
			}
		}System.out.println("\n�Ǵ�\n");
	}

}

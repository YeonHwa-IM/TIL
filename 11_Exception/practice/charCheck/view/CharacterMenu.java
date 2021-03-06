package com.kh.practice.charCheck.view;

import java.util.Scanner;

import com.kh.practice.charCheck.controller.CharacterController;
import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterMenu {
	public void menu() {  //사용자에게 받은 값에 있는 영문자 개수 출력
		Scanner sc = new Scanner(System.in);
		CharacterController cc = new CharacterController();

		while(true) {
			System.out.println("문자열 : ");
			String str = sc.nextLine();

			try {

				System.out.println(str+"에 포함된 영문자 개수 : "+cc.countAlpha(str));

			}catch(CharCheckException cce) {
				cce.printStackTrace();
				break;
			}
		}System.out.println("\n또는\n");
	}

}

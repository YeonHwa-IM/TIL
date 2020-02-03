package com.kh.example.chap05_constructor.run;

import com.kh.example.chap05_constructor.model.vo.User;

public class Run {
	public static void main(String[] args) {
		User u1 = new User(); // �⺻������ �ȸ�������� jvm�� �ڵ����� ������ ��������.
		//5-1
		//�Ű������ִ� �����ڸ� ���� ���¿��� �⺻�����ڸ� ������ �� ���� ����
		//The constructor User() is undefined(���ǵ��� �ʾҴ�)
		
		u1.inform();
		
		//2-1
		//null, null, null, null // �ʱ�ȭ ���� �ʾƼ� �⺻���� ���´�.
		
		User u2 = new User("id�Դϴ�", "pwp�Դϴ�");
		//id�Դϴ�
		//pwp�Դϴ�  //u2.inform();�� �����ʾҴµ��� �Ű������� ���� �޾ƿ��� ������ ���� ǥ�õ�.
		
		u2.inform();
		//null, null, null, null ǥ�õǴ� ����?
		
		User u3 = new User("id�Դϴ�", "pwd�Դϴ�", "�̸��Դϴ�.");
		u3.inform();
		//id�Դϴ�, pwd�Դϴ�, �̸��Դϴ�., null
	}

}

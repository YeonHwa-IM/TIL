package com.kh.example.chap05_constructor.model.vo;

import java.util.Date;

public class User {
	// - userId : String
	// - userPwd : String
	// - userName : String
	// - enrollDate : Date(java.util)
	
	//1
	private String userId; 
	private String userPwd;
	private String userName;
	private Date enrollDate;
	
	//3
	public User() {}// �⺻������ : �Ű������� ���� ������
	//jvm�� �⺻������ ��������
	//�Ű������ִ� �����ڸ� ����� jvm�� �ڵ����� ���������� �ʱ⶧���� �ݵ�� ����ؾ���.
	
	//������ ������ (��ü�� �ϴ���)
	// 1. ��ü���� : ��ü�� �������ֱ� ���� ����
	// 2. �ʵ� �ʱ�ȭ : �Ű�����(�ܺο��� �����ִ� ���� �������� ��)�� �޾ƿ� ���� �ʵ� �ʱ�ȭ
	
	//������ ��� ��Ģ
	// 1. �����ڸ��� Ŭ������� �����ؾ� �Ѵ�.
	// 2. ��ȯ��(������)�� �������� ����. �⺻�����ڿ� �޼ҵ�� �ٸ����� ��ȯ���� ����.!!!
	
	//4
//	public User() {}
	//Duplicate method User() in type User
	//�޼ҵ� ������ �ߺ��Ǿ� �ִ�. ���� : �����ε尡 ������� �ʾұ� ������. 
	//���� �̸��� ������(�޼ҵ�)�� ���� �� �����ε��� ������� ������ ���� �߻� -> �ּ�ó��
	
	//5 �����ε� �غ���   //9 �Ű������� �̸��� ��ü�̸��� �����ϰ� �ϸ� �̸��� ���� �پ���.
					// �Ű������� ���������� �����̴�. 
					//�޼ҵ� ���� �ȿ��� �Ű������� ����ϰ� �ͱ� ������ ��������>�������� �̴�. ���������� �켱����.
					//���������� userId�� �켱�̴�.
	public User(String userId, String userPwd) {
//		System.out.println(id);
//		System.out.println(pwd); ���� ���������� Ȯ���ѰŶ�
		//id�Դϴ� pwp�Դϴ�-->�ּ�ó��
		
		//6
		this.userId = userId; 
			//The assignment to variable userId has no effect
			//���� �Ű������� �Ű��������� �ְ� �ִ� �ͻ��̾ �ƹ�ȿ���� ���ٰ� �ȳ��� ��.
			//�Ű������� �ʵ��� �̸��� ���� ��������.(X) this�� ���.
			//this
		this.userPwd = userPwd; 
		//��� :id�Դϴ�, pwp�Դϴ�, null, null
	}
		//7 //10 this�غ���
			//User u2��� ��ü�� ���鶧, this�� �ּҰ��� ������ ����!!
			//�Ű�������� ��ü���� �����ϰ� �Ϸ��� this�� ����Ѵ�.
	public User(String userId, String userPwd, String userName) {
				//11. �� �����ڷ� 
//		this.userId = userId;
//		this.userPwd = userPwd;
		this(userId, userPwd);
		this.userName = userName;
		//7��� : id�Դϴ�, pwd�Դϴ�, �̸��Դϴ�., null
	}
	
	public User(String userId, String userPwd, String userName, Date enrollDate) {
		//1) this�� �Ἥ �ʱ�ȭ���ִ� ���
//		this.userId = userId;
//		this.userPwd = userPwd;
//		this.userName = userName;
//		this.enrollDate = enrollDate;
		
		//2) this�� �Ἥ ��� �ʱ�ȭ���ִ� ���
		this(userId, userPwd, userName);
		this.enrollDate = enrollDate;
	}
		//8-->�ּ�ó��
//	public User(String id, String name) {
//		//Duplicate method User(String, String) in type User
//		//
//		userId =id;
//		userName = name;
	
	
	public void inform() {
		System.out.println(userId + ", " + userPwd + ", " + userName + ", " + enrollDate);
		//2
		//null, null, null, null // �ʱ�ȭ ���� �ʾƼ� �⺻���� ���´�.
		
	}
}

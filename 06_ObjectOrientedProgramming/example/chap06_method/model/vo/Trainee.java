package com.kh.example.chap06_method.model.vo;

public class Trainee {
	//�ʵ弱��
	private String name;
	private final String ACADEMY = "KH";
	private char classRoom;
	private static double score;
	
	public Trainee() {} //�⺻������
	
	public Trainee(String name){
		this.name = name;
	}
	
	
	//�ʱ�ȭ �����ֱ�
	public Trainee(String name, char classRoom, double score) {
		this.name =name;
		this.classRoom = classRoom;
		Trainee.score = score; //static�̶�...
	//	this.score = score; // ���α׷� ������ �� ��Ÿƽ ������ ���⶧���� Ŭ������.
	}
	//���� �����
	//�ʵ忡 �ִ� name�� �޾ƿ� �Ű������� ���� �ʱ�ȭ ��Ű�� setter
	public void setName(String name) {
		this.name = name;
	}
	//���͸����2
	//�ʵ忡 �ִ� ClassRoom�� �޾ƿ� �Ű������� ���� �ʱ�ȭ ��Ű�� setter
	public void setClassRoom(char classRoom) {
		this.classRoom = classRoom;
	}
	//���͸����3
	//�ʵ忡 �ִ� score�� �޾ƿ� �Ű������� ���� �ʱ�ȭ ��Ű�� setter
	public static void setScore(double score) {
		Trainee.score = score;
	}
	
	//���͸����1
	//�ʵ忡 �ִ�  name��  ��ȯ�ϴ� getter
	public String getName(){//���Ӹ� ��ȯ�ϱ� ������ �Ű����� �ʿ����
		return name;
	}
	//���͸����2
	//�ʵ忡 �ִ�  ACADEMY��  ��ȯ�ϴ� getter
	public String getACADEMY() {
		return ACADEMY;
	}
	
	//���͸����3
	//�ʵ忡 �ִ� classRoom��  ��ȯ�ϴ� getter
	public char getClassRoom() {
		return classRoom;
	}
	
	//���͸����4
	//�ʵ忡 �ִ� score��  ��ȯ�ϴ� getter
	public static double getScore() {
		return score;
	}
	
	//���͸����5
	public String inform() {
		return name + ", " + ACADEMY + ", " + classRoom + ", " + score;
	}
	
}

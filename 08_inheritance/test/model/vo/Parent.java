package com.kh.example.test.model.vo;

public class Parent {
	private int num; //num �ʵ� private�� �����־ �ٸ�Ŭ�������� ������ ���� ����. �ټ����� �����ִ�.
	
	//�����̺��� ���������� Ȯ������. Ȯ�θ� �ҰŶ� �Ʒ� �°��� �н� 
	double dNum;
	protected boolean bool;
	public char ch; 
	
	public void setNum(int num) { //num�� 0�� ���¿��� set���� private�� num�� �޾ƿ�.
		this.num = num;
	}
	
	public int getNum() { //set�� �޾Ƽ� num�� ��û�� ������ ������. ���? ������ �̿��ؼ�. ������ �ڽ��� �θ�
		return num;
	}

}
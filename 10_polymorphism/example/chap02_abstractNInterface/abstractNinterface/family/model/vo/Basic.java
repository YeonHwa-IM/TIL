package com.kh.example.chap02.abstractNinterface.family.model.vo;

import java.io.Serializable;

public interface Basic extends Cloneable, Serializable {
							//----------------------> Marker Interface ��� �θ���.
// ���콺�� Ŭ���ؼ� ������ �ȿ� �ƹ��͵� ���� �̸��� ����� �͵��� ���Ѵ�. 
// ��Ŀ�� ǥ�ö�� ��.  �� �������̽��� ������ Ŭ������ �̷��� Ư���� �ִٰ� Ư���� ��Ÿ���ֱ� ���� ������. 
// ��Ŀ �������̽��� ��Ŀ�������̽��� ������ Ŭ������ �̷��� Ư���� �ֽ��ϴ��ϰ� �˷��ֱ� ���� �������� ���ȴ�.
// ���� Ŭ������ Ư���� ��Ÿ���ֱ� ���ؼ� �����.
	//����� ũ�γʺ��� ������ �����ϴ�, �ø������������ 
	
	/*public abstract*/ void eat(); // �������̽������� ��������
	/*public abstract*/ void sleep();
	//�������̽��� ������ ���̺� ������Ѻ���.
	//������ ���̺� implements Basic�� ���δ�.
	//public class  Mother extends Family implements Basic
}


package com.kh.practice.chap02_abstractNInterface.model.vo;

public class GalaxyNote9 extends SmartPhone implements NotePen{
	
	public GalaxyNote9() {
		super.setMaker("�Ｚ");
	}
	@Override
	public String picture() {
		return "1300�� ��� ī�޶�";
	}
	@Override
	public String charge() {
		return "�������, ��� ���� ����";
	}
	@Override
	public String touch() {
		return "������, ������ ����";
	}
	@Override
	public boolean bluetoothPen() {
		return true;
	}
		
	@Override
	public String makeCall() {
		return "��ȣ�� ������ ��ȭ��ư�� ����";
	}
	@Override
	public String takeCall() {
		return "���� ��ư�� ����";
	}
	@Override
	public String printlnformation() {
		return "�����ó�Ʈ9�� " + getMaker() + "���� ��������� ������ ������ ����.\n" + makeCall() +"\n"+picture()+"\n"+charge()+"\n"+touch()+"\n ������� �� ž�� ���� : "+bluetoothPen();
	}

}

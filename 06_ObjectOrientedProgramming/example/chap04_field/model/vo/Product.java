package com.kh.example.chap04_field.model.vo;

public class Product {
	private String name = "��������"; //����� �ʱ�ȭ
	private String brand ="������"; 
	private int price=1500;
	private static int num=100;

	{//�ν��Ͻ��� �ʱ�ȭ
		name ="ĭ��";
		price = 1000;
		brand = "�Ե�";
		num -= 10; // �̹� ����ƽ�� �÷����� �״����� �ν��Ͻ��� �ʱ�ȭ �ϴ� ���� �����ϴ�.
	}
	static {
//		name ="Ȩ����";
//		brand = "����";
//		price = 2000;
//		// Cannot make a static reference to the non-static field name
//		// ��Ÿƽ�� ���⶧���� �ν��Ͻ� ���̴�. �ν��Ͻ��� ��������ٴ°� ��ü�� ����� ���ٴ°�
//		// ��ü�� ����� ���� �޸𸮿����� �ö󰣴�.
//		// ��Ÿƽ�� ���α׷� �������ڸ��� �ö󰣴�.
//		// �����Ǵ� ������ �ٸ��� ������ ���� ���� ����.
		
		num = 150;
		num--;
		//������ ����ƽ ó�� �޸� ������ �ö󰡴� ������ ���� �ֵ鸸 ����
		
		//����ƽ ����� ���۽� �ѹ��� �ʱ�ȭ �ȴ�.
		//num 150 ����, --���� �ؼ� 149 ���� ����  => �ν��Ͻ� ��ü �ʱ�ȭ �ؼ�  139
		// �ν��Ͻ� ���� ��ü ������ ���� �ʱ�ȭ �ϱ⶧����!!
		// ��ü2 ���� �Ǽ� �ν��Ͻ� ��� �ʱ�ȭ -10 = 129
		// ��ü3 ���� �Ǽ� ��  �ν��Ͻ� ��� �ʱ�ȭ -10 =119
	}
	
	public void inform() {
		System.out.println(name + ", " + brand + ", " + price + ", " + num);
	}

}

package com.kh.variable;

public class E_PrintMethod {
	
	String str1 = "�ȳ��ϼ���"; 
	//��������: �޼ҵ念���� str���� �ּ��ϰ�(=���������� �ּ��ϰ�) Ŭ���� ������ str�� ������ָ� �Ʒ� �� �޼ҵ� ������ �� �ݿ��� �ȴ�.=��������
	String str2 = "�ݰ����ϴ�";
	
	
	
	public void printExample() {
		//��������: �޼ҵ� �ȿ� �ִ� ����
//		String str1 = "�ȳ��ϼ���";
//		String str2 = "�ݰ����ϴ�";
		
		System.out.print(str1);
		System.out.print(str2);
		
		
	}



public void printlnExample() {
	//��������: �޼ҵ� �ȿ� �ִ� ����
//	String str1 = "�ȳ��ϼ���";
//	String str2 = "�ݰ����ϴ�";
	
	System.out.println(str1);
	System.out.println(str2);
	System.out.println("�ڽſ�");
}	

public void printfExample() {
	//�ȳ��ϼ���, �ڽſ��Դϴ�. �ݰ����ϴ�. �� ����ϰ��� �Ѵ�.
	//-------			----------
	//str1				str2	
//	System.out.printf("����ϰ����ϴ� ����", );
	System.out.printf("%s, �ڽſ��Դϴ�. %s.", str1, str2); //���ڸ� ����ϴ������͸� ������γ־��ش�.
	
//�ݰ����ϴ�. ģ�ϰ� ������.
	System.out.printf("%s, ģ�ϰ�������.", str2);
	
	System.out.println();
	
	//�̴Ϲ���
	//�ȳ��ϼ���, ���� 20�� �ڽſ� �����Դϴ�. ������ �ݰ����ϴ�.
	int age = 20;
	String name = "�ڽſ�";
	String job = "����";
	
	System.out.printf("%s. ���� %d�� %s %s�Դϴ�. ������ %s.",str1,age,name,job,str2);
	
	

}

}
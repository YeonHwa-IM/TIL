package com.kh.example.chap03.branch;

public class B_Continue {
	// continue�� �ݺ��� �ȿ����� ����� �����ϴ�.
	// continue�� ������ �Ʒ������� ���������ʰ�,
	// �ݺ����� �ٽ� ������
	// for���� ��� ���������� ����, while���� ��� ���ǽ����� ��
	
	public void method1() {
		//1~100���� �������� �հ踦 ����ϵ� ��, 4�� ����� ���� ���
		
		//�հ� ��� sum ������ְ�, 
		//1~100������ ���ǹ� ������ְ�
		//��, ���� ���� ������ if ������ְ�, 4�� ��� ����
		//��� ������ֱ�
		
		int sum = 0; 
		for(int i=1; i <=100; i++) {
			if(i %4 == 0) {
				continue;
			}
			System.out.print(i + " ");
			sum += i;
		}
		System.out.println();
		System.out.println("sum = " + sum);
	
	
}
	
	
	public void method2() {
		//������ ��� : ¦�� ��, ¦�� �� ���� ���
		//Ȧ���� �� ��� 
		
				
		for(int dan = 2; dan <= 9; dan++) {
			System.out.println("===============" + dan + "�� ==============");
			for(int su = 1; su <= 9; su++) {
				
				if(dan %2 == 0 || su %2 == 0) {
					continue;
				}
				
				System.out.printf("%d * %d = %d%n",dan,su,(dan*su));
				}
						
			System.out.println();
		}
	}
}	
			
			



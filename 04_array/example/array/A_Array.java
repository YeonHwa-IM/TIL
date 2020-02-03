package com.kr.example.array;

import java.util.Scanner;

public class A_Array {
//	//�迭: ���� �ڷ����� ������ �ϳ��� �������� �ٷ�� ��.
//	//�迭 ����:
//	// �ڷ��� [] �迭��; ù��°���� �� ���� ����Ѵ�
//	// �ڷ���      �迭��[];
//	//�迭�Ҵ�
//��	// �ڷ��� []  �迭�� = new �ڷ���[�迭ũ��];
//��	// �ڷ��� 	�迭��[] = new �ڷ���[�迭ũ��];
//��	// new �����ڸ� ���� heap ������ �迭ũ�⸸ŭ ���� ����
//��	// ������ �����Ǵ� ���� �� ������ ���� �ּ� ���� ����
//	// �� �ּҰ��� Stack�� �ִ� �迭�� ������ ����(�����ϰ� ����)
//	
//	/////////////////////////////////////
//	
//	// �迭 �ʱ�ȭ : ó������ �־��ִ°�.
//��	//	 1) �ε��� �̿�
//	//		�迭��[�ε�����ȣ] = ��;
//��	//	 
//	//	2) for�� �̿� : ��Ģ�� ���� ���� ��밡��
//	//		for(int i =0; i<�迭��.length; i++){
//��	//		�迭��[i] = ��;
//	//		}
//	//	 
//	//	3) ����� ���ÿ� �ʱ�ȭ
//	//		 �ڷ���[] �迭�� = {��};
//	//	 	�ڷ���[] �迭�� = new �ڷ���[]{��};
	
	public void method1() {
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		int num5 = 50;
		int num6 = 60;
		int num7 = 70;
		int num8 = 80;
		int num9 = 90;
		
		int sum1 = 0;
		sum1 += num1;
		sum1 += num2;
		sum1 += num3;
		sum1 += num4;
		sum1 += num5;
		sum1 += num6;
		sum1 += num7;
		sum1 += num8;
		sum1 += num9;
		
		//���� �ڷ����̱⶧���� �迭�� �������ִ�.
		int[] arr = new int[9];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		arr[5] = 60;
		arr[6] = 70;
		arr[7] = 80;
		arr[8] = 90;
//		arr[9] = 100; //ArrayIndexOutOfBoundsException: 9
		// ���� �ִ� ���̺��� ���ƴٴ� ����. 9��°��.
		// ���� �ε��� ������ ������ �Ͼ�� ����.  
		/*Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 9
		at com.kr.example.array.A_Array.method1(A_Array.java:61)
		at com.kr.example.run.Run.main(Run.java:8)
		*/
		
		for(int i = 0; i < arr.length; i++) {//������ ������������, length�� �����;���.
			arr[i]= (i + 1) * 10;
		}
		
		int sum2 = 0;
		for(int i = 0; i < arr.length; i++) {
			sum2 += arr[i];
		}
		
		for(int i =0; i < arr.length; i++) {
			System.out.println("arr["+i+"] : "+ arr[i]);
		}
		
		/*arr[0] : 10
		arr[1] : 20
		arr[2] : 30
		arr[3] : 40
		arr[4] : 50
		arr[5] : 60
		arr[6] : 70
		arr[7] : 80
		arr[8] : 90*/
	}
	public void method2() {
		// �迭�� �� �� ������ �迭�� ũ�⸦ ������ �� ����.
		// �迭�� �ѹ� ����� ���̰�, ���� �ִ� �迭�� �ٲ�ġ�� �ȴ�.
		// �����Ǵ� ��ó�� ���̳�, ����� �űԷ� �迭�� ��������� �����?
		
		double[] dArr = new double[10];
		System.out.println("dArr�� �ּ� : " + dArr);
		//dArr�� �ּ� : [D@15db9742 �� �����µ�, ���� �ּҰ��� �ƴϰ�..
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �迭 ũ�� : ");
		int size = sc.nextInt();
		 
		dArr = new double[size];
		System.out.println("dArr�� �ּ� : " + dArr);
		/*dArr�� �ּ� : [D@15db9742
		������ �迭 ũ�� : 5
		dArr�� �ּ� : [D@28d93b30*/
		// �ּҰ� ����� ���� ����, �迭 ũ�Ⱑ ������ �ðų� �پ��� �ƴ�,
		// ���ο� �ּҷ� �ٲ�ġ�� �ϴ� ���̴�.
		
		// �Ҵ�� �迭 �����
		dArr = null;
	}
	public void method3() {
		// �迭 �ʱ�ȭ
		// 1.�ε��� �̿��ؼ� �ʱ�ȭ
		
		// iArr �̶�� int�� 5��¥�� �迭 ����
		
		int[] iArr = new int[5];
		
		iArr[0] = 1;
		iArr[1] = 2;
		iArr[2] = 3;
		iArr[3] = 4;
		iArr[4] = 5;
		
		// 2. for�� �ʱ�ȭ
		
		for(int i = 0; i < iArr.length; i++) {
			iArr[i] = i + 1;
		}
		
		// 3. ����� ���ÿ�  �ʱ�ȭ
		int[] iArr2 = {1,2,3,4,5};
		int [] iArr3 = new int[] {1,2,3,4,5};
		//�� �⺻ �ڷ����� �ƴϾ �����ϴ�.
		
		
		
		
		
	}
	
	
}













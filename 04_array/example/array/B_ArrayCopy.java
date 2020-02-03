package com.kr.example.array;

import java.util.Arrays;

public class B_ArrayCopy {
	//���� ���� : �迭�� �ּҸ� ����
	
	//���� ���� : ������ ���ο� �迭�� �����Ͽ� ���� ���� �� ����
	
	// ���� ���縦 �ϴ� 4���� ���
	//1. for���� �̿��� 1:1 ����
	//2. System.arraycopy()�̿��� ����
	//3. Arrays.copyOF()�̿��� ����
	//4. clone() �̿��� ���� // �ڹ������� ������� ������
	
	public void method1() {
		int[] originArr ={1,2,3,4,5};
		int[] copyArr = originArr; //���� ����  : ���� ������ ��� �ּҰ��� ����. �������� ���� �ٲ��.
		
		for(int i =0; i < originArr.length; i++) {
			System.out.print(originArr[i]+ " ");   // ��� 1 2 3 4 5 
		} 
		System.out.println(); // �������� ���
		
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i]+ " ");   //��� 1 2 3 4 5 
		}
		System.out.println(); //ī�� ���
	
		
		//���� �迭�� 0��° �ε����� 99�� ����
		originArr[0] = 99;
		
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");    //��� 99 2 3 4 5
		}
		System.out.println(); // �������� ���
		
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");   //��� 99 2 3 4 5
		}
		System.out.println(); // ī�����
		
		System.out.println("originArr�� �ּ� �� : " + originArr); // ��� originArr�� �ּ� �� : [I@15db9742
		System.out.println("copyArr�� �ּ� �� : "+ copyArr);  // ��� copyArr�� �ּ� �� : [I@15db9742
	}	
	
	public void method2() {  //���� ���� : �ּҰ��� �ٸ���, �����ص� ī�Ǻ��� �ٲ��� �ʴ´�.
		//���� ���� 1. for�� �̿�
		
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = new int[5]; //������ ���ε��� �������
		
		System.out.println("======ó�� arr�� �� ======");
		
		for(int i = 0; i<originArr.length; i++) {
			copyArr[i] = originArr[i]; // ī�� i(�迭��ũ��)�� ������ i(�迭�� ũ��)�� ����ְڴ�.	
		}
		
		for(int i = 0; i<originArr.length; i++) {
			System.out.print(originArr[i]+" ");
		}
		System.out.println(); // �������� ��� 
		
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i]+" ");
		}
		System.out.println(); // ī�� ���
		
		/*======ó�� arr�� �� ======
			1 2 3 4 5 
			1 2 3 4 5 */
				
		System.out.println("======originArr�� 0��° �ε����� 99�� ���� ======");
		originArr[0]=99; //�������� 0��° �ε��� �迭 ������
		
		for(int i =0; i < originArr.length; i++) {
			System.out.print(originArr[i]+" ");
		}
		System.out.println(); // �������� ��� 
		
		for(int i =0; i < copyArr.length; i++) {
			System.out.print(copyArr[i]+" ");
		}
		System.out.println(); // ī�����
	}
	
		/*======originArr�� 0��° �ε����� 99�� ���� ======
			99 2 3 4 5 
			1 2 3 4 5 */
		
	public void method3() {
		//���� ���縦 �ϴ� 4���� ��� �� 
		
		//���� ���� 2. System.arraycopy()�̿��� ����
		
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = new int[10];
		
		
		//System.arraycopy(src,   	srcPos,       dest,    	destPos,    	legnth);
		//			             �����迭      �����迭������ġ     ����迭   	 ����迭 ������ġ   	�������
		
		//originArr�迭�� ��� �����͸� copyArr�迭�� ���縦 �ϴµ� 
		//copyArr�� 3��°�������� �ٿ��ְ� ����
		System.arraycopy(originArr, 0, copyArr, 3, originArr.length);
						//�����迭    , �����迭 ������ġ, ����迭, ����迭 ������ġ, �������.
						//�������迭�� 0��°���� ��ü ũ�⸦, ī�ǹ迭�� 3��°���� ���� �ٿ� �ְڴ�.
		for(int i = 0; i< originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}	
		System.out.println(); // �������� ���
		
		for(int i=0; i<copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println(); // ī�����
		
		/*1 2 3 4 5 
		  0 0 0 1 2 3 4 5 0 0 // ī�ǹ迭�� 3��°���� �ٿ��ֱ� �߱� ������ 0~3������ 0�̴�.
		 */ 				  //0�� ������ ��Ʈ�� �⺻���� 0�̶� �̴�. 0���� �ʱ�ȭ �Ǿ� �ֱ� �����̴�.
		//�ڹٿ��� Ŭ������ �����ڷ����� �����ְ�, ����Ƽ�� �ڵ�� �Ǿ� ������ ����� ����.
		//�ý��� Ŭ���� �ҽ� �������°� ĸ���ص���.
		
		originArr[0] = 99;  // �������� 99�� �ٲ㺸��, �������� �ٲ��, ī�Ǵ� �ٲ��� ���� ���� Ȯ���Ҽ��ִ�.
		
		for(int i = 0; i< originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}System.out.println(); //�������� ���
		
		for(int i=0; i<copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println(); //ī�����
		/*
		 99 2 3 4 5 
		 0 0 0 1 2 3 4 5 0 0 */
	}
	public void method4() {
		//���� ���� 3: Arrays.copyOF()�̿�
		
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = new int[10];
		
		System.out.println("======ó�� arr�� �� ======");
		
		for(int i =0; i < originArr.length; i++) {
			System.out.print(originArr[i]+" ");
		}
		System.out.println();  //�������� ���
		
		for(int i=0; i < copyArr.length; i++) {
			System.out.print(copyArr[i]+" ");
		}
		System.out.println(); // ī�� ���
		
		/*======ó�� arr�� �� ======
		 1 2 3 4 5 
		 0 0 0 0 0 0 0 0 0 0 */
		//0�� ������ ��Ʈ�� �⺻���� 0�̶� �̴�. 0���� �ʱ�ȭ �Ǿ� �ֱ� �����̴�.
		
		System.out.println("======copyOF()�� ���� �� ======");
		
		//Arrays.copyOf(original,   newLength)
		// 				���� �迭,		������ ����
		
		Arrays.copyOf(originArr, originArr.length);
		//����� ��� Ŭ������ �迭�� ����� �� ���ϰڴ� �ϴ� �޼ҵ���� ��Ƴ��� Ŭ�����̴�.
		//(�÷������� ����� Ŭ������ ����. �÷������  �÷����� ����Ҷ� ���Ѱ͵��� ��Ƴ��� Ŭ����)
		
		copyArr = Arrays.copyOf(originArr, originArr.length); // ����
		
		for(int i =0; i < originArr.length; i++) {
			System.out.print(originArr[i]+" ");
		}
		System.out.println();  //�������� ���
		
		for(int i=0; i < copyArr.length; i++) {
			System.out.print(copyArr[i]+" ");
		}
		System.out.println(); //ī�� ���
		
		/*
		
		======copyOF()�� ���� �� ======
		1 2 3 4 5 
		1 2 3 4 5 
		 
		 */
	}

}

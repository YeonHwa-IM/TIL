package com.kh.example.chap02_tryCatch_controller;

import java.io.IOException;

public class TryCatchController {
	public void method1() {
		System.out.println("method1 ȣ�� �� ...");
		try {
			method2();
			System.out.println("���� �߻� �ÿ� ��µɱ�?->��¾ȵȴٸ�~ method2���� ���ܹ߻��ϴϱ� catch�� �Ѿ��");
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage()); // ���̿��ͼ����� ������ �޼����� ����Ϸ����Ҷ� �� �޼����� �߰��س��´�.
		} catch(Exception e) {
			System.out.println("Exeption���� �����");
		} finally{
			System.out.println("���� �߻����ο� ������� ������ �����");
		}
		System.out.println("method1 ���� �� ...");
	}
	public void method2() throws IOException {
		System.out.println("method2 ȣ�� ��...");
		method3();
		System.out.println("method2 ���� �� ..."); //�޼ҵ�2���� ������ �߻��߱⶧���� ĳġ�������� �̵�.
	}
	public void method3() throws IOException {
		System.out.println("method3 ȣ�� �� ...");
		throw new IOException("IOExcaption�� ������ �߻����׽��ϴ�."); //����Ʈ ���־���� ���⼭ �ۼ��� �޼����� e.getMessage()���� �����.
//		System.out.println("method3 ���� �� ..."); --> �ּ�ó��
	}

}
//method1 ȣ�� �� ...
//method2 ȣ�� ��...
//method3 ȣ�� �� ...
//java.io.IOException: IOExcaption�� ������ �߻����׽��ϴ�. //<= e.getMessage()���� �޼����� ������.
//	at com.kh.example.chap02_tryCatch_controller.TryCatchController.method3(TryCatchController.java:28)
//	at com.kh.example.chap02_tryCatch_controller.TryCatchController.method2(TryCatchController.java:23)
//	at com.kh.example.chap02_tryCatch_controller.TryCatchController.method1(TryCatchController.java:9)
//	at com.kh.example.chap02_tryCatch.run.Run.main(Run.java:8)
//���� �߻����ο� ������� ������ �����
//method1 ���� �� ...
//���α׷��� ���� �� ...

//���� ����� �Ʒ�ó�� �ٲܼ�����. ���� : ���� �����ϱ� 

//method1 ȣ�� �� ...
//method2 ȣ�� ��...
//method3 ȣ�� �� ...
//IOExcaption�� ������ �߻����׽��ϴ�.
//���� �߻����ο� ������� ������ �����
//method1 ���� �� ...
//���α׷��� ���� �� ...
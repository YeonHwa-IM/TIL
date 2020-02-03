package com.kh.example.chap02.control.thread;

public class Thread4 implements Runnable{
	

	@Override
	public void run() {
		int count = 0;
		
		while(count < 10 && !Thread.currentThread().isInterrupted()) {
		//count�� 10�̸��̸鼭, ���� �����忡 Interrupted�� false�� ��� ����.
		//ī��Ʈ�� 10 �̸��̸鼭 Interrupted�� �ƴҶ� false�� ��ȯ �ε� !�̱⶧���� true�� ��ȯ�Ѵ�.
		try {
			Thread.sleep(1000);
			System.out.println((++count)+"��");
		} catch (InterruptedException e) {
			System.out.println(count + "�ʿ� ī��Ʈ ����");
			Thread.currentThread().interrupt();
		}
		
//		���� ����� �޼ҵ带 �ݺ��ϴٰ� ���ͷ�Ʈ�� ������
//		���ͷ�Ƽ�� �ͼ����� �����ϴ°��� �´� 
//		������ "�ʿ� ī��Ʈ ����"�� �߻��Ѱ��� Ȯ�ΰ���.
//
//		���ͷ�Ƽ�� �ͼ����� �����ϸ�, ���� ���ͷ�Ƽ���� �ߴ� ���°��� �߰��� Ʈ��� �ٲ���
//		���ͷ�Ƽ�� �ͼ����� ������ (���� ���ͷ�Ƽ���� ���� �ʱ�ȭ�ȴ�) = �ٽ� �޽��� �ȴ�.
//		�޽��� �Ǿ �ٽ� ���Ϲ��� ����Ǽ� ���ǿ� ������ ��� ����ǰ� �ȴ�.
//
//		���ͷ�Ʈ �޼ҵ带 �θ���, �ᱹ ���ͷ�Ƽ�� �ͼ����� ������ �Ǵµ�
//		������ ĳġ�ȿ��� ���ͷ�Ƽ��޼ҵ带 �߻���Ų�ٸ� Ʈ�簡 ���״ϱ� �������ͷ�Ƽ�忡 �ɸ��� �ʴ´�.
		
		
		}
	}

}

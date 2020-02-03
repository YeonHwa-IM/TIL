package com.kh.example.chap01_inet;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetExample {
	//InetAdress: IP�ּҸ� �ٷ�� ���� �ڹٿ��� �����ϴ� Ŭ����
	public static void main(String[] args) {
	
		try {
			//static InetAddress getLocalHost() : ���� ȣ��Ʈ(��Ʈ��ũ�� ����Ǿ� �ִ� ��ǻ��)�� Host��� IP�ּ� ��ȯ
			InetAddress localIP = InetAddress.getLocalHost(); // ��Ÿƽ�̶� �ٷ� ��ü �������� !!!
			// String getHostName() : ȣ��Ʈ �̸� ��ȯ
			System.out.println("�� PC�� : "+localIP.getHostName());
			
			// String getHostAddress() : ȣ��Ʈ IP�ּ� ��ȯ
			System.out.println("�� IP : " + localIP.getHostAddress());
			
			//byte[] getAddress() : IP�ּҸ� byte�迭�� ��ȯ
			byte[] ipAddress = localIP.getAddress();
			System.out.println(Arrays.toString(ipAddress)); //[-64, -88, 10, 59]
			
			//static InetAddress getbyName(String host) : ������ ��(host)�� ���� IP�ּ� ����
			InetAddress ieiIP = InetAddress.getByName("www.iei.or.kr");
			System.out.println("iei ���� ��  : "+ ieiIP.getHostName());
			System.out.println("iei ���� ��  : "+ ieiIP.getHostAddress());
			
			System.out.println();
			
			InetAddress[] googleIPs = InetAddress.getAllByName("www.google.com");
			System.out.println("���� IP ���� : " + googleIPs.length);
			for(InetAddress ip : googleIPs) { // ���� ����, ����ġ ��
				System.out.println(ip.getHostAddress());
			}
//			���� IP ���� : 1
//			172.217.24.36
			
			System.out.println();
			
			InetAddress[] naverIPs = InetAddress.getAllByName("www.naver.com");
			System.out.println("���̹� IP ���� : "+ naverIPs.length);
			for(InetAddress ip:naverIPs) {
				System.out.println(ip.getHostAddress());
			}
			
//			���̹� IP ���� : 2
//			210.89.160.88
//			210.89.164.90
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} 
	}
}

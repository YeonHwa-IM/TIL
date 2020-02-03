package com.kh.example.chap01_inet;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetExample {
	//InetAdress: IP주소를 다루기 위해 자바에서 제공하는 클래스
	public static void main(String[] args) {
	
		try {
			//static InetAddress getLocalHost() : 지역 호스트(네트워크에 연결되어 있는 컴퓨터)의 Host명과 IP주소 반환
			InetAddress localIP = InetAddress.getLocalHost(); // 스타틱이라서 바로 객체 생성없이 !!!
			// String getHostName() : 호스트 이름 반환
			System.out.println("내 PC명 : "+localIP.getHostName());
			
			// String getHostAddress() : 호스트 IP주소 반환
			System.out.println("내 IP : " + localIP.getHostAddress());
			
			//byte[] getAddress() : IP주소를 byte배열로 반환
			byte[] ipAddress = localIP.getAddress();
			System.out.println(Arrays.toString(ipAddress)); //[-64, -88, 10, 59]
			
			//static InetAddress getbyName(String host) : 도메인 명(host)을 통해 IP주소 얻음
			InetAddress ieiIP = InetAddress.getByName("www.iei.or.kr");
			System.out.println("iei 서버 명  : "+ ieiIP.getHostName());
			System.out.println("iei 서버 명  : "+ ieiIP.getHostAddress());
			
			System.out.println();
			
			InetAddress[] googleIPs = InetAddress.getAllByName("www.google.com");
			System.out.println("구글 IP 개수 : " + googleIPs.length);
			for(InetAddress ip : googleIPs) { // 향상된 포문, 포이치 문
				System.out.println(ip.getHostAddress());
			}
//			구글 IP 개수 : 1
//			172.217.24.36
			
			System.out.println();
			
			InetAddress[] naverIPs = InetAddress.getAllByName("www.naver.com");
			System.out.println("네이버 IP 개수 : "+ naverIPs.length);
			for(InetAddress ip:naverIPs) {
				System.out.println(ip.getHostAddress());
			}
			
//			네이버 IP 개수 : 2
//			210.89.160.88
//			210.89.164.90
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} 
	}
}

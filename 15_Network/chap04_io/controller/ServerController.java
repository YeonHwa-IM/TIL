package com.kh.example.chap04_io.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import com.kh.example.chap04_io.model.vo.Person;

public class ServerController {
	public void startServer() {
		//1. 서버 포트 번호 생성
		
		int port = 8500;
		//2. 서버용 소켓 객체 생성
		try {
			ServerSocket server = new ServerSocket(port);
			
			//3. 클라이언트 호출 기다림
			System.out.println("클라이언트 호출 기다림...");
			
			//4. 클라이언트 호출을 accept()로 받아 클라이언트 객체 생성
			Socket client = server.accept();		
//			String clientIP = client.getInetAddress().getHostAddress();
			
			//5. 입출력 스트림생성
			//6. 보조 스트림생성해서 성능개선
			InputStream in = client.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(in);
			

			//7. 값 읽고 쓰기
			Person message = null;
			while(true) {

				message = (Person)ois.readObject();
				if(message != null) {
					System.out.println(client.getInetAddress().getHostAddress()+"가 보낸 메시지 : "+ message);
				}else {
					break;
				}
			}
			//8. 통신종료
			ois.close();
			server.close();

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}


	}


}



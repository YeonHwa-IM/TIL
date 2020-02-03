package com.kh.example.chap03_sendExit.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	public void startClient() {
		//1. 서버의 포트 번호과 서버IP주소를 매개변수로 해서 클라이언트용 소켓 객체 생성
		int port = 8501;
		
		try { // 다른사람하고 통신하려면 다른 사람 IP를 가져와야함!!!!!!
//			String serverIP = InetAddress.getLocalHost().getHostAddress();
			String serverIP = "192.168.10.60";//근오 번호 
			Socket socket = new Socket(serverIP, port);
			
			if(socket != null) {
				//2. 입출력 스트림 생성 / 조건이있음. 연결실패시 null반환
				InputStream input = socket.getInputStream();
				OutputStream output = socket.getOutputStream();
				//3.보조 스트림으로 성능 보조
				BufferedReader br = new BufferedReader(new InputStreamReader(input));
				PrintWriter pw = new PrintWriter(output);

				Scanner sc = new Scanner(System.in);

				do {
					//4. 읽고 쓰기
					System.out.print("대화 입력 : ");
					String message = sc.nextLine();

					pw.println(message);
					pw.flush();

					if(message.equals("exit")) {
						break;
					}
					String receiveMessage = br.readLine();
					System.out.println(receiveMessage);

				}while(true);

				//5. 통신종료
				br.close();
				pw.close();
				socket.close();

			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}

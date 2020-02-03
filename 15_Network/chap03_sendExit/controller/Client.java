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
		//1. ������ ��Ʈ ��ȣ�� ����IP�ּҸ� �Ű������� �ؼ� Ŭ���̾�Ʈ�� ���� ��ü ����
		int port = 8501;
		
		try { // �ٸ�����ϰ� ����Ϸ��� �ٸ� ��� IP�� �����;���!!!!!!
//			String serverIP = InetAddress.getLocalHost().getHostAddress();
			String serverIP = "192.168.10.60";//�ٿ� ��ȣ 
			Socket socket = new Socket(serverIP, port);
			
			if(socket != null) {
				//2. ����� ��Ʈ�� ���� / ����������. ������н� null��ȯ
				InputStream input = socket.getInputStream();
				OutputStream output = socket.getOutputStream();
				//3.���� ��Ʈ������ ���� ����
				BufferedReader br = new BufferedReader(new InputStreamReader(input));
				PrintWriter pw = new PrintWriter(output);

				Scanner sc = new Scanner(System.in);

				do {
					//4. �а� ����
					System.out.print("��ȭ �Է� : ");
					String message = sc.nextLine();

					pw.println(message);
					pw.flush();

					if(message.equals("exit")) {
						break;
					}
					String receiveMessage = br.readLine();
					System.out.println(receiveMessage);

				}while(true);

				//5. �������
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

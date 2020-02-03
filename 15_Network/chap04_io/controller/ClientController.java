package com.kh.example.chap04_io.controller;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;

import com.kh.example.chap04_io.model.vo.Person;

public class ClientController {
	// 객체를 파일로 만들어줄것. => 오브젝트 아웃풋 인풋을 통해서

	public ClientController() {
		// 객체를 파일로 만들기 위한 Stream 구현(파일이름 : person.txt)

		try (FileOutputStream fos = new FileOutputStream("person.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {

//			input  // 불러오는것
//			output // 내가 쓰는거(안녕하세요) 를 person.txt 

			ArrayList<Person> list = new ArrayList<Person>();
			list.add(new Person("박신우", 20));
			list.add(new Person("강건강", 20));
			list.add(new Person("남나눔", 20));

			for (Person p : list) {
				oos.writeObject(p);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}// 여기까지가 기본 생성자.

	public void startClient() {
//		int port = 8500;
		try {
			// 1. 서버의 ip주소와 서버 포트를 매개변수로 클라이언트 소켓 객체 생성
			String server = InetAddress.getLocalHost().getHostAddress();
			Socket socket = new Socket(server, 8500);

			// 2. 입출력 스트림 생성
			// 3. 보조 스트림을 통해 성능 향상
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.txt"));
			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());

			// 4. 읽고 쓰기

			try {
				while (true) {
					Person p = (Person) ois.readObject();
					oos.writeObject(p); // 객체를 보내주려한다.
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (EOFException e) {
				// EOFException이 발생했다. => 문서의 끝에 도달했다.
				oos.writeObject(null);
				oos.flush();
			}

			// 5. 통신 종료
			ois.close();
			oos.close();
			socket.close();

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}

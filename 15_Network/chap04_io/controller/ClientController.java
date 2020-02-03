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
	// ��ü�� ���Ϸ� ������ٰ�. => ������Ʈ �ƿ�ǲ ��ǲ�� ���ؼ�

	public ClientController() {
		// ��ü�� ���Ϸ� ����� ���� Stream ����(�����̸� : person.txt)

		try (FileOutputStream fos = new FileOutputStream("person.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {

//			input  // �ҷ����°�
//			output // ���� ���°�(�ȳ��ϼ���) �� person.txt 

			ArrayList<Person> list = new ArrayList<Person>();
			list.add(new Person("�ڽſ�", 20));
			list.add(new Person("���ǰ�", 20));
			list.add(new Person("������", 20));

			for (Person p : list) {
				oos.writeObject(p);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}// ��������� �⺻ ������.

	public void startClient() {
//		int port = 8500;
		try {
			// 1. ������ ip�ּҿ� ���� ��Ʈ�� �Ű������� Ŭ���̾�Ʈ ���� ��ü ����
			String server = InetAddress.getLocalHost().getHostAddress();
			Socket socket = new Socket(server, 8500);

			// 2. ����� ��Ʈ�� ����
			// 3. ���� ��Ʈ���� ���� ���� ���
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.txt"));
			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());

			// 4. �а� ����

			try {
				while (true) {
					Person p = (Person) ois.readObject();
					oos.writeObject(p); // ��ü�� �����ַ��Ѵ�.
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (EOFException e) {
				// EOFException�� �߻��ߴ�. => ������ ���� �����ߴ�.
				oos.writeObject(null);
				oos.flush();
			}

			// 5. ��� ����
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

package com.kh.example.chap02_char.model.vo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharDAO {
	//����Ʈ ����� 1 ����Ʈ, ���ڱ���� 2 ����Ʈ ���ڱ�� ��Ʈ���� ������.
	public void fileSave() {
		try(FileWriter fw = new FileWriter("b_char.txt");) { //�����ݷ� �ٿ��� �ǰ� �Ⱥٿ��� ��
		
		fw.write("��, IO ���� ��մ�!!");
		fw.write('A');
		fw.write(' ');
		char[] cArr = {'a', 'p', 'p', 'l', 'e'};
		fw.write(cArr);
		
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileOpen(){

		try(FileReader fr = new FileReader("b_char.txt");) {
			
			int value;
			while((value= fr.read()) != -1) {//The character read, or -1 if the end of the stream has been reached
				System.out.print((char)value + " ");
			}
		} catch(FileNotFoundException e) {
			e. printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}

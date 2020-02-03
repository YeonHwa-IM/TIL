package com.kh.example.chap02_char.model.vo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharDAO {
	//바이트 기반은 1 바이트, 문자기반은 2 바이트 문자기반 스트림을 만들어보자.
	public void fileSave() {
		try(FileWriter fw = new FileWriter("b_char.txt");) { //새미콜론 붙여도 되고 안붙여도 됨
		
		fw.write("와, IO 정말 재밌다!!");
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

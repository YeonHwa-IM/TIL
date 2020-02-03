package com.kh.example.chap01_byte.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class ByteDAO {
	public void fileOpen() {
		//FileInputStream fis = new FileInputStream("a_byte.txt");
		//기본생성자가 없어서 빨간줄이 뜬다.
		//Unhandled exception type FileNotFoundException :
		//일어날수도 잇고 일어나지 않을수도있으니 예외처리 하자 라는 뜻
		
			try {
				InputStream is = new FileInputStream("test.txt");
				
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		
			try(FileInputStream fis = new FileInputStream("a_byte.txt"); ) {
			
			//try {
			//abcdef  
			//	while(fis.read() != -1) { //read는 -1이 나오면 끝이다라는뜻.
			//		System.out.print((char)fis.read()+ " ");
			//리드는 읽는애라서 와일옆에있는리드도 읽고 그아랫줄 리드도 읽는것이다.
			// 읽고, 내려와서 읽고 출력하고, 다시 위로가서 읽고 , 아래와서 읽고 출력하니
			//띄엄띄엄 출력이 되는것이다. 이것을 해결하려면
			int value;
			while((value = fis.read()) != -1){
				System.out.print((char)value+ " ");
			}
		} catch(FileNotFoundException e) {
			e.printStackTrace();  // a_byte.txt (지정된 파일을 찾을 수 없습니다)
		} catch(IOException e) {
			e.printStackTrace();
		}
	}


	public void fileSave() {
		/*FileOutputStream fos = null;*/
		try(FileOutputStream fos = new FileOutputStream("a_byte.txt"/*true*/);) {
			//FileOutputStream(String name, boolean append)
			//true를 쓰면 덮어씌여지지않고 이어써진다.
			
			//write(int b):void
			fos.write(97); // 
			
			//write(byte[] b):void
			byte[] bArr = {98, 99, 100, 101, 102, 103};
			//				b,  c,  d,   e,   f,   g
			
			fos.write(bArr);
			
			//write(byte[] b, int off, int lne): void
			fos.write(bArr, 1, 3);//bArr배열의 1 index부터 3개 를 의미한다.: cde
			// 덮어씌여진다.
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
			
		 // **아웃풋스트림을 열면 반드시 닫아주어야한다.
		 // 사실은 깜빡하고 닫지 않아도 프로그램이 문제가 생기지 않는다.
		 // 그러나, 스트림이 많으면! 안에 데이터가 많이서 꼬일수도 있다.
		 // 에러여부와 상관없이 무조건 실행되어야 한다면 final안에 넣어주면 된다.
		}	

	}

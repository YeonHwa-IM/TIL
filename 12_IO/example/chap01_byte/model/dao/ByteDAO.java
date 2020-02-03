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
		//�⺻�����ڰ� ��� �������� ���.
		//Unhandled exception type FileNotFoundException :
		//�Ͼ���� �հ� �Ͼ�� �������������� ����ó�� ���� ��� ��
		
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
			//	while(fis.read() != -1) { //read�� -1�� ������ ���̴ٶ�¶�.
			//		System.out.print((char)fis.read()+ " ");
			//����� �д¾ֶ� ���Ͽ����ִ¸��嵵 �а� �׾Ʒ��� ���嵵 �д°��̴�.
			// �а�, �����ͼ� �а� ����ϰ�, �ٽ� ���ΰ��� �а� , �Ʒ��ͼ� �а� ����ϴ�
			//������ ����� �Ǵ°��̴�. �̰��� �ذ��Ϸ���
			int value;
			while((value = fis.read()) != -1){
				System.out.print((char)value+ " ");
			}
		} catch(FileNotFoundException e) {
			e.printStackTrace();  // a_byte.txt (������ ������ ã�� �� �����ϴ�)
		} catch(IOException e) {
			e.printStackTrace();
		}
	}


	public void fileSave() {
		/*FileOutputStream fos = null;*/
		try(FileOutputStream fos = new FileOutputStream("a_byte.txt"/*true*/);) {
			//FileOutputStream(String name, boolean append)
			//true�� ���� ����������ʰ� �̾������.
			
			//write(int b):void
			fos.write(97); // 
			
			//write(byte[] b):void
			byte[] bArr = {98, 99, 100, 101, 102, 103};
			//				b,  c,  d,   e,   f,   g
			
			fos.write(bArr);
			
			//write(byte[] b, int off, int lne): void
			fos.write(bArr, 1, 3);//bArr�迭�� 1 index���� 3�� �� �ǹ��Ѵ�.: cde
			// ���������.
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
			
		 // **�ƿ�ǲ��Ʈ���� ���� �ݵ�� �ݾ��־���Ѵ�.
		 // ����� �����ϰ� ���� �ʾƵ� ���α׷��� ������ ������ �ʴ´�.
		 // �׷���, ��Ʈ���� ������! �ȿ� �����Ͱ� ���̼� ���ϼ��� �ִ�.
		 // �������ο� ������� ������ ����Ǿ�� �Ѵٸ� final�ȿ� �־��ָ� �ȴ�.
		}	

	}

package com.kh.example.chap03_assist.part01_buffer.model.vo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferDAO {
	public void output() {
		
		try(FileWriter fw = new FileWriter("c_buffer.txt");
				BufferedWriter bw = new BufferedWriter(fw);) {
			
//try(BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.txt"));) {
// �̷��� ���°͵� ����	
			
//			FileWriter fw = new FileWriter("c_buffer.txt");
			//���� ���, ���
			
			// �� ��ü�ε� �����͸� ���(����) �� �� ����.
			// ���϶����Ϳ� ���۵带 �ްǵ�, 4���� ������ �ްǰ�. 
			// ������ ���⿡ ��������� ��Ű�� �; ������Ʈ���� �� ������.
			// �������� ���õ� ������Ʈ����  BufferedXXXXX�ε�
			// ������ 4�� �̴� 
							// BufferedInputStream
							// BUfferedReader
							// BufferedOutputStream
							// BufferedWriter
			// �� ������ ��� �ϴ°�? ==>BufferedWriter!
			// ���� ��ݿ�, ����Ұ��̱⶧���� 
			
//			BufferedWriter bw = new BufferedWriter(fw);
			//����� �����, ������ �����, �ȿ� ����� �־��ش�
			bw.write("�ȳ��ϼ���\n");
			bw.write("�ݰ����ϴ�.\n");
			bw.write("��ƴ�\n"); // �������� �ٹٲ��ؼ� ������ �ٱ��� �����ִ�.
			//Ʈ������Ʈ���ҽ� �Ҷ�, bw�� �޾��൵ �ȴ�.! bw�� fw�� �����ϰ��ֱ⶧���̴�.
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public void input() {
		
		try (BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"));){
//			FileReader fr = new FileReader("c_buffer.txt");
//			BufferedReader br = new BufferedReader(fr);
			
			String value;
			while((value = br.readLine()) != null) {
				System.out.println(value);
			}
			br.readLine();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

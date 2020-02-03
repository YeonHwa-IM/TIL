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
// 이렇게 적는것도 가능	
			
//			FileWriter fw = new FileWriter("c_buffer.txt");
			//문자 기반, 출력
			
			// 이 자체로도 데이터를 출력(저장) 할 수 있음.
			// 파일라이터에 버퍼드를 달건데, 4개중 무엇을 달건가. 
			// 하지만 여기에 성능향상을 시키고 싶어서 보조스트릠을 달 예정임.
			// 성능향상과 관련되 보조스트림은  BufferedXXXXX인데
			// 종류가 4개 이다 
							// BufferedInputStream
							// BUfferedReader
							// BufferedOutputStream
							// BufferedWriter
			// 중 무엇을 써야 하는가? ==>BufferedWriter!
			// 문자 기반에, 출력할것이기때문에 
			
//			BufferedWriter bw = new BufferedWriter(fw);
			//기반을 만들고, 보조를 만들고, 안에 기반을 넣어준다
			bw.write("안녕하세요\n");
			bw.write("반갑습니다.\n");
			bw.write("어렵다\n"); // 마지막에 줄바꿈해서 마지막 줄까지 나왔있다.
			//트라이위트리소스 할때, bw만 받아줘도 된다.! bw가 fw를 포함하고있기때문이다.
			
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

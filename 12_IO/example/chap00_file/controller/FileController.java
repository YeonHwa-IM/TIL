package com.kh.example.chap00_file.controller;

import java.io.File;
import java.io.IOException;

public class FileController {
	public void method1() {
		
		try {
			File f1 = new File("test.txt");
			f1.createNewFile();
		
			File f2 =new File("c:/test/test.txt");
			f2.createNewFile();
			
			File f3 = new File("c:\\temp3\\temp2");
			File f4 = new File("c:\\temp3\\temp2\\test.txt"); // \\경로를 나타낼때.
//			f4.createNewFile();//지정된 경로를 찾을 수 없습니다
			f3.mkdirs();//새로운 디렉토리 생성
			f4.createNewFile();
			f4.delete();
			
			System.out.println(f2.exists()); //true
			System.out.println(f3.exists()); //true // 존재하는지 질문
			System.out.println(f3.isFile()); //false //파일인지 물어보는 질문
			
			// 그외 메소드들
			
			System.out.println("파일 명 : "+ f1.getName());
			System.out.println("저장 절대 경로 : "+ f1.getAbsolutePath());
			//내가 어디에 있든지간에 변하지 않는 경로.
			System.out.println("저장 상대 경로 : "+ f1.getPath());
			//내 위치에 따라 상대의 위치가 계속 바뀌는 경로.
			System.out.println("f1 파일 용량 : "+f1.length());
			System.out.println("f2 파일 용량 : "+f2.length());
			System.out.println("f1 상위 폴더 : "+f1.getParent());
			System.out.println("f4 상위 폴더 : "+f4.getParent());
			
			/*
			파일 명 : test.txt
			저장 절대 경로 : D:\1_java_workspace\13_IO\test.txt
			저장 상대 경로 : test.txt
			파일 용량 : 0
			f1 상위 폴더 : null
			f4 상위 폴더 : c:\temp3\temp2
			 */
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}	

}

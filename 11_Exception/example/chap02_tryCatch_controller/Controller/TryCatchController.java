package com.kh.example.chap02_tryCatch_controller;

import java.io.IOException;

public class TryCatchController {
	public void method1() {
		System.out.println("method1 호출 됨 ...");
		try {
			method2();
			System.out.println("예외 발생 시에 출력될까?->출력안된다리~ method2에서 예외발생하니까 catch로 넘어갔음");
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage()); // 아이오익셉션이 보내는 메세지를 출력하려고할때 겟 메세지를 추가해놓는다.
		} catch(Exception e) {
			System.out.println("Exeption으로 잡았음");
		} finally{
			System.out.println("예외 발생여부와 상관없이 무조건 수행됨");
		}
		System.out.println("method1 종료 됨 ...");
	}
	public void method2() throws IOException {
		System.out.println("method2 호출 됨...");
		method3();
		System.out.println("method2 종료 됨 ..."); //메소드2에서 오류가 발생했기때문에 캐치구문으로 이동.
	}
	public void method3() throws IOException {
		System.out.println("method3 호출 됨 ...");
		throw new IOException("IOExcaption을 강제로 발생시켰습니다."); //임포트 해주어야함 여기서 작성한 메세지를 e.getMessage()에서 출력함.
//		System.out.println("method3 종료 됨 ..."); --> 주석처리
	}

}
//method1 호출 됨 ...
//method2 호출 됨...
//method3 호출 됨 ...
//java.io.IOException: IOExcaption을 강제로 발생시켰습니다. //<= e.getMessage()에서 메세지를 가져옴.
//	at com.kh.example.chap02_tryCatch_controller.TryCatchController.method3(TryCatchController.java:28)
//	at com.kh.example.chap02_tryCatch_controller.TryCatchController.method2(TryCatchController.java:23)
//	at com.kh.example.chap02_tryCatch_controller.TryCatchController.method1(TryCatchController.java:9)
//	at com.kh.example.chap02_tryCatch.run.Run.main(Run.java:8)
//예외 발생여부와 상관없이 무조건 수행됨
//method1 종료 됨 ...
//프로그램이 종료 됨 ...

//위의 출력을 아래처럼 바꿀수있음. 이유 : 보기 싫으니까 

//method1 호출 됨 ...
//method2 호출 됨...
//method3 호출 됨 ...
//IOExcaption을 강제로 발생시켰습니다.
//예외 발생여부와 상관없이 무조건 수행됨
//method1 종료 됨 ...
//프로그램이 종료 됨 ...
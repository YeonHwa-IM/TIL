package com.kh.example.chap04_io.Run;

import com.kh.example.chap04_io.controller.ServerController;

public class ServerRun {
	public static void main(String[] args) {
		new ServerController().startServer();
	}

}
//클라이언트 호출 기다림...
//192.168.10.59가 보낸 메시지 : 박신우20
//192.168.10.59가 보낸 메시지 : 강건강20
//192.168.10.59가 보낸 메시지 : 남나눔20
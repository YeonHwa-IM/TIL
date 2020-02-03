package com.kh.example.chap02_sendMsg.run;

import com.kh.example.chap02_sendMsg.controller.Server;

public class ServerRun {
	public static void main(String[] args) {
		new Server().serverStart();
	}

}
//클라이언트의 요청을 기다리고 있습니다.
//192.168.10.59가 연결을 요청함...
//192.168.10.59가 보낸 메세지 : 반가워요


//클라이언트의 요청을 기다리고 있습니다.
//192.168.10.60가 연결을 요청함...
//192.168.10.60가 보낸 메세지 : 누구세요?
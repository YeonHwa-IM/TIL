package com.kh.practice.file.controller;

import com.kh.practice.file.model.dao.FileDAO;

public class FileController {
	FileDAO fd = new FileDAO();

	// DAO에 매개변수를 전달하고, DAO로부터 전달받은 값을 다시 반환
	public boolean checkName(String file) {
		if (fd.checkName(file)) {
			return true;
		} else {
			return false;
		}
	}

	// 전달받은 매개변수를 변경하고 DAO에 전달
	public void fileSave(String file, StringBuilder sb) {
		String s = sb.toString();
		fd.fileSave(file, s);
		
	}

	// DAO에 매개변수를 전달하고, DAO로부터 전달받은 값을 다시 반환
	public StringBuilder fileOpen(String file) {
		return fd.fileOpen(file);
	}

	// 전달받은 매개변수를 변경하고 DAO에 전달
	public void fileEdit(String file, StringBuilder sb) {
		String s = sb.toString();
		fd.fileEdit(file, s);
		
	}
}

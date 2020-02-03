package com.kh.practice.file.controller;

import com.kh.practice.file.model.dao.FileDAO;

public class FileController {
	FileDAO fd = new FileDAO();

	// DAO�� �Ű������� �����ϰ�, DAO�κ��� ���޹��� ���� �ٽ� ��ȯ
	public boolean checkName(String file) {
		if (fd.checkName(file)) {
			return true;
		} else {
			return false;
		}
	}

	// ���޹��� �Ű������� �����ϰ� DAO�� ����
	public void fileSave(String file, StringBuilder sb) {
		String s = sb.toString();
		fd.fileSave(file, s);
		
	}

	// DAO�� �Ű������� �����ϰ�, DAO�κ��� ���޹��� ���� �ٽ� ��ȯ
	public StringBuilder fileOpen(String file) {
		return fd.fileOpen(file);
	}

	// ���޹��� �Ű������� �����ϰ� DAO�� ����
	public void fileEdit(String file, StringBuilder sb) {
		String s = sb.toString();
		fd.fileEdit(file, s);
		
	}
}

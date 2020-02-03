package com.kh.practice.file.model.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {
	// �����ϴ� ������ �ִ��� Ȯ�� �� ��ȯ
	public boolean checkName(String file) {
		try (FileReader fr = new FileReader(file/*���*/);) {
			return true;
		} catch (IOException e) {
			return false;
		}
	}

	// �Ű������� ���� ���� �� ���ڿ� ����
	public void fileSave(String file, String s) {
		try (FileWriter fw = new FileWriter(file);){
			fw.write(s);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// �Ű������� ���� ���� ���� �̿��Ͽ� ���� �Ǿ� �ִ� ������ ��ȯ
	public StringBuilder fileOpen(String file) {
		StringBuilder sb = new StringBuilder();
		
		try (BufferedReader fr = new BufferedReader(new FileReader(file))){
			String value;
			while((value=fr.readLine()) != null) {
				sb.append(value+"\n");
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}  catch (IOException e) {
			e.printStackTrace();
		} 
		
		return sb;
	}

	// �Ű������� ���� ���� �� ���ڿ� ����
	public void fileEdit(String file, String s) {
		
		try (FileWriter fw = new FileWriter(file,true)){
			
			fw.write(s);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

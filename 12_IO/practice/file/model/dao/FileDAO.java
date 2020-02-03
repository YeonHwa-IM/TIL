package com.kh.practice.file.model.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {
	// 존재하는 파일이 있는지 확인 후 반환
	public boolean checkName(String file) {
		try (FileReader fr = new FileReader(file/*경로*/);) {
			return true;
		} catch (IOException e) {
			return false;
		}
	}

	// 매개변수로 받은 파일 명에 문자열 저장
	public void fileSave(String file, String s) {
		try (FileWriter fw = new FileWriter(file);){
			fw.write(s);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 매개변수로 받은 파일 명을 이용하여 저장 되어 있는 데이터 반환
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

	// 매개변수로 받은 파일 명에 문자열 저장
	public void fileEdit(String file, String s) {
		
		try (FileWriter fw = new FileWriter(file,true)){
			
			fw.write(s);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

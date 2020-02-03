package com.kh.example.map.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;

import com.kh.example.map.model.vo.Snack;

public class MapController {
	public void doMap() {
		Map<String, Snack> map = new HashMap<String, Snack>(); // ���׸��� ������������ ������� ���.
		
		//1. ��ü��� �߰� map�� �߰��ϴ� �޼ҵ尡 �ٸ���. �÷����� ����� �����ʱ⶧����
		//put(K key, V value : Ű�� �� �߰�, ���� ��  value ��ȯ
		
		map.put("�����", new Snack("§��", 1500));
		map.put("������", new Snack("�ܸ�", 2500));
		map.put("��������Ĩ", new Snack("§��", 1500));
		map.put("��ҹ�", new Snack("����Ѹ�", 1000));
		System.out.println(map);
		
		//{������=�ܸ�[2500��], �����=§��[1500��], ��������Ĩ=§��[1500��], ��ҹ�=����Ѹ�[1000��]}
		//key= value���·� ������, ���� ���� �ȵǰ�, ���� �ߺ��̾ ���� �߻������� Ȯ��.
		
		map.put("�����", new Snack("�ſ��", 1500));
		System.out.println(map);
		//�� ���� �� ����غ���, ������� �߰������ʰ� �ſ������ value�� ��������°� Ȯ��.
		
		// Ű �Ǵ� ���� �ִ��� ������ Ȯ���ϴ� �޼ҵ�. 2���� �ִ�.
		// containsKey(Object key) : key�� ������ true ��ȯ
		// containsKey(Object value) : value�� ������ true ��ȯ
		System.out.println(map.containsKey("�����"));
		System.out.println(map.containsValue(new Snack("§��", 1500))); // ���ο� �ּҰ��̶� ���Ҽ��� ����. snack���� �������̵� ���
		//true
		//false => �������̵� ��  true
		
		//get(Object key) : Ű�� �� ��ȯ
		System.out.println(map.get("�����")); //�ſ��[1500��]
		System.out.println(map.get("Ȩ����")); //null
		
		// ��� �ϸ� ������Ʈ ���� ����������. map�� ��� set�Ǵ� listȭ ���Ѽ� �ȿ� ����ִ°��� �ϳ��ϳ� �������ڴ�.
		
		//1. values() : ��� value���� Collection�� ��� ��ȯ
		System.out.println(map.values());
		//[�ܸ�[2500��], �ſ��[1500��], §��[1500��], ����Ѹ�[1000��]]
		
		//2. KeySet() : ��� key�� set�� ��� ��ȯ
		Set<String> set1 = map.keySet();// keyset()�� �ִ� ��ȯ���� ������ ��Ʈ������ �����߱⶧���� ��Ʈ������ Ȯ�ΰ���.
		System.out.println(set1);//[������, �����, ��������Ĩ, ��ҹ�]
		
		Iterator<String> it = set1.iterator();
		while(it.hasNext()) {
			String key = it.next();
//			System.out.println(it.next());
			System.out.println("Ű : "+ key +", �� : "+ map.get(key));
		}//it ��� ���ͷ����Ϳ� �������� ������ Ű�� ��������, �� Ű�� �̿��ؼ� ���� �̿��ؼ� ������ �������Եȴ�.
		
		/*Ű : ������, �� : �ܸ�[2500��]
		Ű : �����, �� : �ſ��[1500��]
		Ű : ��������Ĩ, �� : §��[1500��]
		Ű : ��ҹ�, �� : ����Ѹ�[1000��]*/

		
		//3. entrySet() : ��� entry��ü(Ű+���ǽ�)�� set�� ��� ��ȯ // ��Ʈ���� �� ���� ���δ�.
		Set<Entry<String, Snack>> set2 =map.entrySet();//�ȿ� �� (��Ʈ��(Ű+��)) ���̱⶧���� ��Ʈ�� 		
		// ��ƿ�� ����Ʈ���ֱ�. ��Ʈ�� �ȿ� ���� �� Ű, �� ��� ����.
		Iterator<Entry<String, Snack>> it2 = set2.iterator();
		while(it.hasNext()){// �������� �ִٸ� �����Ͷ� ��� ��.
			Entry<String, Snack> entry = it2.next();
			System.out.println("Ű : "+ entry.getKey()+", �� : "+entry.getValue());
		}
		/*Ű : ������, �� : �ܸ�[2500��]
	         Ű : �����, �� : �ſ��[1500��]
		Ű : ��������Ĩ, �� : §��[1500��]
		Ű : ��ҹ�, �� : ����Ѹ�[1000��]*/
		
		Map<String, Snack> map2 = new TreeMap<String, Snack>();
		map2.putAll(map);
		System.out.println(map2);
		//��ҹ�=����Ѹ�[1000��], ������=�ܸ�[2500��], �����=�ſ��[1500��], ��������Ĩ=§��[1500��]}
		//�ڵ� ���ĵǾ� �ִ�. Ʈ���� ���۷����� �����Ǿ� �ձ⶧����. �츮�� ����� Ű�� ��Ʈ���̾��� , 
		//���� ���ı����� ������ �ʾƵ� ������ �Ǿ���.
		
		//Ű�� ���� �ƹ��ų� �־ ���������.
		//�׷��� properties�� Ű�� ���� String���θ� �����س��Ҵ�.
		//������Ƽ Ŭ������ ������Ƽ���� �������ִ�. �׷��� ������Ƽ�� ������ �о�ö� ����Ѵ�.
		//������Ƽ��� Ŭ������ �������ε� Ű�� ���� ��Ʈ���� ���� Ŭ��������. �� ����ص� �ȴ�.
	}
	public void doprperties() {
		Properties prop = new Properties();
		prop.setProperty("ä��", "����"); // put obj����ϸ� �ȵǰ� �����մ°� ����ؾ��Ѵ�.
		prop.setProperty("����", "���") ;
		prop.setProperty("����", "����") ;
		prop.setProperty("ä��", "�Ǹ�") ;
		System.out.println(prop);
	   //{����=���, ä��=�Ǹ�, ����=����}  /���� ��������, "ä��", "�Ǹ�"�� ���� ������
		
		System.out.println(prop.getProperty("ä��"));
		System.out.println(prop.getProperty("�߰�"));
		System.out.println(prop.getProperty("ä��", "����"));
		System.out.println(prop.getProperty("�߰�", "����"));
//		�Ǹ�   => ä�ҿ� ���� ���� �����Ͷ�
//      null
//		�Ǹ�
//		����  // �տ� �ִ� Ű�� ���� ������ �ڿ� �ִ� ������ ��������� ��. 
	}
	
	public void fileSave() { //**���蹮�� ���´ٰ�?
//		try(FileOutputStream fos = new FileOutputStream("test.properties");){
		try(FileOutputStream fos = new FileOutputStream("test.xml");){ // xml���������� ���� ���������.
			
			Properties prop = new Properties();
			prop.setProperty("title", "properties Practise");
			prop.setProperty("language", "kor");
			
			// store(OutputStream os, String comments)
			// store(Writer writer, String comments)
			// os(�Ǵ� writer)�� prop���� (����Ʈ �Ǵ� ���� ��������), comments�� �ּ����� ����
			prop.store(fos, "Properties Test File");
			
			// storeToXML(OutputStream os, String comment)
			// ����� ������ ����Ʈ ��Ʈ������ xml �������
			
			prop.storeToXML(fos, "storeToXML Test");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileOpen() {
//		try(FileInputStream fis = new FileInputStream("test.properties");){
		try(FileInputStream fis = new FileInputStream("test.xml");){ //������Ƽ�� �ƴ� xml�� �о������ �ٲ��ֱ�
			
			Properties prop = new Properties();
			
			//load(InputStream is) 
			// : ����Ʈ ��Ʈ������ ����� ������ ������ �о�ͼ� properties��ü�� ����/is�� �ִ� Properties �о��
			//load(Reader reader)
			// : ���ڽ�Ʈ������ ����� ������ ������ �о�ͼ� Properties��ü�� ����
//			prop.load(fis);
//			System.out.println(prop); 
			//{title=properties Practise, language=kor}
			
			
			//���� �о����
			//loadFromXML(InputStream is)
			// : ����Ʈ ��Ʈ������ ����� xml������ ������ �о�ͼ� properties��ü�� ����
			prop.loadFromXML(fis);
			System.out.println(prop); 
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

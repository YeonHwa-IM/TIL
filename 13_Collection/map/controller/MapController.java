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
		Map<String, Snack> map = new HashMap<String, Snack>(); // 제네릭을 해주지않으면 노란줄이 뜬다.
		
		//1. 객체요소 추가 map은 추가하는 메소드가 다른다. 컬렉션의 상속을 받지않기때문에
		//put(K key, V value : 키와 값 추가, 성공 시  value 반환
		
		map.put("새우깡", new Snack("짠맛", 1500));
		map.put("다이제", new Snack("단맛", 2500));
		map.put("포테이토칩", new Snack("짠맛", 1500));
		map.put("고소미", new Snack("고소한맛", 1000));
		System.out.println(map);
		
		//{다이제=단맛[2500원], 새우깡=짠맛[1500원], 포테이토칩=짠맛[1500원], 고소미=고소한맛[1000원]}
		//key= value형태로 나오며, 순서 유지 안되고, 값이 중복이어도 문제 발생없음을 확인.
		
		map.put("새우깡", new Snack("매운맛", 1500));
		System.out.println(map);
		//값 수정 후 출력해보면, 새우깡이 추가되지않고 매운맛으로 value가 덮어씌어지는것 확인.
		
		// 키 또는 값이 있는지 없는지 확인하는 메소드. 2개가 있다.
		// containsKey(Object key) : key가 있으면 true 반환
		// containsKey(Object value) : value가 있으면 true 반환
		System.out.println(map.containsKey("새우깡"));
		System.out.println(map.containsValue(new Snack("짠맛", 1500))); // 새로운 주소값이라서 비교할수가 없다. snack에서 오버라이딩 고고
		//true
		//false => 오버라이딩 후  true
		
		//get(Object key) : 키의 값 반환
		System.out.println(map.get("새우깡")); //매운맛[1500원]
		System.out.println(map.get("홈런볼")); //null
		
		// 어떻게 하면 엘리먼트 들을 가져오느냐. map의 경우 set또는 list화 시켜서 안에 들어있는값을 하나하나 가져오겠다.
		
		//1. values() : 모든 value들을 Collection에 담아 반환
		System.out.println(map.values());
		//[단맛[2500원], 매운맛[1500원], 짠맛[1500원], 고소한맛[1000원]]
		
		//2. KeySet() : 모든 key를 set에 담아 반환
		Set<String> set1 = map.keySet();// keyset()에 있는 반환값이 위에서 스트링으로 제한했기때문에 스트링으로 확인가능.
		System.out.println(set1);//[다이제, 새우깡, 포테이토칩, 고소미]
		
		Iterator<String> it = set1.iterator();
		while(it.hasNext()) {
			String key = it.next();
//			System.out.println(it.next());
			System.out.println("키 : "+ key +", 값 : "+ map.get(key));
		}//it 라는 이터레이터에 다음값이 있으면 키를 가져오고, 그 키를 이용해서 겟을 이용해서 값까지 가져오게된다.
		
		/*키 : 다이제, 값 : 단맛[2500원]
		키 : 새우깡, 값 : 매운맛[1500원]
		키 : 포테이토칩, 값 : 짠맛[1500원]
		키 : 고소미, 값 : 고소한맛[1000원]*/

		
		//3. entrySet() : 모든 entry객체(키+값의쌍)을 set에 담아 반환 // 엔트리가 더 많이 쓰인다.
		Set<Entry<String, Snack>> set2 =map.entrySet();//안에 셋 (엔트리(키+값)) 쌍이기때문에 엔트리 		
		// 유틸로 임포트해주기. 엔트리 안에 보면 겟 키, 겟 밸류 있음.
		Iterator<Entry<String, Snack>> it2 = set2.iterator();
		while(it.hasNext()){// 다음값이 있다면 가져와라 라는 뜻.
			Entry<String, Snack> entry = it2.next();
			System.out.println("키 : "+ entry.getKey()+", 값 : "+entry.getValue());
		}
		/*키 : 다이제, 값 : 단맛[2500원]
	         키 : 새우깡, 값 : 매운맛[1500원]
		키 : 포테이토칩, 값 : 짠맛[1500원]
		키 : 고소미, 값 : 고소한맛[1000원]*/
		
		Map<String, Snack> map2 = new TreeMap<String, Snack>();
		map2.putAll(map);
		System.out.println(map2);
		//고소미=고소한맛[1000원], 다이제=단맛[2500원], 새우깡=매운맛[1500원], 포테이토칩=짠맛[1500원]}
		//자동 정렬되어 있다. 트리에 컴퍼러블이 구현되어 잇기때문에. 우리가 사용한 키가 스트링이었고 , 
		//따로 정렬기준을 세우지 않아도 정렬이 되었다.
		
		//키와 값을 아무거나 넣어도 상관없었다.
		//그런데 properties는 키와 값을 String으로만 제한해놓았다.
		//프로퍼티 클래스는 프로퍼티즈라는 파일이있다. 그래서 프로퍼티즈 파일을 읽어올때 사용한다.
		//프로퍼티라는 클래스가 맵형식인데 키와 값에 스트링만 들어가는 클래스구나. 만 기억해도 된다.
	}
	public void doprperties() {
		Properties prop = new Properties();
		prop.setProperty("채소", "오이"); // put obj사용하면 안되고 옆에잇는거 사용해야한다.
		prop.setProperty("과일", "사과") ;
		prop.setProperty("간식", "젤리") ;
		prop.setProperty("채소", "피망") ;
		System.out.println(prop);
	   //{과일=사과, 채소=피망, 간식=젤리}  /순서 안지겨짐, "채소", "피망"는 덮어 씌워짐
		
		System.out.println(prop.getProperty("채소"));
		System.out.println(prop.getProperty("견과"));
		System.out.println(prop.getProperty("채소", "땅콩"));
		System.out.println(prop.getProperty("견과", "땅콩"));
//		피망   => 채소에 대한 값을 가져와라
//      null
//		피망
//		땅콩  // 앞에 있는 키에 값이 없으면 뒤에 있는 값으로 가져오라는 뜻. 
	}
	
	public void fileSave() { //**시험문제 나온다고?
//		try(FileOutputStream fos = new FileOutputStream("test.properties");){
		try(FileOutputStream fos = new FileOutputStream("test.xml");){ // xml저장형식을 따로 적어줘야함.
			
			Properties prop = new Properties();
			prop.setProperty("title", "properties Practise");
			prop.setProperty("language", "kor");
			
			// store(OutputStream os, String comments)
			// store(Writer writer, String comments)
			// os(또는 writer)에 prop저장 (바이트 또는 문자 형식으로), comments는 주석으로 저장
			prop.store(fos, "Properties Test File");
			
			// storeToXML(OutputStream os, String comment)
			// 저장된 정보를 바이트 스트림으로 xml 출력저장
			
			prop.storeToXML(fos, "storeToXML Test");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileOpen() {
//		try(FileInputStream fis = new FileInputStream("test.properties");){
		try(FileInputStream fis = new FileInputStream("test.xml");){ //프로퍼티가 아닌 xml을 읽어오려면 바꿔주기
			
			Properties prop = new Properties();
			
			//load(InputStream is) 
			// : 바이트 스트림으로 저장된 파일의 내용을 읽어와서 properties객체에 저장/is에 있는 Properties 읽어옴
			//load(Reader reader)
			// : 문자스트림으로 저장된 파일의 내용을 읽어와서 Properties객체에 저장
//			prop.load(fis);
//			System.out.println(prop); 
			//{title=properties Practise, language=kor}
			
			
			//파일 읽어오기
			//loadFromXML(InputStream is)
			// : 바이트 스트림으로 저장된 xml파일의 내용을 읽어와서 properties객체에 저장
			prop.loadFromXML(fis);
			System.out.println(prop); 
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

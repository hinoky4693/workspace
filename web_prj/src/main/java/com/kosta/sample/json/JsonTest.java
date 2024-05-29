package com.kosta.sample.json;

import java.util.HashMap; 
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonTest {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("empno", "7733");
		map.put("ename", "smith");
		map.put("sal", "600");
		System.out.println(map);
		//{ename=smith, empno=7733, sal=600}
			
		//{"ename":"smith", "empno":"7733", "sal":"600"}
		String jsonStr ="{\"ename\":\"smith\", \"empno\":\"7733\", \"sal\":\"600\"}";
		
		JSONObject obj = new JSONObject();
		// String
		JSONParser parser = new JSONParser();
		
		HashMap<String, String> map2 = new HashMap<String, String>();
		try {
			map2 = (HashMap<String, String>)parser.parse(jsonStr);
			System.out.println(map2);
			
			String a = map2.get("ename");
			String b = map2.get("empno");
			String c = map2.get("sal");
			System.out.println(a+ ","+ b+","+c);
			
		} catch (ParseException e) {
			System.err.println("str --> map convert 에러");
			e.printStackTrace();
		}
		
		
		
		
		try {
			obj = (JSONObject)parser.parse(jsonStr);
			String mapToStr = JSONObject.toJSONString(map2);
			System.out.println(mapToStr);
		
			mapToStr = obj.toString();
			System.out.println(mapToStr);
			
			mapToStr = obj.toJSONString();
			System.out.println(mapToStr);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}

}

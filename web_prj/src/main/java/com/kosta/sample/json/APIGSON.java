package com.kosta.sample.json;

import java.util.ArrayList;
import java.util.HashMap;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

public class APIGSON {

	public static void main(String[] args) {


		HashMap<String, String> map = new HashMap<String, String>();
		map.put("empno", "7733");
		map.put("ename", "smith");
		
		Gson gson = new Gson();
		System.out.println(map.get("ename"));
		System.out.println(map + "," + map.getClass());
		
		String mapString = gson.toJson(map);
		System.out.println(mapString + "," + mapString.getClass());
		
		HashMap res = gson.fromJson(mapString, HashMap.class);
		System.out.println(res+","+res.getClass());
		
		ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
		list.add(map);
		
		// --- 객체를 글자로 변경 ---
		ObjectMapper mapper = new ObjectMapper();
		try {
			String jsonString = mapper.writeValueAsString(list);
			System.out.println(jsonString + "," + jsonString.getClass());
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		// --- 객체를 글자로 변경 ---		
		String mapString2 = gson.toJson(list);
		System.out.println(mapString2 + "," + mapString2.getClass());
		
		ArrayList res2 = gson.fromJson(mapString2, ArrayList.class);
		System.out.println(res2+","+res2.getClass());
		
		
	}

}

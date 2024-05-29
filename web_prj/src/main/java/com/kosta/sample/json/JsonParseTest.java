package com.kosta.sample.json;

import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.HashMap;

public class JsonParseTest {

	public static void main(String[] args) {
		
		String jsonStr = "{\"elements\":[{\"profile_nickname\":\"사랑하는 아내♥️\",\"profile_thumbnail_image\":\"\",\"id\":\"149..xxx...378\",\"uuid\":\"Q3JAcU..xxxxxx.Up6T3sd\",\"favorite\":true}],\"total_count\":1,\"after_url\":null,\"result_id\":\"zbnYtN-...xxxxx...pdPgCA\",\"favorite_count\":1}";
		JSONParser parser = new JSONParser();
		HashMap map = new HashMap();
		JSONObject obj = new JSONObject();
		
		try {
			map = (HashMap<String, Object>)parser.parse(jsonStr);
			System.out.println("profile_nickname : " + ((HashMap)((ArrayList)map.get("elements")).get(0)).get("profile_nickname"));
			System.out.println("id : " + ((HashMap)((ArrayList)map.get("elements")).get(0)).get("id"));
			System.out.println("uuid : " + ((HashMap)((ArrayList)map.get("elements")).get(0)).get("uuid"));
			System.out.println("total_count : " + map.get("total_count"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		ObjectMapper mapper = new ObjectMapper();
		try {
			HashMap<String, Object> firstMap = mapper.readValue(jsonStr, HashMap.class);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
//		System.out.println("profile_nickname : " + );
		
		
	}

}

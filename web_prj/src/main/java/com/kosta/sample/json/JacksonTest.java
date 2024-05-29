package com.kosta.sample.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.kosta.sample.jdbc.EmpVO;

import java.util.HashMap;
// tutorial : https://github.com/FasterXML/jackson-docs

public class JacksonTest {

	public static void main(String[] args) {
		//EmpVO(1) : str --> EmpVO
		String jsonStr ="{\"ename\":\"smith\", \"empno\":\"7733\", \"sal\":\"600\"}";
		ObjectMapper mapper = new ObjectMapper();
		EmpVO vo = null;
		try {
			vo = mapper.readValue(jsonStr, EmpVO.class);
			System.out.println(vo.getEname());
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		//HashMap : str --> HashMap
		HashMap map = new HashMap();
		try {
			map = mapper.readValue(jsonStr, HashMap.class);
			
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		System.out.println(map);
		
		
		// HashMap --> str
		String ans = "";
		try {
			ans = mapper.writeValueAsString(map);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(ans);
		
		
		
		// -------------------------------------------------
		TypeFactory fact = mapper.getTypeFactory();
		JavaType javaType = fact.constructType(EmpVO.class);
		
		
		try {
			mapper.readValue(jsonStr, javaType);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

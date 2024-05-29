package com.kosta.sample.json;

import java.util.HashMap;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.kosta.sample.jdbc.EmpVO;

/**
 * ---------------------------------------------------------
 * JSON  <--> JAVA객체 변환 API
 *   - jackson-databind-2.1.x.jar (Apache2.0)
 *    
 *   - tutorial : https://github.com/FasterXML/jackson-docs
 *   - API doc  : https://javadoc.io/doc/com.fasterxml.jackson.core/jackson-databind/latest/index.html
 *              : https://javadoc.io/doc/com.fasterxml.jackson.core
 * ---------------------------------------------------------  
*/
public class APIJackson {
	
	public static void main(String[] args) {
		//EmpVO (1) : str --> EmpVO
		String jsonStr = "{\"ename\":\"smith\", \"empno\":\"7733\", \"sal\":\"600\"}";
		EmpVO vo = null;
		
		//HashMap : str --> HashMap
		ObjectMapper mapper = new ObjectMapper(); 
		try {
			vo = mapper.readValue(jsonStr, EmpVO.class);
			System.out.println(vo.getEname());
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

		
		// map --> str
		System.out.println(vo.toString());
		try {
			String jsonString = mapper.writeValueAsString(vo);
			System.out.println(jsonString);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		//---------------------------------------------------
		//jackson  Factory config ......... JavaType
		// readValue(jsonStr, 제네릭효과);
		//---------------------------------------------------
		mapper = new ObjectMapper(); 
		try {
			HashMap<String, Object> map = mapper.readValue(jsonStr, HashMap.class);
			//HashMap<String, Object> map = mapper.readValue(jsonStr, new TypeReference<HashMap<String, Object>>(){} );
			System.out.println(map.get("ename"));
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

		
		TypeFactory fact = mapper.getTypeFactory();
		//HashMap<String, Object> map = mapper.readValue(jsonStr, new TypeReference<HashMap<String, Object>>(){} );
		JavaType javaType = fact.constructType(EmpVO.class);
		try {
			EmpVO vo2 = mapper.readValue(jsonStr, javaType);
			System.out.println(vo2.getEname());
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
				
				
				
				
	}

}

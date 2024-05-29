package com.kosta.sample.json;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
public class Json테스트2 {

	public static void main(String[] args) {
		String str = "{\r\n"
				+ "  \"name\": \"KOSTA\",\r\n"
				+ "  \"id\": \"u0001\",\r\n"
				+ "  \"displayName\": {\r\n"
				+ "  	\"desc\": \"this is kosta\",\r\n"
				+ "  	\"code\": \"g01\"\r\n"
				+ "  },\r\n"
				+ "  \"types\": [\"type1\",\"type2\"],\r\n"
				+ "  \"primaryType\": \"ptype\"\r\n"
				+ "}"; 
		
		ObjectMapper mapper = new ObjectMapper();
//		try {
//			
//			VO map = mapper.readValue(str,VO.class);
//			System.out.println(map.name);
//			
//		} catch (JsonMappingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (JsonProcessingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		try {
			HashMap<String, Object> map2 = mapper.readValue(str, HashMap.class);
			String name = (String)map2.get("name");
			String id = (String)map2.get("id");
			HashMap<String, String> displayName = (HashMap<String,String>)map2.get("displayName");
			ArrayList<String> types = (ArrayList<String>)map2.get("types");
			String primaryType = (String)map2.get("primaryType");
			
			System.out.println("id : " + id + " displayName : " + displayName.get("code") + " types : " + types);
			
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		
//		try {
//			GmapVO vo = mapper.readValue(str, GmapVO.class);
//			String id = vo.getId();
//			List<String> types = vo.getTypes();
//			DisplayNameVO subVO = vo.getDisplayName();
//			String code = subVO.getCode();
//			System.out.println(id + "," + code + "," + types);
//			
//			
//		} catch (JsonMappingException e) {
//			e.printStackTrace();
//		} catch (JsonProcessingException e) {
//			e.printStackTrace();
//		}
		
	}
	
	
//		{
//		  "name": "KOSTA",
//		  "id": "u0001",
//		  "displayName": {
//		  	"desc": "this is kosta",
//		  	"code": "g01"
//		  },
//		  "types": ["type1","type2"],
//		  "primaryType": "ptype"
//		}
	
	
	class GmapVO{
		private String name;
		private String id;
		private DisplayNameVO displayName;
		private List<String> types;
		private String primaryType;
		public GmapVO() {}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public DisplayNameVO getDisplayName() {
			return displayName;
		}
		public void setDisplayName(DisplayNameVO displayName) {
			this.displayName = displayName;
		}
		public List<String> getTypes() {
			return types;
		}
		public void setTypes(List<String> types) {
			this.types = types;
		}
		public String getPrimaryType() {
			return primaryType;
		}
		public void setPrimaryType(String primaryType) {
			this.primaryType = primaryType;
		}
		
	}
	
	
	class DisplayNameVO{
		
		private String desc;
		private String code;
		public DisplayNameVO() {}
		public String getDesc() {
			return desc;
		}
		public void setDesc(String desc) {
			this.desc = desc;
		}
		public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}
	}
	
	
	

}

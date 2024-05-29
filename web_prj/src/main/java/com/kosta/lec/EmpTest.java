package com.kosta.lec;
import java.util.ArrayList;
import java.util.HashMap;

public class EmpTest{
	public static void main(String[] args){
		ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
		HashMap<String, String> emp = new HashMap<String, String>();
		emp.put("empno","7733");
		emp.put("ename","smith");
		emp.put("sal","600");
		list.add(emp);
		
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}

		
		
		
		
		
		
	}

}




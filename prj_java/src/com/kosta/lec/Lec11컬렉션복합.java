package com.kosta.lec;
import java.util.ArrayList;
import java.util.HashMap;


public class Lec11컬렉션복합 {

	public static void main(String[] args) {
//	---------------------------------------
//	ArrayList(HashMap)
//	---------------------------------------
//		{seq = "1", title = "제목 1", rdate = "2024-01-01", regid = "kim"}
//		{seq = "2", title = "제목 2", rdate = "2024-02-02", regid = "kim2"}
		
		ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
		
		for(int i=0;i<2;i++) {
			HashMap<String, String> hm = new HashMap<String, String>();
			hm.put("seq", ""+i);
			hm.put("title", "제목 "+i);
			hm.put("rdate", "2024-02-02");
			hm.put("regid", "kim"+i);
			list.add(hm);
		}
		
		for(int i=0;i<list.size();i++) {
			String title = list.get(i).get("title");
			System.out.println(title);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		{"1", "제목 1", "2024-01-01", "kim"}
//		{"2", "제목 2", "2024-02-02", "kim2"}
//		ArrayList(arrayList)
		
//		ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
//
//		for(int i=0; i<4; i++) {
//			ArrayList<String> arr = new ArrayList<String>();
//			arr.add(""+i);
//			arr.add("제목 "+i);
//			arr.add("2024-02-02");
//			arr.add("kim"+i);
//			list.add(arr);
//		}
//		
//		for(int i=0;i<list.size();i++) {
//			System.out.print(list.get(i).get(1)+" ");
//		}
//		System.out.println();
//		System.out.println(list);
		
		
		
		
		
		
		
		
//		ArrayList(String[])
		
//		String[] arr = {"1", "제목 1", "2024-01-01", "kim"};
//		ArrayList list = new ArrayList();
//		list.add(arr);
//		System.out.println(list);
//		String[] res = (String[])list.get(0);
//		System.out.println(res[1]);
		
//		String[] arr = {"1", "제목 1", "2024-01-01", "kim"};
//		ArrayList<String[]> list = new ArrayList<String[]>();
//		list.add(arr);
//		System.out.println(list.get(0)[1]);
//		String[] res = list.get(0);
//		System.out.println(res[1]);
	
	
	}

}

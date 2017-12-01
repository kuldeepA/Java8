package basic.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList();
		list.add("Horse");
		list.add("Lion");
		list.add("Tiger");
		CustomeItrable obj = new CustomeItrable(list);
		for (String itObj : obj) {
			//System.out.println(itObj);
		}
	
		List<String> listl = new ArrayList<String>();
		listl.add(null);
		listl.add(null);
		//System.out.println(listl.size());
		
		/*Set<String> set = new TreeSet<String>();
		set.add(null);
		set.add(null);
		set.add(null);*/
	
		//System.out.println("Set Size"+set.size());
		
		
		
		Map<String, String> tMap = new TreeMap<String, String>();
		tMap.put("1k", "1v");
		tMap.put("2k", "2v");
		tMap.put("3k", "3v");
		//tMap.put("3k", "4v"); //in case of same key df values it will override with latest value
		
		Set<String> tSet = new TreeSet<String>();
		//tSet.add(null);
		tSet.add("1");
		tSet.add("1");
		tSet.add("2");
		tSet.add("3");
		tSet.add("4");
		
		//Iterator it =  tMap.entrySet().iterator();
		/*
		while(it.hasNext()) {
			
			Map.Entry<String, String> entry = (Entry<String, String>) it.next();
			
			System.out.println(it.next());
		}*/
		
		
		//converting map into list
		
		Set<Entry<String,String>> mSet = tMap.entrySet();
		List<Entry<String,String>> mList = new ArrayList<Entry<String,String>>(mSet);
		System.out.println(mSet);
 	}

}

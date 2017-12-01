package basic.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomeItrable implements Iterable<String>{

	private List<String> list = new ArrayList<String>();
	
	public CustomeItrable(List<String> list) {
		
		this.list = list;
	}
	public List<String> getList() {
		
		return list;
	}
	@Override
	public Iterator<String> iterator() {
		
		return new NewIterator(this);
	}
}

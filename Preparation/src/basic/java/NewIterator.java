package basic.java;

import java.util.ArrayList;
import java.util.Iterator;

public class NewIterator<String> implements Iterator<Object> {

	private ArrayList<?> list;
	private int index;
	
	public NewIterator(CustomeItrable ci) {
		this.list = (ArrayList<?>) ci.getList();
	}
	
	@Override
	public boolean hasNext() {
		
		if (index < list.size())
			return true;
		else
			return false;
	}

	@Override
	public Object next() {
		
		Object obj = list.get(index);
		index++;
		return obj;
	}

}

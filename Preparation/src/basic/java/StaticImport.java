package basic.java;

import static java.lang.System.*;

import java.util.ArrayList;
import java.util.List;

public class StaticImport {

	public static void main(String[] args) {
		
		out.println("Red Color Class - " );
		out.println("Green Color Class - ");
		
		//belwo code is for this key word.
		
		new StaticImport().ret();
	}
	
	public StaticImport ret() {
		StaticImport obj = new StaticImport();
		obj.get(this);
		return this; //return current object only.		
	}
	private void get(StaticImport staticImport) {
		
		System.out.println(staticImport);
		List list = new ArrayList() {{
				add("String1");
				add("String2");
				add("String3");
		}};
	}
}

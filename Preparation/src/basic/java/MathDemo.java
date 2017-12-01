package basic.java;

import java.util.HashMap;

class Movie {
	
	private String name, actor;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}
	
	public boolean equals(Object o) {
		
		Movie m = (Movie)o;
		return m.actor.equals(this.actor) && m.name.equals(this.name);
	}
	
	public int hashCode() {
		return actor.hashCode() + name.hashCode();
	}
}

public class MathDemo {

	public static void main(String[] args) {
		
		HashMap<String,String> ma = new HashMap<>();
		ma.put("u1","u2");
		ma.put("u3","u3");
		ma.put("u1","u4");
		System.out.println(ma.size()); //in case of immutable key hashcode and equals not neccessory
		System.out.println(ma.get(new String("u1")));
		
		Movie m1 = new Movie();
		m1.setActor("a1");
		m1.setName("m1");
		
		Movie m2 = new Movie();
		m2.setActor("a2");
		m2.setName("m2");
		
		Movie m3 = new Movie();
		m3.setActor("a3");
		m3.setName("m3");
		
		Movie m4 = new Movie();
		m4.setActor("a4");
		m4.setName("m4");
		
		HashMap<Movie, String> map = new HashMap<>();
		map.put(m1, "Thanks1");
		map.put(m2, "Thanks2");
		map.put(m3, "Thanks3");
		map.put(m4, "Thanks4");
		
		Movie m5 =  new Movie();
		m5.setActor("a4");
		m5.setName("m4");
		map.put(m5, "Thanks5");
		

		Movie m6 =  new Movie();
		m6.setActor("a4");
		m6.setName("m6");   //value is df so it become non-duplicate not like m5  -- equals() should be for this
		map.put(m6,"Thanks6");
		
		for (Movie m : map.keySet())
			System.out.println(m.getActor() +" : "+m.getName());
		
		

		map.put(m5, "Thanks5");
		System.out.println(map.get(m5)+map.size());   //if we comment hashCode and equals method it will return null and size would be 5 it will add duplicate a4&m4
	}
}

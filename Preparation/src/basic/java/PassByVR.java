package basic.java;

public class PassByVR {

	public static void main(String[] args) {
		
		Color red =  new Color("Red");                           //lets assumed it store in 10
		Color green =  new Color("Green");						 //lets assumed it store in 11 
		//PassByVR obj = new PassByVR();
		swap(red, green);
		System.out.println("Red Color Class - " + red.getColor());
		System.out.println("Green Color Class - " + green.getColor());
		
		changeColor(green);
		
		System.out.println("Green Color Class - " + green.getColor());
	}

	private static void changeColor(Color green) {
		
		green.setColor("Yellow");								 //modifying value at 10
		green = new Color("Blue");								 //creating new at 12
		green.setColor("Black");								 //modifying value at 12
	}

	private static void swap(Object red, Object green) {
		
		Object tmp = red;
		red = green;
		green = tmp;
	}
}

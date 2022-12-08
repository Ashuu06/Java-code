package testclasses;

import java.util.ArrayList;

public class Students {
	public String student(int index) {
		ArrayList<String> students  = new ArrayList<String>();
		students.add("Ashutosh");
		students.add("Vikas");
		students.add("Aman");
		students.add("Piyush");
		students.add("Gyanendra");
		return students.get(index);
	}

}

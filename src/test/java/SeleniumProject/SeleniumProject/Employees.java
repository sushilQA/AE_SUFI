package SeleniumProject.SeleniumProject;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Employees {

	String firstName;
	String lastName;
	int age;

	public Employees()
	{
		
	}
	public Employees(String fName, String lName, int age) {
		this.firstName = fName;
		this.lastName = lName;
		this.age = age;
	}

	public float averageWithList() {
		Employees em1 = new Employees("SUSHIL", "KUMAR", 32);
		Employees em2 = new Employees("Lokesh", "KUMAR", 30);
		Employees em3 = new Employees("Jagdeep", "KUMAR", 28);
		Employees em4 = new Employees("Vimal", "KUMAR", 25);
		List<Integer> em = new ArrayList<Integer>();
		em.add(em1.age);
		em.add(em2.age);
		em.add(em3.age);
		em.add(em4.age);
		float sum = 0;
		for (Integer i : em) {
			sum = sum + i;
		}
		float avg = sum / em.size();
		return avg;

	}

}

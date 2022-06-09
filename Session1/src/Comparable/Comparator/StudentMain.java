package Comparable.Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class StudentMain {

	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<Student>();
		
		al.add(new Student (10,"Vijay",102));
		al.add(new Student (17,"Ajay",98));
		al.add(new Student (9,"Sanjay",175));
		al.add(new Student (8,"Durjay",114));
		al.add(new Student (13,"Hirday",18));
		al.add(new Student (19,"sarday",103));

		Collections.sort(al);
		
		for(Student s : al) {
			System.out.println(s.rollno+" "+s.name+" "+s.age);  
		}
		
		
	}
	

}

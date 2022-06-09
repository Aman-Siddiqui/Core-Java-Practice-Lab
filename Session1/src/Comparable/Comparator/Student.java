package Comparable.Comparator;

public class Student implements Comparable<Student> {

	int age;
	String name;
	int rollno;
	
	Student(int age, String name, int rollno){
		this.age=age;
		this.name=name;
		this.rollno=rollno;
	}
	
	@Override      
	public int compareTo(Student st) {
	//specified   current
		if (age == st.age) {
			return 0;
		}else if( age > st.age) {
			return 1;   
		}else {
			return -1;
		}
		
		

	}
}

//    -1    age   |   +1   st.age   |  0     same position
//    st.age      |   age           |







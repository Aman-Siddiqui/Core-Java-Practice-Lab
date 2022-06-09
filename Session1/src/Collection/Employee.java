package Collection;

public class Employee implements Comparable<Employee>
 {

	int id;  // =1
    String name;// pathak
    
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Employee e) {
		
        int diff =  this.id - e.id;  	// Two instance of class can be compared
        
      //true ->0    = //1- 2 
 
        return diff;                    // Note: Two equal employee Id will return 0
		}

}

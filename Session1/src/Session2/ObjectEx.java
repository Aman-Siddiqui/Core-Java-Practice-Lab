package Session2;

public class ObjectEx {
          
            public String display(int ID, String name){  //ID=20 String=Aman
           String data = ID+" belongs to "+name;
//            	System.out.println(ID+" Belongs to "+name);
            	return name;
            
            }

	public static void main(String[] args) {
	              
		ObjectEx obj1 = new ObjectEx();
	      String a =  obj1.display(20, "40@#");
	      System.out.println(a);
	      
	      ObjectEx obj2 = new ObjectEx();
	      String b =  obj1.display(30, "abc@#");
	      System.out.println(b);
	      
	      
	}
	

}

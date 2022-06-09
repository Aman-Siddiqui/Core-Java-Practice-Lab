package Session2;

public class Tostring {

	  int a;
      String b;
      double c;
     
      
      Tostring(){
      	a=10; b= "Learn Coding"; c=20.0;

      }
      
      @Override
		public String toString() {     // tostring ke through direct object ki values print kar sakte hai
			return "A [a=" + a + ", b=" + b + ", c=" + c + "]";
		}
}

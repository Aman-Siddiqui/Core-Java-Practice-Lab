package Session2;



public class PassByRef{

	public void calcArea(Circle crcl, double rad) {
		double area = crcl.getPi()*rad*rad;
		System.out.println("Area of the circle is: " +area);
	}

	public static void main(String[] args) {
		PassByRef p1= new PassByRef();
		p1.calcArea(new Circle(), 2);
		
		
		int[] arr;
		int []arr1;
		int arr2[]= {1, 2, 3, 4, 5};
		
		
	}
}
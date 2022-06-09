package Session2;

class Method1 {

	int x; int y;
	
	Method1(int a, int b){
		this.x=a; this.y=b;
		
	}

	public void show(int c, int d) {
		
		x=c; y=d;
		
	}


	public static void main(String[] args) {

		Method1 mt  = new Method1(20,40);
//		mt.show(50, 90);
		
		System.out.println(mt.x+" "+mt.y);
		
	
	




	}





}

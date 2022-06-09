package Package3;

public class GetterSetter {
	
	private int a;
	private String name;
	private float f;
	private boolean g;
	
	
	
	public float getF() {
		return f;
	}

	public boolean isG() {
		return g;
	}

	public int getA() {
		return a;
	}
	
	public String getA1() {
		return name;
	}
	
	public void setA(int a, String name, float f, boolean g) {
		this.a=a;
		this.name=name;
		this.f=f;
		this.g=g;
	}
	
	
//
//	public static void main(String[] args) {
//		GetterSetter gs =  new GetterSetter();
//		gs.setA(10);
//		int b= gs.a;
//		System.out.println(b);
//	}
}

package Copied;

public class ReverseString {

	public static void main(String[] args) {
		String name = "Darakhshan";
		String empty= "";
		char c []= name.toCharArray();
		for (int i=name.length(); i>=0; i--) {
			empty+= c[i];
		}
		System.out.println(empty);

		if(name.toLowerCase().equals(empty.toLowerCase())) {
			System.out.println("palindrom");
		}else {
			System.out.println("Not palindrom");
		}

		//	1. Reverse loop syntax	
		//for(int i=name.length(); i>0; i--){}
		//
		//for(int i=name.length()-1; i>=0; i--){}

		//2.forward loop syntax
		//for(int i=0; i<name.length(); i++){}
		//
		//for(int i=0; i<=name.length()-1; i++){}

	}

}

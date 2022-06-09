package Session2;

public class ArrayPrac {

	public static void main(String[] args) {
		int arr[] = {5, 6, 9, 22, 8};
		
		int temp;
		for(int i=1; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					temp = arr[j];
					arr[j]= arr[i];
					arr[i]= temp;
					
				}
			}
		}
		
		for (int k=0; k<arr.length; k++) {
			System.out.println(arr[k]);
		}

	}

}

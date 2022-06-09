package Session2;

import java.util.Arrays;

public class ArraySortNested {

	public static void main(String[] args) {
		int arr[]= {22, 5, 8, 9, 6};
		      // j=   0  1  2  3  4
		      // i=      1  2  3  4   
		int temp;
		for(int i=0; i<arr.length; i++) {
			for (int j=0; j<arr.length; j++) {
				if(arr[i]<arr[j]){    // arr[5]<arr[22]
					 temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
					
					//int arr[]= {5, 8, 22, 9, 6};
					      // j=   0  1  2   3  4
				          // i=      1  2   3  4 
				}
			}
				
		}
		for(int k=0; k<arr.length; k++) {
			System.out.println(arr[k]);
		}
		
//		Arrays.sort(arr);

	}

}

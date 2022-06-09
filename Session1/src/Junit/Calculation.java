package Junit;

public class Calculation {

	public  int findmax (int arr[]) {
		int max = arr[0];    //int max = 1, 3
		for (int i=0; i<arr.length; i++) {

			if (max < arr[i]) {  
				 max = arr[i];    //max = 3,4;
			}	
		}
		return max;
	}
}


//{ 1 , 3 , 4 , 2 }                                                 
//  0   1   2   3                                                                      
//if (max < arr[i]) -  0 < 1                                                                                                                                                                                  

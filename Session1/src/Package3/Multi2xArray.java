package Package3;

public class Multi2xArray {

	public static void main(String[] args) {
		
		int r1 = 2 , c1 = 3;    
		int r2 = 3 , c2 = 2;
		
		int[][]firstMatrix = {{3,-2,5},
				              {3, 0,4}};
		
		int[][]secondMatrix = {{2, 3}, 
				              {-9, 0},
				               {0, 4}};
		
//             k  k  k          k   k 		
	// i	// 3,-2, 5      j   2,  3
    // i    // 3, 0, 4      j  -9,  0
	// i 	//              j   0,  4
		
		
//         k=0  k=1  k=2           j=0   j=1		
// i=0	    3,   -2,  5       k=0   2,    3
// i=1      3,    0,  4       k=1  -9,    0
// i=2 	//                    k=2   0,    4

			
		int[][] product = new int [r1][c2];        //   a  b
		                                           //   c  d
		
		for (int i=0; i<r1; i++) {
			for(int j=0; j<c2; j++) {
				for(int k=0; k<c1; k++) {
					
					product[i][j] = product[i][j]+ firstMatrix[i][k]*secondMatrix[k][j];
					
				}
			}
		}
		
		System.out.println("Multiplication of two matrics is:");
		 
		for (int row[] : product) {
			for(int c : row) {
				System.out.print(c +" ");
			}
			System.out.println();
		}
	}

}


//prod [i][j]=0+3*2=6
//prod [0][0]=6+-2*-9
//prod [0][0]=24+5*0
//prod [0][0]=24+0=24


//prod [0][1]=0+3*3=9
//prod [0][1]=9+-2*0
//prod [0][1]=9+0=9
//prod [0][1]=9+5*4
//prod [0][1]=29

//prod [0][2]=na

//prod [1][0]=0+3*2=6
//prod [1][0]=6+0=6
//prod [1][0]=6+4*0
//prod [1][0]=6

//prod [1][1]=0+3*3=9
//prod [1][1]=9+0=9
//prod [1][1]=9+4*4=25 =2 2<2

//j=2 j<2
//i=2 i<2


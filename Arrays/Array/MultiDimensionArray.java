package Array;

public class MultiDimensionArray {
	public static void main(String[] args) {
		
//	int arr[][] = new int[3][3];
//	arr[0][0] = 1;	
//	arr[0][1] = 2;
//	arr[0][2] = 3;
//	arr[1][0] = 4;
//	arr[1][1] = 5;
//	arr[1][2] = 6;
//	arr[2][0] = 7;
//	arr[2][1] = 8;
//	arr[2][2] = 9;
//	
//	for(int i=0;i<arr.length;i++) {
//		for(int j=0;j<arr.length;j++) {
//			System.out.print(arr[i][j]);
//		}
//		System.out.println(" " );
//	}
//}
		
	int arr[][] = new int[3][];
	arr[0] =new int[3];
	arr[1] =new int[4];
	arr[2] = new int[5];
	
//	int count = 0;
//	for(int i= 0; i<arr.length;i++)
//		for(int j=0;j<arr[i].length;j++)
//			arr[i][j] = count++;
//	arr[0][0] = 1;
//	arr[0][1] = 2;   
//	arr[0][2] = 3;
//	
//	arr[1][0] = 4;
//	arr[1][1] = 5;
//	arr[1][2] = 6;
//	arr[1][3] = 7;
//	
//	arr[2][0] = 8;
//	arr[2][1] = 9;
//	arr[2][2] = 10;
//	arr[2][3] = 11;
//	arr[2][4] = 12;
//	
//	 for (int i=0; i<arr.length; i++){  
//         for (int j=0; j<arr[i].length; j++){  
//             System.out.print(arr[i][j]+" ");  
//         }  
//         System.out.println();
//     }  
//	
//	}
	
	int a[][] = {{1,2,3},{2,3,4}};
	int b[][] = {{2,3,4},{5,6,4}};
	
	int c[][] = new int[2][3];
	
	for(int i=0;i<2;i++) {
		for(int j=0;j<3;j++) {
			c[i][j] = a[i][j] + b[i][j];
			System.out.print(c[i][j]+" ");  
		}
		
		System.out.println();
	}
	
 }
	
	
}

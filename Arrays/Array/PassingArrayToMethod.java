package Array;

public class PassingArrayToMethod {
	
	public static void main(String[] args) {
		
		int num[] = {2,4,1,2,3};
		int min = min(num);
		
		System.out.print("The minimum value in the array: " + min); 
		}
	
	public static int min(int a[]) {
	
		int min  = a[0];
		
		for(int x=0;x<a.length;x++) {
			if(a[x]<min) {
				return min=a[x];	
			}
		}
		
		return min;
		
	}
	

}

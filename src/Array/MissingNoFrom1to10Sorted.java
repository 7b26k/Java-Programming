package Array;

public class MissingNoFrom1to10Sorted {
	public static void main(String[] args) {
		int a[]= {2,3,4,5,6,7,8,10};
		
		for (int i = 0; i < a.length-1; i++) {
			if(a[i+1]-a[i]!=1)
				System.out.println("missing number is "+(a[i+1]+a[i])/2);
				
		}
		
		
	}

}

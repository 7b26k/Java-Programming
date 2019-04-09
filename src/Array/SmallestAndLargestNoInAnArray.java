package Array;

public class SmallestAndLargestNoInAnArray {
	public static void main(String[] args) {
		int a[]= {2,3,4,5,1,10,3,4};
		int smallestNo=0;
		int largestNo=0;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-1; j++) {
				if(a[i]>a[j])
					largestNo=a[j];
				if(a[i]<a[j])
					smallestNo=a[j];
					
			}
		}
		System.out.println("Smallest no is "+smallestNo+" Largest no is "+largestNo);
		
	}

}

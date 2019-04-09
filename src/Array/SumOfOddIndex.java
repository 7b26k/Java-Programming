package Array;

public class SumOfOddIndex {
	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int oddSum=0;
		for (int i = 0; i < a.length; i++) {
			if(i%2!=0)
				oddSum=oddSum+a[i];
		}
		
		System.out.println(oddSum);
	}

}

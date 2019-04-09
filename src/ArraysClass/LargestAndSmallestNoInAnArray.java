package ArraysClass;

public class LargestAndSmallestNoInAnArray {
	
	public static void main(String[] args) {
		int a[]= {54,78,12,96,81,99,20};
//		int highestNumber=Integer.MAX_VALUE;
//		System.out.println(highestNumber);
//		int smallestNumber=Integer.MIN_VALUE;
//		System.out.println(smallestNumber);
//		
//		for(int n:a) {
//			if(highestNumber<n)
//				highestNumber=n;
//			else
//				if(smallestNumber>n)
//					smallestNumber=n;
//		}
		
		
		int largest = Integer.MIN_VALUE;
		 
		int smallest = Integer.MAX_VALUE;
		 
		for (int number : a) {
		 
		if (number > largest) {
		 System.out.println("number is "+number+" largest is "+largest);
		largest = number;
		 
		}
		 
		else if (number < smallest) {
		 
		smallest = number;
		 
		} }
		System.out.println("Largest is : " + largest);
		 
		System.out.println("Smallest is : " + smallest);
		
		
	}

}

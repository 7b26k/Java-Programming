package ArraysClass;

import java.util.Arrays;

public class CopyingArray {
	public static void main(String[] args) {
		int arr1[]= {1,2,3};
		int arr2[]=new int[arr1.length];
		
		
System.out.println("**********1st technique using for loop*********");		
		for (int i = 0; i < arr2.length; i++) {
			arr2[i]=arr1[i];
		}
		
		System.out.println(Arrays.toString(arr2));
		System.out.println("**********2nd technique using for Arrays.CopyOf*********");
		int []arr3=Arrays.copyOf(arr2, arr1.length);
		
		System.out.println(Arrays.toString(arr3));
		System.out.println("**********3rd technique using for System.arrayCopy*********");
		
	}
	
}

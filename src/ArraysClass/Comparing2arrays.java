package ArraysClass;

import java.util.Arrays;

public class Comparing2arrays {
	public static void main(String[] args) {
		int arr1[]= {1,2,3};
		int arr2[]= {1,2,3};
		int arr3[]= {1,2,4};
		
		System.out.println(Arrays.equals(arr1, arr2));
		System.out.println(Arrays.equals(arr1, arr3));
	}

}

package ArraysClass;

public class IntersectionOfArray {

/*	public static void getIntersection(int arr01[], int arr02[], int m, int n) {

		int i = 0, j = 0;

		while (i < m && j < n) {

			if (arr01[i] < arr02[j])

				i++;

			else if (arr02[j] < arr01[i])

				j++;

			else {

				System.out.print(arr02[j++] + " ");

				i++;

			}
		}

	}*/

	public static void main(String args[]) {

		int arr01[] = { 1, 2, 4, 5, 6 };

		int arr02[] = { 2, 3, 5, 7 };

		int m = arr01.length;

		int n = arr02.length;

//		getIntersection(arr01, arr02, m, n);
		
		
		for(int i=0;i<arr01.length;i++) {
			for (int j = 0; j < arr02.length; j++) {
				if(arr01[i]==arr02[j])
					System.out.println(arr01[i]);
				
			}
		}

	}
}

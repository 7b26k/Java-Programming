package Array;

public class FindThatArray {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,1,2};
		int k=2;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==k)
				System.out.println(k+" is present in "+i+"th location");
		}

	}
}

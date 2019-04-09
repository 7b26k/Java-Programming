package Array;

public class DuplicateNumbers {
	public static void main(String[] args) {
		int a[]= {1,2,2,3,4,1,3,5,5};
		String s="";
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("i value is "+i);
			int count=0;
			for (int j = 0; j < a.length; j++) {
				System.out.println("J value is "+j);
				if(a[i]==a[j]&&j>i)
					count++;
			}
			if(count>0)
				System.out.println("Duplicates are "+a[i]);
		}
	}

}

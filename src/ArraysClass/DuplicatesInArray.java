package ArraysClass;

public class DuplicatesInArray {
	public static void main(String[] args) {
		String a[]= {"belal","kamal","pasha","Altamash","kamal","pasha","kamal"};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i].equals(a[j])&&i!=j)
					System.out.println("Duplicates "+a[j]);
			}
		}
	}

}

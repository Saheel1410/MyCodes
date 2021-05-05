package assihnments_java;

public class FibonnaciSeries {

	public static void main(String[] args) {
		int first = 0;
		int second = 1;
		
		for (int i = 1 ; i < 9 ; i++) {
			System.out.print(first + " ");
			int sum = first + second;
			 first = second;
			 second = sum;
			 
			
		}
		

	}

}

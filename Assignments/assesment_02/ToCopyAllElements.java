package assesment_02;

public class ToCopyAllElements {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40 };
		

		int[] arr2 = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i] ;
			System.out.println(arr2[i]);
		}
		
	}
	
}
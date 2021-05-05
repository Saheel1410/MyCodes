package assesment_02;

public class EvenPosition {

	public static void main(String[] args) {
		int [] values = {1,2,3,4,5,6,7,8,9,0};
		for (int i = 1; i < values.length; i= i+2) {
			System.out.println(values[i]);
		}
	}

}

package assesment_01;

public class GreaterNumber {

	public static void main(String[] args) {

		int a = 100;
		int b = 20;
		int c = 300;
		if(a>b&&a>c) {
			System.out.println(a);
		}
		else if  (b>c&&b>a) {
			System.out.println(b);
		}
		else {
			System.out.println(c);
		}
	}

}

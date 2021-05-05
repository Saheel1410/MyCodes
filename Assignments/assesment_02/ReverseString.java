package assesment_02;

public class ReverseString {

	public static void main(String[] args) {
		String str = "March interns";
	 char[] newStr = str.toCharArray();
	 for (int i = newStr.length-1; i >=0; i--) {
		System.out.print(newStr[i]);
	}
	}

}

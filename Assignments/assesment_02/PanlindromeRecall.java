package assesment_02;

public class PanlindromeRecall {

	public static void main(String[] args) {
	 String str = "mom";
	 String rev = "";
	 char[] array = str.toCharArray(); 
	 for (int i = array.length-1 ; i >=0 ; i--) {
		 rev= rev+array[i];	
	}
if (rev.equals(str)) {
	System.out.println("its palindrome");
	
}
else {
	System.out.println("not a palindrome");
}
	}

}

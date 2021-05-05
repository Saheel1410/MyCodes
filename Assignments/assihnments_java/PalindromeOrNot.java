package assihnments_java;

public class PalindromeOrNot {

	public static void main(String[] args) {
		String pal = "hannah";
		String rev = "";
		char[] charArray = pal.toCharArray();
		for (int i = charArray.length-1; i >=0; i--) {
			rev = rev + charArray[i]+"";
			
			}
		System.out.println(rev);
		
		if (rev.equals(pal)) {
			System.out.println("The given String is a Palindrome");
			
		}else {
			System.out.println("The given String is not a Palindrome");
		}

	}

}

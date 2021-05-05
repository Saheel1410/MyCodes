package assihnments_java;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.Arrays;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String name = "saheelkhan";
		char[] charArray = name.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (i%2 ==  0) {
			//	charArray[i] = (char)((int)(charArray[i])-32);
			
				System.out.print(Character.toUpperCase(charArray[i]));
			}
			else {
				System.out.print(charArray[i]);
			}
			
		
		

	}

	}
}

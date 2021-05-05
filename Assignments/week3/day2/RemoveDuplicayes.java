package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicayes {

	public static void main(String[] args) {
		String input = "PayPal India";
		
		char[] charArray = input.toCharArray();
		
		Set<Character> charOfString = new LinkedHashSet<Character>();
		for (int i = 0; i < charArray.length; i++) {
			charOfString.add(charArray[i]);
		}
        System.out.println(charOfString);
        for (Character character : charOfString) {
			if (character!=' ') {
				System.out.print(character);
			}
		}
	}

}

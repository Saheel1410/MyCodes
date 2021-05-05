package assihnments_java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateWords {

	/*
	 * public static void main(String[] args) { String str =
	 * "We learn basics as part of java sessions in java week1"; // Any words that
	 * are duplicated, need to be removed else print the unique ones
	 * 
	 * String[] split = str.split("\\s+"); Arrays.sort(split); // o(nlogn) for (int
	 * i = 0; i < split.length; i++) { if(i<split.length-1 &&
	 * !split[i].equals(split[i+1])) { System.out.println(split[i] + " "); } if(i ==
	 * split.length-1 && !split[i-1].equals(split[i])) { System.out.println(split[i]
	 * + " "); } }
	 * 
	 * }
	 */
	
	public static void main(String[] args) {
		String str = "We learn basics as part of java sessions in java week1";

		Set<String> uniqueWords = new HashSet<String>();
		String[] split = str.split("\\s+");
		for (String eachWord : split) 
			if(uniqueWords.add(eachWord)) System.out.println(eachWord);
		

	}

}

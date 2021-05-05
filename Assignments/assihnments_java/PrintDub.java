package assihnments_java;

public class PrintDub {

	public static void main(String[] args) {
		String name = "queen";
		boolean dup = false;
		char[] charArray = name.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			for (int j = i + 1; j < charArray.length; j++) {
				if (charArray[i] == charArray[j]) {
					dup = true;

					System.out.println(charArray[i]);
					break;
				}

			}
			if (dup)
				break;

		}
		if (!dup) {
			System.out.println("no dups");
		}
	}
}

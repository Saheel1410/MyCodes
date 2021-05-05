package assihnments_java;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		String text = "Tes12Le79af65";
		int sum = 0 ;
		String onlyInt = text.replaceAll("\\D", "");
	
		char[] charArrayOfInt = onlyInt.toCharArray();
		for (int i = 0; i < charArrayOfInt.length; i++) {
		
				int numericValue = Character.getNumericValue(charArrayOfInt[i]);
			
			
			sum=sum+numericValue;
			System.out.println(sum);
		}
		
		
		
		
	}

}

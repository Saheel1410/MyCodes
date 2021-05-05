package assihnments_java;

public class ArmstongNumbers {

	public static void main(String[] args) {
		int num = 153;
		int source = num;
		int arm = 0;
		 while(num>0) {
			 int eachDigit = num%10;
			 int eachDigitCube = eachDigit*eachDigit*eachDigit;
			 arm = arm + eachDigitCube;
			 num = num/10;
			
		 } 
		 if (arm == source) {
			 System.out.println("The number Is an Armstrong Number");
			
		}
		 else {
			 System.out.println("The number Is not an Armstrong Number");
		 }
		
			 
		 }
	}



package assihnments_java;

public class OcuranceString {

	public static void main(String[] args) {
String name = "welcomeee";
char ref='e';
char[] charArray = name.toCharArray();
int count = 0;
for (int i = 0; i <name.length(); i++) {
	if (charArray[i]==ref) {
		count++;
	}
	
}
System.out.println(count);


	}

}

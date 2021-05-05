package assihnments_java;

public class RemoveVowels {

	public static void main(String[] args) {
  String name = "testleaf";
 name.replace("a", "");
 String replaceAll = name.replaceAll("[aeiouAEIOU]", "");
System.out.println(replaceAll);
 
	}

}

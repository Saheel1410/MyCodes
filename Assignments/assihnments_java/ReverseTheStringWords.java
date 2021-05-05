package assihnments_java;

public class ReverseTheStringWords {

	public static void main(String[] args) {
      String name = "My name is Saheel Khan";
      String[] words = name.split(" ");
      for (int i = words.length-1; i >=0; i--) {
		System.out.print(words[i]+" ");
	}
	}

}

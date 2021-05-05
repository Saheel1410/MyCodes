package assesment_01;

public class MethodCalling {
	public String getDayName() {
		String a = "monday";
		System.out.println(a);
		return a;
	}
public static void main(String[] args) {
	MethodCalling c = new MethodCalling();
	c.getDayName();
	}
}

package assesment_01;

public class Average {

	public static void main(String[] args) {
	 double[] array = {2,6,4,7,8,9,11,34,55,13};
	double total = 0;
	for (int i = 0; i < array.length; i++) {	
		total = total + array[i];
		//System.out.println(total);
	}
	double average = total / array.length;
	System.out.println(average);
	
	}

//	 int total =0;
//	 for (int i = 0; i < array.length; i++) {
//		total=total+array[i];
//	}
//	 int average=total/array.length;
//	 System.out.println(average);
//	
//}
}

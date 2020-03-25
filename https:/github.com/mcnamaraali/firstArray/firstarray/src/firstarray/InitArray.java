package firstarray;

public class InitArray {

	public static void main(String[] args) {
		
		int[] newArr = new int[10];
		
		System.out.printf("%s%8s%n", "Index", "Value");
		
		//output for each array
		for(int counter = 0; counter < newArr.length; counter++) {
			System.out.printf("%5d%8d%n", counter, newArr [counter]);
		}

	}

}

import java.util.Scanner;

public class HW7 {

	public static void main(String[] args) {
		int I1,I2;
		float F1, F2;
		char op;
		
		op = args[1].charAt(0);
		
		if(isInteger(args[0]) && isInteger(args[2])) {
			I1 = Integer.parseInt(args[0]);
			I2 = Integer.parseInt(args[2]);
		}
		
		
		if(isFloat(args[0]) && isFloat(args[2])) {
			F1 = Float.parseFloat(args[0]);
			F2 = Float.parseFloat(args[2]);
			System.out.printf("%.3f %.3f %c", F1, F2, op);
		}

		
		
		
	}
	
	static boolean isInteger(String n) {
		boolean result = false;
		Scanner in = new Scanner(n);
		
		result = in.hasNextInt();
		in.close();
		return result;
	}
	
	static boolean isFloat(String n) {
		boolean result = false;
		Scanner in = new Scanner(n);
		
		result = in.hasNextFloat();
		in.close();
		return result;
	}	

}

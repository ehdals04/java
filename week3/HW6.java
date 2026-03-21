import java.util.Scanner;

public class HW6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=1, Isum =0,  Ssum=0, Icnt=0, Fcnt=0, Scnt=0, Max_Integer=Integer.MIN_VALUE,  Max_String=0;
		float Fsum=0, Max_Float=Float.MAX_VALUE;
		String text;
		
		Scanner in = new Scanner(System.in);
		
		
		while(in.hasNext()) {
			text = in.next();
			if(isInteger(text)) {
				Isum += Integer.parseInt(text);
				Icnt++;
			}
			
			else if(isFloat(text)) {
				Fsum+=Float.parseFloat(text);
				Fcnt++;
			}
			else {
				Ssum += text.length();
				Scnt++;
			}
		}
		
		if(Icnt!=0) {
			System.out.printf("%d. 정수(%d개) %.1f, 실수(%d개) %f, 문자열(%d개) %f\n",c, Icnt, (float)Isum/Icnt, Fcnt, Fsum/Fcnt, Scnt, (float)Ssum/Scnt);
		}
		else {
			System.out.printf("%d. 실수(%d개) %f, 문자열(%d개) %f\n",c, Fcnt, Fsum/Fcnt, Scnt, (float)Ssum/Scnt);
		}
		
		c++;
		
	}
	
	static boolean isInteger(String text) {
		boolean result = false;
		
		Scanner in = new Scanner(text);
		
		result = in.hasNextInt();
		in.close();
		return result;
	}
	
	static boolean isFloat(String text) {
		boolean result = false;
		
		Scanner in = new Scanner(text);
		result = in.hasNextFloat();
		in.close();
		
		return result;
	}
	
	static boolean isString(String text) {
		boolean result = false;
		Scanner in = new Scanner(text);
		result = in.hasNext();
		
		return result;
	}
}


public class HW5 {
	
	public static void main(String[] args) {
		
		int total,
		won50000 =0, won10000 =0, won5000 =0, won1000 =0, won500 =0, won100 =0, won50 =0, won10 =0, won1 = 0;
		
		total = Integer.parseInt(args[0]);
		
		won50000 = total/50000;
		total-=50000*won50000;
						
		won10000 = total/10000;
		total-=10000*won10000;
			
		won5000 = total/5000;
		total-=5000*won5000;
			
		won1000 = total/1000;
		total-=1000*won1000;
			
		won500 = total/500;
		total-=500*won500;
			
		won100 = total/100;
		total-=100*won100;
		
		won50 = total/50;
		total-=50*won50;
			
		won10 = total/10;
		total-=10*won10;
		
		won1 = total/1;
		total-=1*won1;
			
		
		
		System.out.printf("%s원은 ", args[0]);
		if(won50000>0) {
			System.out.printf("오만원 %d장", won50000);
			
		}
		
		System.out.printf(" 50000만원 %d개\n 10000만원 %d개\n 5000원 %d개\n 1000원 %d개\n 500원 %d개\n 100원 %d개\n 50원 %d개\n 10원 %d개\n 1원 %d개\n", won50000, won10000, won5000, won1000, won500, won100, won50, won10, won1);
	}

}

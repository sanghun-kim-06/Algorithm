import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		
		double a = Integer.parseInt(str[0]);
		double b = Integer.parseInt(str[1]);
		double v = Integer.parseInt(str[2]);
		int day = (int) Math.ceil((v - b) / (a - b));
    System.out.println(day);

//		Scanner scan = new Scanner(System.in);
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		int v = scan.nextInt();
//		double day = 0.0;
//		
//		while(true) {
//			v -= a;
//			day += 0.5;
//			if(v <= 0) break;
//			v += b;
//			day += 0.5; 
//		}
//		
//		System.out.println((int)Math.ceil(day));
	}
}

import java.util.Scanner;

public class Ex1436 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int cnt = 0;
		int number = 665;
		
		while(true) {
			int six_cnt = 0;
			int ver = number;
			while(ver > 0) {
				int num1 = ver % 10;
				ver = ver / 10;
				int next = ver;
				int num2 = ver % 10;
				ver = ver / 10;
				int num3 = ver % 10;
				ver = ver / 10;
				
				if(num1 == 6 && num2 == 6 && num3 == 6) {
					six_cnt++;
				}
				ver = next;
			}
			
			if(six_cnt > 0) {
				cnt++;
			}
			
			if(n == cnt) {
				break;
			}
			number++;
		}
		
		System.out.println(number);
	}
}

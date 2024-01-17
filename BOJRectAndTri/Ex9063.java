import java.util.Scanner;

public class Ex9063 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if(n == 1) {
			System.out.println(0);
			return;
		}
		
		int max_x = -10001;
		int min_x = 10001;
		int max_y = -10001;
		int min_y = 10001;
		
		for(int i = 0; i < n; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			
			max_x = Math.max(max_x, x);
			min_x = Math.min(min_x, x);
			max_y = Math.max(max_y, y);
			min_y = Math.min(min_y, y);
		}
		
		System.out.println((max_x - min_x) * (max_y - min_y));

	}

}

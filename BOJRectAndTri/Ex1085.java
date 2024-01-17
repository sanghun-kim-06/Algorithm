import java.util.Scanner;

public class Ex1085 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int w = scan.nextInt();
		int h = scan.nextInt();
		
		int min_x = Math.min(w - x, x);
		int min_y = Math.min(h - y , y);
		int ans = Math.min(min_x, min_y);
		
		System.out.println(ans);
	}

}

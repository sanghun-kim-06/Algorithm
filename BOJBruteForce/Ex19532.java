import java.util.Scanner;

public class Ex19532 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		int e = scan.nextInt();
		int f = scan.nextInt();
		int ans_x = 0, ans_y = 0;
		
		loop1:
		for(int x = -999; x <= 999; x++) {
			loop2:
			for(int y = -999; y <= 999; y++) {
				int ax = a * x;
				int by = b * y;
				int dx = d * x;
				int ey = e * y;
				
				if(	((ax + by) == c)
					&&
					((dx + ey) == f)) {
					ans_x = x;
					ans_y = y;
					break loop1;
				}
			}
		}
		
		System.out.println(ans_x +" "+ ans_y);

	}

}

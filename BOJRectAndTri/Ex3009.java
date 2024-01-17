import java.util.Scanner;

public class Ex3009 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int point1_x = scan.nextInt();
		int point1_y = scan.nextInt();
		int point2_x = scan.nextInt();
		int point2_y = scan.nextInt();
		int point3_x = scan.nextInt();
		int point3_y = scan.nextInt();
		int x, y;
		
		if(point1_x == point2_x) {
			x = point3_x;
		}else if(point1_x == point3_x) {
			x = point2_x;
		}else {
			x = point1_x;
		}
		
		if(point1_y == point2_y) {
			y = point3_y;
		}else if(point1_y == point3_y) {
			y = point2_y;
		}else {
			y = point1_y;
		}
		
		System.out.println(x+" "+y);
	}

}

import java.util.Scanner;

public class Ex10101 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int angle1 = scan.nextInt();
		int angle2 = scan.nextInt();
		int angle3 = scan.nextInt();
		
		if((angle1 + angle2 + angle3) != 180) {
			System.out.println("Error");
			return;
		}
		
		if(angle1 != angle2 && angle1 != angle3 && angle2 != angle3) {
			System.out.println("Scalene");
			return;
		}
		
		if(angle1 == angle2 && angle1 == angle3 && angle2 == angle3) {
			System.out.println("Equilateral");
			return;
		}
		
		System.out.println("Isosceles");

	}

}

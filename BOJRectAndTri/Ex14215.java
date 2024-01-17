import java.util.Arrays;
import java.util.Scanner;

public class Ex14215 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] stick = new int[3];
		for(int i = 0; i < 3; i++) {
			stick[i] = scan.nextInt();
		}
		
		Arrays.sort(stick);
		
		if((stick[0] + stick[1]) > stick[2]) {
			System.out.println(stick[0] + stick[1] + stick[2]);
		}else {
			stick[2] = stick[0] + stick[1] - 1;
			System.out.println(stick[0]+stick[1]+stick[2]);
		}

	}

}

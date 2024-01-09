import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int cnt = 1, six_pow = 1;
		for(cnt = 1; six_pow < n; cnt++) {
			six_pow += ( 6 * cnt );
		}
		System.out.println(cnt);

	}

}

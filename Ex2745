import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String num = scan.next();
		int len = num.length() - 1;
		int notation = scan.nextInt();
		int ans = 0;
		
		for(int i = 0; i < num.length(); i++) {
			int n = num.charAt(i) - '0';
			
			if(n < 10) {
				ans += Math.pow(notation, len - i) * n;		
			}else {
				n -= 7;
				ans += Math.pow(notation, len - i) * n;
			}
		}
		System.out.println(ans);
		
		
	}

}

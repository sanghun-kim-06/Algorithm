import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int notation = scan.nextInt();
		String ans = "";
		
		while(n > 0) {
			if(n % notation < 10) {
				ans += (char)(n % notation + '0');
			}else {
				ans += (char)(n % notation - 10 + 'A');
			}
			n = n / notation;
		}
		
		for (int i = ans.length() - 1; i >= 0; i--) { // 맨처음부터 출력해야하므로
            System.out.print(ans.charAt(i));
        }
	}

}

import java.util.Scanner;

public class Ex2231 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int result = 0;
		for(int i = 0; i < n; i++) {
			int num = i;
			int sum = 0;
			
			while(num != 0) { //자리수 빼오기
				sum += num % 10;
				num = num / 10;
			}
			
			if(sum + i == n) { 
				result = i;
				break;
			}
		}
		
		System.out.println(result);
	}
	
	
/* 처음에 푼거 시간초과 뜸
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int hap = scan.nextInt();
		int[] arr;
		int temp = 0, num = 0;
		int ans = 0;
		while(true) {
			num++;
			String c = Integer.toString(num);
			char[] c1 = c.toCharArray();
			
			ans = num;
			for(int i = 0 ; i < c1.length; i++) {
				ans += c1[i] - '0';
			}
			if(ans == hap) {
				ans = num;
				break;
			}
		}
		System.out.println(ans);
	}
	*/
}

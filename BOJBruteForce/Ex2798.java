import java.util.Scanner;

public class Ex2798 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		int ans = 0, temp;
		for(int i = 0; i < n - 2; i++) {
			for(int j = i + 1; j < n - 1; j++) {
				for(int k = j + 1; k < n; k++) {
					temp = arr[i] + arr[j] + arr[k];
					if(temp > ans && temp <= m) {
						ans = temp;
					}
				}
			}
		}
		System.out.println(ans);
	}

}

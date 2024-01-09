import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i = 0; i < n; i++) {
			int money = scan.nextInt();
			int qua = 0, dim = 0, nik = 0, pen = 0;
			while(money > 0) {
				if(money >= 25) {
					qua++;
					money -= 25;
				}else if(money >= 10) {
					dim++;
					money -= 10;
				}else if(money >= 5) {
					nik++;
					money -= 5;
				}else if(money >= 1) {
					pen++;
					money -= 1;
				}
			}
			System.out.println(qua+" "+dim+" "+nik+" "+pen);
		}

	}

}

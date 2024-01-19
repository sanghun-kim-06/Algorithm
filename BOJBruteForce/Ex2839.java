
import java.util.Scanner;

public class Ex2839 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int cnt_3k = 0, cnt_5k = 0;
		
		while(n >= 3) {
			if(n%5 == 0) { //5의 배수라면 5로 뺀다
				cnt_5k++;
				n -= 5;
			}else { //그렇지 않으면 3으로 빼본다
				cnt_3k++;
				n -= 3;
			}
		}
		
		if(n == 0) { //나눠떨어지면 결과 출력
			System.out.println(cnt_3k + cnt_5k);
		}else { //아니면 -1
			System.out.println(-1);
		}
		
		
	}

}

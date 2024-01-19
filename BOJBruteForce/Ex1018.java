import java.util.Scanner;

public class Ex1018 {
	static boolean[][] chess;
	static int min = 64;
	
	static void getChessCnt(int xnum, int ynum) {
		int end_x = xnum + 8;
		int end_y = ynum + 8;
		int cnt = 0;
		boolean color = chess[xnum][ynum];
		
		for(int i = xnum ; i < end_x; i++) {
			for(int j = ynum; j < end_y; j++) {
				if (chess[i][j] != color) {	
					cnt++;
				}
				color = !color;
			}
			color = !color;
		}
		//처음 시작하는 색의 경우의 수가 두가지이기에
		//전체 갯수(8*8)에서 시작색이 바뀌어야하는 갯수를 빼면 반대 색의 개수임
		cnt = Math.min(cnt, 64 - cnt);
		min = Math.min(min, cnt);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		chess = new boolean[n][m];
		
		for (int i = 0; i < n; i++) {
			String str = scan.next();
			for (int j = 0; j < m; j++) {
				if (str.charAt(j) == 'W') {
					chess[i][j] = true;
				} else {
					chess[i][j] = false;
				}
 
			}
		}
		
		int n2 = n - 7;
		int m2 = m - 7;
		
		for (int i = 0; i < n2; i++) {
			for (int j = 0; j < m2; j++) {
				getChessCnt(i, j);
			}
		}
		
		System.out.println(min);
	}
}

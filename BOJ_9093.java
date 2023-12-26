import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// Backjoon 9093 단어 뒤집기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		String re = "";
		int n = Integer.parseInt(br.readLine());
		
		
		for(int i = 0; i < n; i++) {
			str = br.readLine();
			String[] sl = str.split(" ");
			for(int j = 0; j < sl.length; j++) {
				StringBuilder sb = new StringBuilder(sl[j]);
				sb.reverse();
				re += sb.toString() + " ";
			}
			System.out.println(re);
			re = "";
		}
			
	}

}

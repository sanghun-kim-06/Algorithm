import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int line = 0;
		int number, bunmo, bunza;
		
		while(n > 0) {
			line++;
			n -= line;
		}
		
		number = n + line;
		
		if(line % 2 == 0) {
			bunmo = line - number + 1;
			bunza = number;
		}else {
			bunmo = number;
			bunza = line - number + 1;
		}
		
		System.out.println(bunza+"/"+bunmo);

	}

}

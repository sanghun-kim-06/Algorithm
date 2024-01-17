import java.util.Scanner;

public class Ex5073 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size1, size2, size3;
		
		while(true) {
			size1 = scan.nextInt();
			size2 = scan.nextInt();
			size3 = scan.nextInt();
			
			if(size1 == 0 && size2 == 0 && size3 == 0) {
				break;
			}
			
			int max_size = Math.max(Math.max(size1, size2), size3);
			int remain;
			if(max_size == size1) {
				remain = size2 + size3;
			}else if(max_size == size2) {
				remain = size1 + size3;
			}else {
				remain = size1 + size2;
			}
			
			if(max_size >= remain) {
				System.out.println("Invalid");
				continue;
			}
			
			if(size1 == size2 && size1 == size3 && size2 == size3){
				System.out.println("Equilateral");
			}else if(size1 != size2 && size1 != size3 && size2 != size3) {
				System.out.println("Scalene");
			}else {
				System.out.println("Isosceles");
			}
		}

	}

}

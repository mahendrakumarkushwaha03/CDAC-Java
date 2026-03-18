package Jackie;
import java.util.Scanner;
public class Cheeta15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age: ");
		int num = sc.nextInt();
		
		
		if(num>=18) {
			System.out.println("Eligible");
		}
		else {
			System.out.println("Not eligible");
		}
	}

}

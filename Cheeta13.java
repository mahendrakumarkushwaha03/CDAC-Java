package Jackie;
import java.util.Scanner;

public class Cheeta13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		if(num==0) {
			System.out.println("It is Zero or Neutral");
		}
		else if(num>0) {
			System.out.println("It is Positive");
		}
		else {
			System.out.println("Negative");
		}
	}

}

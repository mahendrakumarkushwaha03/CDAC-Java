package Jackie;
import java.util.Scanner;

public class Cheeta8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number 1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter a number 2: ");
		int num2 = sc.nextInt();
		if(num1>num2) {
			System.out.println("Number 1 is greater");
		}
		else {
			System.out.println("Number 2 is greater");
		}
	}

}

package Jackie;
import java.util.Scanner;

public class cheeta11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Basic Salary: ");
		double BSal = sc.nextDouble();
		
		System.out.println("Enter Bonus: ");
		double Bonus = sc.nextDouble();
		System.out.println("Final Salary is: " + (BSal+Bonus));

	}

}

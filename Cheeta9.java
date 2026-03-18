package Jackie;
import java.util.Scanner;

public class Cheeta9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principal: ");
		double principal = sc.nextDouble();
		System.out.println("Enter Rate: ");
		double Rate = sc.nextDouble();
		System.out.println("Enter Time: ");
		double Time = sc.nextDouble();
		
		double Simple = principal*Rate*Time;
		System.out.println("Simple Intrest is :" + Simple);
		
		if (Rate >9) {
			System.out.println("It is High in Value..!!");
		}
		else {
			System.out.println("It is Low in Value..!!");

		}
	}
	
}

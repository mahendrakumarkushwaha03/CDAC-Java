package Jackie;
import java.util.Scanner;

public class Cheeta10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a age: ");
		double age = sc.nextDouble();
		if(age<18) {
			System.out.println("child");
		
		}else if(age>=18 && age<=21) {
			System.out.println("Teenager");
		}
		else {
			System.out.println("Adult");
		}

	}

}

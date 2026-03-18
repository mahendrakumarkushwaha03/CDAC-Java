package Jackie;

import java.util.Scanner;

public class Cheeta2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		double cel = sc.nextDouble();
		
		double fas = ((cel *9/5)+32);
		
		System.out.println("Temperature in Fahranite is :" + fas);
		sc.close();

	}

}

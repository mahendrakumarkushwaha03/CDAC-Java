package Jackie;
import java.util.Scanner;

public class Cheeta12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character: ");
		char Ch = sc.next().charAt(0);
		
		if (Character.isUpperCase(Ch)) {
            System.out.println("The character '" + Ch + "' is an uppercase letter.");
        } 
		
		else if (Character.isLowerCase(Ch)) {
			System.out.println("The character '" + Ch + "' is a lowercase letter.");
        } 
		else{
            System.out.println("The character '" + Ch + "' is not an alphabetic character (e.g., it's a number or special character).");
        }
	}

}

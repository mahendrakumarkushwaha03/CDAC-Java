package Jackie;
import java.util.Scanner;

public class Cheeta14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Units: ");
		int unit = sc.nextInt();
		int amount=0;
		if(unit<100) {
			amount = unit*1;
		}
		else if(unit<200) {
			amount = 100+ (unit-100)*2;
		}
		else if(unit<300) {
			amount = 100+200+(unit-200)*3;
		}
		else {
			amount = 100 + 200+ 300+ (unit-300)*4;
		}
		System.out.println("The amount is  :  " + amount);
	}

}

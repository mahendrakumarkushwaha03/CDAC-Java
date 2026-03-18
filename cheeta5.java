package Jackie;
import java.util.Scanner;

public class cheeta5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product Price : ");
		double price = sc.nextDouble();
		System.out.println("Enter Discount %: ");
		double dis = sc.nextDouble();
		double cal = price * dis;
		System.out.println("Final Price is :" + cal);
	}

}

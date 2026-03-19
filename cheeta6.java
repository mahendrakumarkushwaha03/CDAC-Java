package Jackie;
import java.util.Scanner;
public class cheeta6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Student Name : ");
		String Name=sc.next();
		System.out.println("Enter the marks : ");
		int marks = sc.nextInt();
		if (marks>=40) {
			System.out.println(Name + " is pass");
		}else
		{
			System.out.println(Name + " is fail");
		}
	}
}

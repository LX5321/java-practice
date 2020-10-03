import java.util.Scanner;

public class scannerDemo{
	public static void main(String[] args){
		// make scanner instance
		Scanner s = new Scanner(System.in);

		//
		// Main Program
		//
		System.out.print("Tax Adder: (Enter a Number) > ");
		int tax = s.nextInt();

		System.out.println("Total Tax: " + ( tax + 100));
		}
}


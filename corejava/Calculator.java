package corejava;
import java.util.Scanner;


public class Calculator {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean b = true;

		

		System.out.println(" hello please enter the operation :- ");

		System.out.println("1.Adddition");

		System.out.println("2.Substraction");

		System.out.println("3.Multiplication");

		System.out.println("4.Division");

		System.out.println("5.Exit");

		int val = scn.nextInt();

		switch (val) {

		case 1: {
			System.out.println("enter the first number ");
			int num1 = scn.nextInt();
			System.out.println("enter the second number ");
			int num2 = scn.nextInt();

			int add = num1 + num2;
			System.out.println("result :" + add);
			break;
		}
		case 2: {
			System.out.println("enter the first number ");
			int num1 = scn.nextInt();
			System.out.println("enter the second number ");
			int num2 = scn.nextInt();

			int sub = num1 - num2;
			System.out.println("result :"+sub);
			break;
		}
		case 3: {
			System.out.println("enter the first number ");
			int num1 = scn.nextInt();
			System.out.println("enter the second number ");
			int num2 = scn.nextInt();

			int mul = num1 * num2;
			System.out.println("result :"+mul);
			break;
		}
		case 4: {
			System.out.println("enter the first number ");
			int num1 = scn.nextInt();
			System.out.println("enter the second number ");
			int num2 = scn.nextInt();

			
			if(num2!=0) {
				int div = num1 / num2;
				System.out.println("result :"+div);
			}
			else {
				System.out.println("  Error: Division by zero is not allowed. 5");
			}
			
			break;
		}
		case 5: {
			System.out.println(" thank you ");
			b = false;
			break;
		}
		default: {
			System.out.println("invalid credentials");
		}
		}

	}

}



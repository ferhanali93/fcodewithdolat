package basicjava;

import java.util.Scanner;

public class IfElseStatements {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your value");
		
	int a = scanner.nextInt();
	
	if (a==12) {
	System.out.println("Your are right!");
		
	}
	else {
		System.out.println("your are wrong!");
	}
	
	}

}

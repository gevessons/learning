package application;

import java.util.Locale;
import java.util.Scanner;

import util.Data;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String name = sc.nextLine();
	
		System.out.print("Is there na initial deposit (y/n)? ");
		char initialDeposit = sc.next().charAt(0);
		double valueDeposit = 0.0;
		if(initialDeposit != 'n') {
			System.out.print("Enter initial deposit value: ");
			valueDeposit = sc.nextDouble();
		}
		Data data = new Data(accountNumber, name, valueDeposit);
		
		System.out.println("");
		System.out.println("Account data: ");
		System.out.println(data);
		
		System.out.println("");
		System.out.print("Enter deposit value: ");
		valueDeposit = sc.nextDouble();
		data.deposit(valueDeposit);
		System.out.println("Updated account data: ");
		System.out.println(data);
		
		System.out.println("");
		System.out.print("Enter a withdraw value: ");
		data.withdraw(sc.nextDouble());
		System.out.println("Updated account data: ");
		System.out.println(data);
		
		sc.close();
	}

}

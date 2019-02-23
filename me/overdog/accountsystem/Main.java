package me.overdog.accountsystem;

import java.util.Scanner;

import javax.xml.bind.DatatypeConverter;

/*
 * This class is used to show that this login works.
 */
public class Main 
{

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("\n");
		System.out.print("Please input your username!");
		System.out.print("\n");
		String username = scanner.nextLine();
		System.out.print("\n");
		System.out.print("Please input your password!");
		System.out.print("\n");
		String password = DatatypeConverter.printBase64Binary(scanner.nextLine().getBytes());
		
		Login.login(username, password);
	}
	
}

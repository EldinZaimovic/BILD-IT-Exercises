package zadaci_14_02_2018;

import java.util.Scanner;

public class zadatak_5_BrojSlova {

	public static int countLetters(String s) {
		 return s.toCharArray().length;	
		 // Aj, jedna linija, waaoooo :P
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite neki string: ");
		String s = unos.nextLine();
		System.out.println("String "+s+" ima "+countLetters(s)+ " karaktera.");
		unos.close();
	}

}

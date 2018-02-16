package zadaci_15_02_2018;

import java.util.Scanner;

public class zadatak_4_KarakteriNaNeparnim {

	public static void vratiNeparneKaraktere(String s) {
		for (int i=0; i<=s.length()-1; i=i+2) {
			System.out.print(s.charAt(i));
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite neki string: ");
		String s = unos.nextLine();
		vratiNeparneKaraktere(s);
		unos.close();
	}

}

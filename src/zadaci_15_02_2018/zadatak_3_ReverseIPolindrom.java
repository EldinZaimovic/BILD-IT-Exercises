package zadaci_15_02_2018;

import java.util.Scanner;

public class zadatak_3_ReverseIPolindrom {

	public static int reverse(int number) {
		int naopako=0;
		while (number != 0 ) {
	          naopako = naopako * 10;
	          naopako = naopako + number%10;
	          number = number/10;}
		return naopako;
	}
	
	public static boolean isPalindrome(int number) {
		return number == reverse(number);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner(System.in);
		System.out.print("Unesite cijeli broj: ");
		int broj = unos.nextInt();
		System.out.println("Vas broj "+broj+" u rikverc (hehe) izgleda: "+reverse(broj));
		if (isPalindrome(broj)==true) {
			System.out.println("Vas broj "+broj+" je polindrom.");
		}
		else {
			System.out.println("Vas broj "+broj+" nije polindrom.");
		}
		unos.close();
	}

}

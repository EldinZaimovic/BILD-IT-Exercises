package zadaci_13_02_2018;

import java.util.Arrays;
import java.util.Scanner;

public class zadatak_3_IdenticniNizovi {

	public static boolean equals(int[ ] niz1, int[ ] niz2) {
		boolean provjeravanje = false;
		if (Arrays.equals(niz1, niz2)) {
			provjeravanje=true;
		}
		else {
			provjeravanje=false;
			}
		return provjeravanje;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner(System.in);
		System.out.println("Unesi broj elemenata niza: ");
		int duzina = unos.nextInt();
		int[] niz1 = new int[duzina];
		int[] niz2 = new int[duzina];
		System.out.println("Unesite "+duzina+" brojeva u niz: ");
		for (int i = 0; i < niz1.length; i++) {
			niz1[i] = unos.nextInt();
		}
		System.out.println("Unesite "+duzina+" brojeva u drugi niz: ");
		for (int i = 0; i < niz2.length; i++) {
			niz2[i] = unos.nextInt();
		}
		if (equals(niz1, niz2)==true) {
			System.out.println("Dva niza su striktno identicna.");
		}
		else {
			System.out.println("Dva niza nisu striktno identicna.");
		}
		unos.close();
	}

}

package zadaci_13_02_2018;

import java.util.Scanner;

public class zadatak_4_NajveciU2DNizu {

	public static int[ ] locateLargest(double[ ][ ] a) {
		int[] lokacija = new int[2];
		double najveci=0;
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[0].length; j++) {
				if (najveci < a[i][j]) {
					najveci = a[i][j];
					lokacija[0]=i;
					lokacija[1]=j;
				}
			}
		}
		return lokacija;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner(System.in);
		System.out.println("Unesi broj redova: ");
		int red = unos.nextInt();
		System.out.println("Unesi broj kolona: ");
		int kolona = unos.nextInt();
		double[][] niz = new double[red][kolona];
		System.out.println("Unesite "+red+" x "+kolona+" matricu: ");
		for (int i=0; i<red; i++) {
			for (int j=0; j<kolona; j++) {
				niz[i][j] = unos.nextDouble();
			}
		}
		System.out.println("Izgled vase matrice je: ");
		for (int i=0; i<red; i++) {
			for (int j=0; j<kolona; j++) {
				System.out.print(niz[i][j]+" ");
			}
			System.out.println();
		}
		int[] lokacija = locateLargest(niz);
		System.out.print("Lokacija najveceg elementa je: ");
		for (int k=0; k<lokacija.length; k++) {
			System.out.print(lokacija[k]+" ");
		}
		unos.close();
	}

}

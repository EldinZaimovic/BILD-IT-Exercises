package zadaci_13_02_2018;


import java.util.Scanner;

public class zadatak_5_Sortiranje2DNiza {

	public static double[ ][ ] sortRows (double[ ][ ] array){
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				for (int k = j + 1; k < array[i].length; k++) {
					if (array[i][k] < array[i][j]) {
						double privremena = array[i][j];
						array[i][j] = array[i][k];
						array[i][k] = privremena;
					}
				}
			}
		}
		return array;
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
		System.out.println();
		System.out.println("Izgled sortirane matrice je:");
		sortRows(niz);
		for(int i = 0; i < niz.length; i++) {
			for(int k = 0; k < niz[0].length; k++) {
				System.out.print(niz[i][k] + " ");
			}
			System.out.println();
	}
		unos.close();
	}
}

package zadaci_14_02_2018;

import java.util.Scanner;

public class zadatak_4_BrojeviUObrnutomRedosljedu {

	public static void vratiObrnutno(int[] brojevi) {
		System.out.print("Brojevi u obrnutom redosljedu: ");
		for (int i = brojevi.length-1; i >=0 ; i--) {
			System.out.print(brojevi[i] + " ");
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos= new Scanner(System.in);
		int[] brojevi = new int[10];
		System.out.println("Molim vas unesite 10 brojeva: ");
		for (int i = 0; i < 10; i++) {
			brojevi[i] = unos.nextInt();
			}
		vratiObrnutno(brojevi);
		unos.close();
	}

}

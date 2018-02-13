package zadaci_12_02_2018;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class zadatak_5_Najveci_u_nizu {

	public static void vratiNajveci (ArrayList<Integer> list) {	
		int ponavljanje=0;
		int najveciBroj = Collections.max(list);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == najveciBroj) {
				ponavljanje++;
			}
		}
		System.out.println("Najveci broj je: " + najveciBroj + " i ponavljao se " + ponavljanje + " puta.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner(System.in);
		System.out.println("Unesi cijeli broj (0 prekida unos): ");
		ArrayList<Integer> list = new ArrayList<Integer>();
		int broj = unos.nextInt();
		while (broj != 0) {
			list.add(broj);
			broj = unos.nextInt();
		}
		vratiNajveci(list);
		unos.close();
	}

}

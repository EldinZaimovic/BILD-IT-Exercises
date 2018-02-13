package zadaci_12_02_2018;

import java.util.ArrayList;
import java.util.Scanner;

public class zadatak_1_Najveci_INT {

	public static Integer max(ArrayList<Integer> list) {
		Integer max = 0;
		if (list.isEmpty()) {
			return null;
		} else {
			for (Integer a : list) {
				if (a > max) {
					max = a;
				}
			}
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner unos= new Scanner(System.in);
		System.out.println("Unesi broj elemenata liste: ");
		int brojElemenata=unos.nextInt();
		System.out.println("Unesi elemente u listu: ");
		for (int i=0; i <brojElemenata; i++) {
			System.out.print(i+1+". ");
			list.add(unos.nextInt());
		}
		System.out.println("Najveci element u listi je: " + max(list));
		unos.close();
	}

}

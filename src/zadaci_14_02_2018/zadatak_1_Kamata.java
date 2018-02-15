package zadaci_14_02_2018;

import java.util.Scanner;

public class zadatak_1_Kamata {

	public static double vratiStanje(double uplata, int mjesec) {
		double konacno=0;
		 for (int i=1; i<=mjesec; i++) {
			konacno = (uplata+konacno)* (1+0.00417);	
			}
		 return konacno;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner(System.in);
		 System.out.print("Unesi mjesecnu uplatu: ");
		 double uplata = unos.nextDouble();
		 System.out.print("Unesi broj mjeseci za stednju: ");
		 int mjesec = unos.nextInt();
		 System.out.println("Stanje vaseg racuna je: "+vratiStanje(uplata, mjesec)+" KM.");
		 unos.close();
	}

}

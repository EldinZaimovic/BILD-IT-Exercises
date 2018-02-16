package zadaci_15_02_2018;

import java.util.Scanner;

public class zadatak_1_Investicija {

	public static double vratiBuducuVrijednost (double iznosInvesticije, double godisnjaStopa, int brojGodina) {
		 double mjesecnaStopa = godisnjaStopa/1200;
		 int kvadrat = brojGodina*12;
		 double broj = mjesecnaStopa+1;
		 double vrijednost = Math.pow(broj, kvadrat);
		 return iznosInvesticije * vrijednost;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner unos = new Scanner(System.in);
		 System.out.print("Unesi iznos investicije: ");
		 double iznosInvesticije = unos.nextDouble();
		 
		 System.out.print("Unesi godisnju interesnu stopu: ");
		 double godisnjaStopa = unos.nextDouble();
		 
		 System.out.print("Unesi broj godina: ");
		 int brojGodina = unos.nextInt();
		 
		 System.out.println("Buduca vrijednost investicije je: "+vratiBuducuVrijednost(iznosInvesticije, godisnjaStopa, brojGodina));
		 unos.close();
	}

}

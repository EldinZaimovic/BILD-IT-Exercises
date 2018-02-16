package zadaci_15_02_2018;

import java.util.Scanner;

public class zadatak_5_MinimalnaDuzinaPiste {

	public static double vratiMinimalnuDuzinuPiste (double brzina, double ubrzanje) {
		return (brzina*brzina)/(2*ubrzanje);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    Scanner unos = new Scanner(System.in);
	        System.out.print("Unesi brzinu: ");
	        double brzina =unos.nextDouble(); 
	        System.out.print("Unesi ubrzanje: ");
	        double ubrzanje = unos.nextDouble();
	        System.out.println("Minimalna duzina piste za ovaj avion iznosi "+vratiMinimalnuDuzinuPiste(brzina, ubrzanje)+" metara.");
	        unos.close();
	}

}

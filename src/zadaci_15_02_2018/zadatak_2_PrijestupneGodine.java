package zadaci_15_02_2018;


import static java.time.Year.isLeap;

import java.util.Scanner;

public class zadatak_2_PrijestupneGodine {

	public static void vratiPrijestupneGodine(int pocetnaGodina, int krajnjaGodina){
		int brojac=0;
		System.out.println("Prestupne godine u rasponu od "+pocetnaGodina+"-e do "+krajnjaGodina+"-e su:");
		 for (int i = pocetnaGodina; i <= krajnjaGodina; i++) {
	            if (brojac == 10) {
	                brojac = 0;
	                System.out.println();
	            }
	            if (isLeap(i)) {
	                System.out.print(i + " ");
	                brojac++;
	            }
	        }
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    Scanner unos = new Scanner(System.in);
	        System.out.print("Unesi pocetnu godinu: ");
	        int pocetnaGodina = unos.nextInt();
	        System.out.print("Unesi krajnju godinu: ");
	        int krajnjaGodina = unos.nextInt();
	        vratiPrijestupneGodine(pocetnaGodina, krajnjaGodina);
	        unos.close();
	        
	}

}

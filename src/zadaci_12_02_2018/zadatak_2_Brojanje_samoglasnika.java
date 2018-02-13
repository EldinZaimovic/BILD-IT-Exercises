package zadaci_12_02_2018;

import java.util.Scanner;

public class zadatak_2_Brojanje_samoglasnika {

	public static int brojSamoglasnika (String recenica) {
		int brojSamoglasnika = 0;
		recenica=recenica.toLowerCase();
		for (int i = 0; i < recenica.length(); i++) {
			if (recenica.charAt(i) == 'a' || recenica.charAt(i) == 'e' || recenica.charAt(i) == 'i'
					|| recenica.charAt(i) == 'o' || recenica.charAt(i) == 'u') {
				brojSamoglasnika++;
			}
		}
		return brojSamoglasnika;
	}
	
	
	public static int brojSuglasnika (String recenica) {
		return recenica.length()-brojSamoglasnika(recenica)-space(recenica);
	}
	
	
	public static int space (String recenica) {
		int brojSpace=0;
		recenica=recenica.toLowerCase();
		for (int i = 0; i < recenica.length(); i++) {
			if(recenica.charAt(i) == ' '){
				brojSpace++;
			}
		}
		return brojSpace;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner (System.in);
		System.out.println("Unesi neku recenicu: ");
		String recenica=unos.nextLine();
		for (int i = 0; i < recenica.length(); i++) {
			if (Character.isDigit(recenica.charAt(0))){
				System.out.println("Niste unijeli ispravnu recenicu!");
				System.exit(1);
			}
		}
		System.out.println("Broj samoglasnika je "+brojSamoglasnika(recenica));
		System.out.println("Broj suglasnika je "+brojSuglasnika(recenica));
		unos.close();
		
		
	}

}

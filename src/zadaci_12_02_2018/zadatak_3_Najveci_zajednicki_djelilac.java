package zadaci_12_02_2018;

import java.util.Scanner;

public class zadatak_3_Najveci_zajednicki_djelilac {

	public static int vratiNajveciDjelilac (int broj1, int broj2) {
		int min = broj1;
        int nzd = 1; 
        if (broj1 > broj2) {
            min = broj2;
        }

        for (int i = 2 ; i <= min ; i++) {
            if (broj1 % i == 0 && broj2 % i == 0) {
                nzd = i;
            }
        }

        return nzd;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner (System.in);
		System.out.println("Unesi prvi broj: ");
		int broj1=unos.nextInt();
		System.out.println("Unesi drugi broj: ");
		int broj2=unos.nextInt();
		System.out.println("Najveci zajednicki djelilca brojeva "+broj1+" i "+broj2+" je "+vratiNajveciDjelilac(broj1, broj2));
		unos.close();
	}

}

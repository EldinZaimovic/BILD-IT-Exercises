package zadaci_13_02_2018;

import java.util.Scanner;

public class zadatak_2_NajmanjiUNizu {

	public static double min(double[ ] array) {
		
		double min=array[0];
		for(int i = 0; i < array.length; i++){
			if(array[i] < min){
			min = array[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner(System.in);
		double niz[] = new double[10];
		System.out.println("Unesite deset elementa u niz: ");
		for(int i = 0; i < niz.length; i++){
			niz[i] = unos.nextInt();
		}
		System.out.println("Najmanji element u nizu je: "+min(niz)+".");
		unos.close();
	}

}

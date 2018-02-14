package zadaci_13_02_2018;

import java.util.Scanner;

public class zadatak_1_ProstiURangu {

	public static boolean isProstiBroj(int broj2) {
		for(int i = 2; i < Math.abs(broj2); i++){
			if(broj2 % i == 0){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// Radi i sa negativnim brojevima (Hvala Jasminu) :P

		Scanner unos = new Scanner(System.in);
		System.out.println("Unesi prvi broj:");
		int broj1=unos.nextInt();
		System.out.println("Unesi drugi broj:");
		int broj2=unos.nextInt();
		System.out.print("Prosti brojevi od "+broj1+" do "+broj2+" su: ");
		for(int i = broj1; i <= broj2; i++){
			if(isProstiBroj(i)){
				System.out.print(i+" ");
			}
		}
		unos.close();
	}

}

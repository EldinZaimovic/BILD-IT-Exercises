package zadaci_16_02_2018;

import java.util.Scanner;

public class zadatak_2_LCDDisplej {

	public static void printajLCD(int broj, int velicina) {
		System.out.println("Broj na ekranu izgleda:");
		switch (broj) {
		case 0:
			System.out.print(" ");
			for (int i=0; i<=velicina-1; i++) {
				System.out.print("-");	
			}		
			for (int j=0; j<=velicina-1; j++) {
				System.out.println();
				System.out.print("|");
			for (int i=0; i<=velicina-1; i++) {
				System.out.print(" ");
			}
			System.out.print("|");
			}
			System.out.println();
			System.out.print(" ");
			for (int i=0; i<=velicina-1; i++) {
				System.out.print("-");	
			}
			break;
		case 1:
			for (int i=0; i<=velicina-1; i++) {
				System.out.println("|");
			}
		break;
		case 2:
			for (int i=0; i<=velicina-1; i++) {
				System.out.print("-");
			}
			System.out.println();
			for (int j=0; j<=velicina-1; j++) {
			for (int i=0; i<=velicina-1; i++) {
				System.out.print(" ");
			}
			System.out.print("|");
			System.out.println();
			}
			for (int i=0; i<=velicina-1; i++) {
				System.out.print("-");	
			}
			System.out.println();
			for (int i=0; i<=velicina-1; i++) {
				System.out.println("|");	
			}
			System.out.print(" ");
			for (int i=0; i<=velicina-1; i++) {
				System.out.print("-");	
			}
			break;
		case 3:
			for (int i=0; i<=velicina-1; i++) {
				System.out.print("-");
			}
			System.out.println();
			for (int j=0; j<=velicina-1; j++) {
			for (int i=0; i<=velicina-1; i++) {
				System.out.print(" ");
			}
			System.out.print("|");
			System.out.println();
			}
			for (int i=0; i<=velicina-1; i++) {
				System.out.print("-");	
			}
			System.out.println();
			for (int j=0; j<=velicina-1; j++) {
				for (int i=0; i<=velicina-1; i++) {
					System.out.print(" ");
				}
				System.out.print("|");
				System.out.println();
				}
			for (int i=0; i<=velicina-1; i++) {
				System.out.print("-");	
			}
			break;
		case 4:
			for (int j=0; j<=velicina-1; j++) {
				System.out.println();
				System.out.print("|");
			for (int i=0; i<=velicina-1; i++) {
				System.out.print(" ");
			}
			System.out.print("|");
			}
			System.out.println();
			System.out.print(" ");
			for (int i=0; i<=velicina-1; i++) {
				System.out.print("-");	
			}
			System.out.println();
			for (int j=0; j<=velicina-1; j++) {
				for (int i=0; i<=velicina; i++) {
					System.out.print(" ");
				}
				System.out.print("|");
				System.out.println();
				}
			break;
		case 5:
			System.out.print(" ");
			for (int i=0; i<=velicina-1; i++) {
				System.out.print("-");
			}
			System.out.println();
			for (int i=0; i<=velicina-1; i++) {
				System.out.println("|");	
			}
			System.out.print(" ");
			for (int i=0; i<=velicina-1; i++) {
				System.out.print("-");	
			}
			System.out.println();
			for (int j=0; j<=velicina-1; j++) {
				for (int i=0; i<=velicina; i++) {
					System.out.print(" ");
				}
				System.out.print("|");
				System.out.println();
				}
			System.out.print(" ");
			for (int i=0; i<=velicina-1; i++) {
				System.out.print("-");	
			}
			break;
		case 6:
			System.out.print(" ");
			for (int i=0; i<=velicina-1; i++) {
				System.out.print("-");
			}
			System.out.println();
			for (int i=0; i<=velicina-1; i++) {
				System.out.println("|");	
			}
			System.out.print(" ");
			for (int i=0; i<=velicina-1; i++) {
				System.out.print("-");	
			}		
			for (int j=0; j<=velicina-1; j++) {
				System.out.println();
				System.out.print("|");
			for (int i=0; i<=velicina-1; i++) {
				System.out.print(" ");
			}
			System.out.print("|");
			}
			System.out.println();
			System.out.print(" ");
			for (int i=0; i<=velicina-1; i++) {
				System.out.print("-");	
			}
			break;
		case 7:
			System.out.println();
			for (int i=0; i<=velicina-1; i++) {
				System.out.print("-");
			}
			System.out.println();
			for (int j=0; j<=velicina-1; j++) {
			for (int i=0; i<=velicina-1; i++) {
				System.out.print(" ");
			}
			System.out.print("|");
			System.out.println();
			}
			break;
		case 8:
			System.out.print(" ");
			for (int i=0; i<=velicina-1; i++) {
				System.out.print("-");	
			}		
			for (int j=0; j<=velicina-1; j++) {
				System.out.println();
				System.out.print("|");
			for (int i=0; i<=velicina-1; i++) {
				System.out.print(" ");
			}
			System.out.print("|");
			}
			System.out.println();
			System.out.print(" ");
			for (int i=0; i<=velicina-1; i++) {
				System.out.print("-");	
			}
			for (int j=0; j<=velicina-1; j++) {
				System.out.println();
				System.out.print("|");
			for (int i=0; i<=velicina-1; i++) {
				System.out.print(" ");
			}
			System.out.print("|");
			}
			System.out.println();
			System.out.print(" ");
			for (int i=0; i<=velicina-1; i++) {
				System.out.print("-");	
			}
			break;
		case 9:
			System.out.print(" ");
			for (int i=0; i<=velicina-1; i++) {
				System.out.print("-");	
			}		
			for (int j=0; j<=velicina-1; j++) {
				System.out.println();
				System.out.print("|");
			for (int i=0; i<=velicina-1; i++) {
				System.out.print(" ");
			}
			System.out.print("|");
			}
			System.out.println();
			System.out.print(" ");
			for (int i=0; i<=velicina-1; i++) {
				System.out.print("-");	
			}
			System.out.println();
			for (int j=0; j<=velicina-1; j++) {
				for (int i=0; i<=velicina; i++) {
					System.out.print(" ");
				}
				System.out.print("|");
				System.out.println();
				}
			System.out.print(" ");
			for (int i=0; i<=velicina-1; i++) {
				System.out.print("-");	
			}
			break;
		}
	}
	public static void main(String[] args) {
		// Radi za brojeve od 0-9 i za sve velicine fonta
		
		Scanner unos=new Scanner (System.in);		
		System.out.print("Unesi broj koji hoces da bude ispisan na ekranu: ");
		int broj= unos.nextInt();
		System.out.print("Unesi velicinu za ispis: ");
		int velicina= unos.nextInt();
		if (broj>=0 && broj<10 && velicina>0) {
		printajLCD(broj, velicina);
		}
		else {
			System.out.println("Pogresan unos.");
		}
		unos.close();
	}

}

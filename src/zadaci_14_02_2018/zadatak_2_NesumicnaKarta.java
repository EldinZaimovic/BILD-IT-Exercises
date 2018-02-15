package zadaci_14_02_2018;

public class zadatak_2_NesumicnaKarta {

	public static void vratiKartu (int broj, int simbol, String karta) {
		
		switch (simbol) {
		case 1:
			karta = "srca";
			break;
		case 2:
			karta = "lista";
			break;
		case 3:
			karta = "kocke";
			break;
		case 4:
			karta = "maka";
			break;
		}
		switch (broj) {
		case 1:
			System.out.println("Karta koju ste izvukli je A, u znaku " + karta +".");
			break;
		case 2:
			System.out.println("Karta koju ste izvukli je 2, u znaku " + karta +".");
			break;
		case 3:
			System.out.println("Karta koju ste izvukli je 3, u znaku " + karta +".");
			break;
		case 4:
			System.out.println("Karta koju ste izvukli je 4, u znaku " + karta +".");
			break;
		case 5:
			System.out.println("Karta koju ste izvukli je 5, u znaku " + karta +".");
			break;
		case 6:
			System.out.println("Karta koju ste izvukli je 6, u znaku " + karta +".");
			break;
		case 7:
			System.out.println("Karta koju ste izvukli je 7, u znaku " + karta +".");
			break;
		case 8:
			System.out.println("Karta koju ste izvukli je 8, u znaku " + karta +".");
			break;
		case 9:
			System.out.println("Karta koju ste izvukli je 9, u znaku " + karta +".");
			break;
		case 10:
			System.out.println("Karta koju ste izvukli je 10, u znaku " + karta +".");
			break;
		case 12:
			System.out.println("Karta koju ste izvukli je J, u znaku " + karta +".");
			break;
		case 13:
			System.out.println("Karta koju ste izvukli je Q, u znaku " + karta +".");
			break;
		case 14:
			System.out.println("Karta koju ste izvukli je K, u znaku " + karta +".");
			break;
		}

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int broj = (int)(Math.random() * 13) + 1;
		int simbol = (int)(Math.random() * 4) + 1;
		String karta=" ";
		vratiKartu(broj, simbol, karta);
	}

}

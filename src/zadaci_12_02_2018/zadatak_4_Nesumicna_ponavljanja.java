package zadaci_12_02_2018;

public class zadatak_4_Nesumicna_ponavljanja {

	public static void vratiNesumicne () {
		int[] niz = new int[10];
		for (int i = 0; i < 100; i++) {
			int broj = (int) (Math.random() * 10);
			niz[broj]++;
		}
		for (int i = 0; i < niz.length; i++) {
			System.out.println(i + " se ponavlja " + niz[i]+ " puta.");
		}
	}
	
	public static void main(String[] args) {
		vratiNesumicne();
		
	}

}

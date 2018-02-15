package zadaci_14_02_2018;

import java.util.Scanner;

public class zadatak_3_NajveciZajednickiPrefix {
	

	public static void vratiPrefix (String string1, String string2) {
		  String mali,veliki;
		  int index = 0; 
	         if(string1.length() > string2.length()) {
	        	 mali = string2;
	        	 veliki = string1;
	        	 }
	          else
	            {
	        	  mali = string1;
	        	  veliki = string2;
	        	  }	           
	        for(char slovo: veliki.toCharArray())
	        {
	            if(index==mali.length()) break;
	            if(slovo != mali.charAt(index)) break;
	            index++;
	        }
	        if(index==0)
	          System.out.println(""+string1+ " i "+string2+ " nemaju zajednicki prefiks.");
	        else
	          System.out.println("Zajednicki prefiks je "+veliki.substring(0,index)+".");
	    }
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite prvi string: ");
		String string1 = unos.nextLine();
		System.out.println("Unesite drugi string: ");
		String string2 = unos.nextLine();
		vratiPrefix(string1, string2);
		unos.close();

	}

}

package lieblings_zeichen;

import java.util.Scanner;

public class Lieblingszeichen {
	public static void main(String[] args) {
 
		while (true) {
 
			System.out.println("Eingabe:");
 
			Scanner scanner = new Scanner(System.in);
			String satz = scanner.nextLine();
 
			int[] liste = new int[satz.length()];
			char[] listeCheckLettre = new char[satz.length()];
 
			for (int i = 0; i < satz.length(); i++) {
 
				if (listeCheckLettre == null) {
					listeCheckLettre[i] = satz.charAt(i);
					liste[i] = checklettre(satz, satz.charAt(i));
 
				} else if (isLetterInSatz(satz, satz.charAt(i)) == true
						&& isLetterInCheckListe(listeCheckLettre, satz.charAt(i)) == false) {
					listeCheckLettre[i] = satz.charAt(i);
					liste[i] = checklettre(satz, satz.charAt(i));
 
				}
			}
 
			System.out.println("Eingabe:" + satz);
			System.out.println("Die Liste der Anzahl von Letter" + liste);
			System.out.println("--Ranking der Zeichen--");
 
			for (int i = 0; i < listeCheckLettre.length; i++) {
				if (liste[i] != 0)
 
					System.out.println("" + listeCheckLettre[i] + " = " + liste[i]);
 
			}
		}
	}
 
	public static int checklettre(String satz, char lettre) {
 
		int nombreDeLettre = 0;
 
		for (int i = 0; i < satz.length(); i++) {
			if (satz.charAt(i) == lettre) {
				nombreDeLettre++;
			}
		}
 
		return nombreDeLettre;
 
	}
 
	public static boolean isLetterInSatz(String satz, char lettre) {
 
		int nombreDeLettre = 0;
 
		for (int i = 0; i < satz.length(); i++) {
			if (satz.charAt(i) == lettre) {
				nombreDeLettre++;
			}
		}
 
		if (nombreDeLettre > 1) {
 
			return true;
		}
		return false;
 
	}
 
	public static boolean isLetterInCheckListe(char[] satz, char lettre) {
 
		for (int i = 0; i < satz.length; i++) {
			if (satz[i] == lettre) {
				return true;
			}
		}
 
		return false;
 
	}
}
 
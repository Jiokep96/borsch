package array;
import java.util.Scanner;

public class MainArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int [] listNbr = new int [5];
		
		String checkFirst = "" + listNbr[0];
		String checkFinal = "" + listNbr[4];
		
		
		System.out.println("Veillez remplir le tableau: ");
		
		for(int i = 0 ; i < listNbr.length ; i++) {
			
			System.out.print("Valeur tableau" + i + ": \n");
			
			int valeur = scanner.nextInt();
			
			listNbr[i] = valeur;
			
		}
			
		
		System.out.println("\n************ Jeux de devinette *********");
		System.out.print("\ndevine les mots cacher si tu peus: ");
		
		int valeurDeviner = scanner.nextInt();
		
		
		for(int i = 1 ; i < listNbr.length ; i++) {
			
			if(listNbr[i] == valeurDeviner) {
				System.out.print("\nFelicitation vous avez deviner un nombre: " + listNbr[i]);
			}
			
		}
		
		System.out.println("desoler tu na pas trouver");
		
		
		System.out.print("ma liste[]: {");
		for(int i = 0 ; i < listNbr.length ; i++) {
			
				System.out.print("" + listNbr[i] + ",");
			
		}
		
		System.out.print("}");
		


	}

}

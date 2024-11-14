package methode;
import java.util.Scanner;

import borsch.MethodeClass;

public class MainMethode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Donner la largeur:");
		
		double largeur = scanner.nextDouble();
		
		System.out.print("Donner la longueur:");
		
		double longueur = scanner.nextDouble();
		
		
		double resultFinal = MethodeClass.calculeSurface(longueur, largeur);	
		
		MethodeClass.toAusgabe01(resultFinal);
		
		MethodeClass.toAusgabe02(longueur, largeur);
		
		

	}
	


}

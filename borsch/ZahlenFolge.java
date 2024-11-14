package borsch;
import java.util.Scanner;


public class ZahlenFolge {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Bitte geben Sie eine positive Ganzahl ein: ");
		
		int x = scanner.nextInt();
		
		int element = 1;
		int maxEvent = x;
		String result = "";
		
		
		String hilf = "" + x + ", ";
		result = result.concat(hilf);
		
		while( x != 1) {
			
			if(x % 2 == 0) {
				
				x = x / 2 ;
				
				// check de la valeur Maximal de x
				if(maxEvent < x) {
					maxEvent = x;
				}
				
				 hilf = "" + x + ", ";
			//	result = result.concat(hilf);
				result = result + hilf;
				
			} else {
				
				x = (x * 3) + 1;
				
				// check de la valeur Maximal de x
				if(maxEvent < x) {
					maxEvent = x;
				}
				
				 hilf = "" + x + ", ";
				 //	result = result.concat(hilf);
				result = result + hilf;
			}
			
			element ++;
		
		}
		
		System.out.print("Ausgabe:\nFolge = " + result + "\nMaximaler Wert = " + "" + maxEvent + "\nAnzahl Elemente = " + "" + element);
		
		scanner.close();

	}

}

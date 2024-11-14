package borsch;

public class MethodeClass {
	
	public static double calculeSurface(double longueur, double largeur) {
		
		double result = largeur * longueur;
		
		return result;
		
	}
	
	
	public static void toAusgabe01(double result) {
		System.out.println(" [methode toAusgabe01] la valeur de la surface est : " + result);
	}
	
	public static void toAusgabe02(double longueur, double largeur) {
		System.out.println("[methode toAusgabe02] la valeur de la surface est : " + calculeSurface(longueur, largeur));
	}
	
	
	public static int calculeMethode() {
		return 1;
	}
	
	
	public static String eleveMethode() {
		return "test";
	}
	
	public static boolean checkMethode() {
		return true;
	}

}

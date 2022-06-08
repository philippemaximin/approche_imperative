package fr.declaration.variable;

public class DeclarationApp {
	
	public static void main(String[] args) {
		byte jeSuisUnByte = 120;
		short jeSuisUnShort = 1200;
		int jeSuisUnInt = 1;
		long jeSuisUnLong = 10; 
		float jeSuisUnFloat = 3.14F;
		double jeSuisUnDouble = 99.99;
		char jeSuisUnChar = 'a';
		boolean jeSuisUnBool = true; 
		String jeSuisUnString = "à moins que que ne sois une culotte XD";
		String randomString= "Voici le résultat d’un calcul : 1+5=6";

		
		System.out.println(jeSuisUnDouble);
		System.out.println(randomString);

		System.out.println(randomString.substring(0, randomString.indexOf(":") + 1) + "\n" + randomString.substring(randomString.indexOf(":") + 1));
	}
	
}

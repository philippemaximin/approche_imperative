package fr.tableaux;

public class ExerciceDeclarationTab {

	public static void main(String[] args) {
	
		int tabInt[] = {8, -7, 12, 1, -2, 14, 17, 9};
		
		System.out.println(tabInt[0]);
		System.out.println("taille du tableau : " + tabInt.length);
		System.out.println(tabInt[tabInt.length - 1]);
		System.out.println(tabInt[10]); //overflow, taille max 8 index
	}

}

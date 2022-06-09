package fr.tableaux;

public class ExerciceTableauChaines {

	public static void main(String[] args) {
		String[] city = {"Paris", "Melun", "Lyon", "Nice", "Monaco"};
		
		for (int i = 0; i < city.length; i++) {
		  System.out.println(city[i]);
		}
		
		System.out.println(city.length);
		
		city[3] = "Reims";
		
		for (int i = 0; i < city.length; i++) {
		  System.out.println(city[i]);
		}
			
	}

}

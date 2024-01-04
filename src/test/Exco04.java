package test;

// Afficher le périmètre d’un cercle dont le rayon est demandé à l’utilisateur 

import java.util.Scanner;

public class Exco04 {
	public static void main(String[] args) {
		
		// pour donner l'acces a l'utilisateur de saisir un chiffre 
		Scanner scanne = new Scanner(System.in);
		
		System.out.println("Entrez le rayon de circle : ");
		

		
		int rayon = scanne.nextInt();		
		scanne.close();
		
		float chiffreP = 3.14f;
		
		System.out.println(rayon * chiffreP * 2);
	}

}

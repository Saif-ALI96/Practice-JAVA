package test;

import java.util.Scanner;

public class Exco05 {
	public static void main(String[] args) {
		
		Scanner scanne = new Scanner(System.in);
		
		System.out.println("Entrer votre age : ");
		
		int age = scanne.nextInt();		
		
		scanne.close();
		
		if (age > 0 && age < 18) {
			System.out.println("vous êtes mineur ");
		}else {
			System.out.println("vous êtes majeur ");
		
		}
	}

}

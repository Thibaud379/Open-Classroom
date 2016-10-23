package chapitre_1;

import java.util.Scanner;

public class IV_Boucles {

	public static void main(String[] args) {
		
		/* La boucle while
		 * 
		 * while (Condition)				Les accolades sont facultatives lorsque 
		 * { 							    les instructions ne font qu'une ligne.
		 * 		Instructions � r�p�ter
		 * }
		 * 
		 * On peut int�grer une boucle dans une autre boucle
		 */

		//Une variable vide
		String prenom;
		//On initialise celle-ci � O pour oui
		char reponse = 'O';
		//Notre objet Scanner
		Scanner sc = new Scanner(System.in);
		//Tant que la reponse ees oui
		while (reponse == 'O')
		{
			//On affiche une instruction
			System.out.println("Donnez un pr�nom : ");
			//On r�cupere le prenom saisi
			prenom = sc.nextLine();
			//On affiche la phrase avec le pr�nom
			System.out.println("Bonjour " +prenom+ ", comment vas-tu ?");
			//Cela nous permet d'entrer dans la deuxieme boucle
			reponse = ' ';
			while(reponse != 'O' && reponse != 'N'){
				//On demande si la personne veut r�essayer
				System.out.println("Voulez-vous r�essayer . (O/N)");
				//On r�cup�re la r�ponse de l'utilisateur
				//Le premier caract�re de la chaine de la chaine
				reponse = sc.nextLine().charAt(0); 
			}
		}
		//Fin de la boucle
		System.out.println("Au revoir...");
		
		
		/* Atention � ne pas faire de boucles infinies
		 * int a = 1, b = 15;
		 * while(a < b)
		 * 		System.out.println("coucou " +a+ " fois !!")
		 *
		 * Il aurait fallu ajouter une incr�mentation de a
		 */
		
		System.out.println("\nVersion non compacte");
		int a = 1, b = 15;
		while(a < b)
		{
			System.out.println("coucou " +a+ " fois !!");
			a++;
		}
		
		System.out.println("\nVersion compacte a++");
		a = 1;
		while(a++ < b)
			System.out.println("coucou " +a+ " fois !!");
		
		System.out.println("\nVersion compacte ++a");
		a = 1;
		while(++a < b)
			System.out.println("coucou " +a+ " fois !!");
		
		//L'incr�mentation ++var est prioritaire sur la condition mais pas var++
		
		
		
		sc.close();
	}
}

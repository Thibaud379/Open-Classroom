package chapitre_1;

import java.util.Scanner;

public class IV_Boucles {

	public static void main(String[] args) {
		
		/* La boucle while
		 * 
		 * while (Condition)				Les accolades sont facultatives lorsque 
		 * { 							    les instructions ne font qu'une ligne.
		 * 		Instructions à répéter
		 * }
		 * 
		 * On peut intégrer une boucle dans une autre boucle
		 */

		System.out.println("Boucle while");
		//Une variable vide
		String prenom;
		//On initialise celle-ci à O pour oui
		char reponse = 'O';
		//Notre objet Scanner
		Scanner sc = new Scanner(System.in);
		//Tant que la reponse ees oui
		while (reponse == 'O')
		{
			//On affiche une instruction
			System.out.println("Donnez un prénom : ");
			//On récupere le prenom saisi
			prenom = sc.nextLine();
			//On affiche la phrase avec le prénom
			System.out.println("Bonjour " +prenom+ ", comment vas-tu ?");
			//Cela nous permet d'entrer dans la deuxieme boucle
			reponse = ' ';
			while(reponse != 'O' && reponse != 'N'){
				//On demande si la personne veut réessayer
				System.out.println("Voulez-vous réessayer . (O/N)");
				//On récupère la réponse de l'utilisateur
				//Le premier caractère de la chaine de la chaine
				reponse = sc.nextLine().charAt(0); 
			}
		}
		//Fin de la boucle
		System.out.println("Au revoir...");
		
		
		/* Atention à ne pas faire de boucles infinies
		 * int a = 1, b = 15;
		 * while(a < b)
		 * 		System.out.println("coucou " +a+ " fois !!")
		 *
		 * Il aurait fallu ajouter une incrémentation de a
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
		
		//L'incrémentation ++var est prioritaire sur la condition mais pas var++
		
		/* La boucle do... while
		 * 
		 * do{    				Les accolades son facultatives pour une seule ligne d'instructions
		 * instructions
		 * }while(condition);
		 * 
		 * La même chose que la boucle while excepté qu'elle s'effectue toujours au moins une fois
		 */
		
		System.out.println("\nBoucle do... while");
		prenom = new String();
		//Pas besion d'initialiser comme on entre toujours dans la boucle
		reponse = ' ';
		
		do{
			System.out.println("Donnez un prénom : ");
			prenom = sc.nextLine();
			System.out.println("Bonjour " +prenom+ ", comment vas-tu ?");
			
			do{
				System.out.println("Voulez-vous réessayer ? (O/N)");
				reponse = sc.nextLine().charAt(0);
			}while (reponse != 'O' && reponse != 'N');
		}while(reponse == 'O');
		
		System.out.println("Au revoir...");
		
		
		/* La boucle for
		 * 
		 * for( var; condition; instruction: incrémentation ou décrementation le plus souvent)
		 * {					Les accolades son facultatives pour une seule ligne d'instructions
		 * 		instructions
		 * }
		 */
		System.out.println("\nBoucle for ++");
		
		for (int i = 1; i <= 10; i++)
			System.out.println("Voici la ligne " +i);
		
		//On peut aussi décrémenter
		
		System.out.println("\nBoucle for --");
		
		for(int i = 10; i >= 0; i--)
			System.out.println("Il reste " +i+ " ligne(s) à écrire");
		
		//On peut aussi spécifier plusieurs variables et un groupement de conditions
		System.out.println("\nBoucle for avec plusieurs variables");
		
		for(int i = 0, j = 2; (i < 10 && j < 6); i++, j+=2)
			System.out.println("i = " +i+ ", j = " +j);
		
		
		
		sc.close();
	}
}

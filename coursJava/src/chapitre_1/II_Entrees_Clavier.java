package chapitre_1;

//Importe la classe Scanner du package java.util
import java.util.Scanner;

//Importe toutes les classes du package java.util
import java.util.*;

@SuppressWarnings("unused")
public class II_Entrees_Clavier {

	public static void main(String[] args) {
		
		//Le Scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Veuillez saisir un mot :");
		String str = sc.nextLine();							//On récupère la prochaine ligne entée et on l'assigen à str
		System.out.println("Vous avez saisi : " + str);

		/* int i = sc.nextInt();							//Il existe des méthodes pour chaque type de variables
		 * double d = sc.nextDouble();
		 * long l = sc.nextLong();
		 * Etc...
		 */
		
		System.out.println("\nVeuillez saisir une lettre :");
		str = sc.nextLine();								//On récupère la ligne entrée
		char c = str.charAt(0);								//On récupère le premier caractère de cette chaine
		System.out.println("Vous avez saisi le caractère : " + c);
		
		//sc.nextLine() replace la tete de lecture sur la ligne suivante mais les autres instructions non
		//Donc:
		
		System.out.println("\nMauvaise méthode : ");
		System.out.println("Saisissez un entier : ");
		int i = sc.nextInt();
		System.out.println("Saisissez une chaîne : ");
		str = sc.nextLine();      
		System.out.println("FIN ! ");
		
		//Ne laisse pas la possibilitée de rentrer une chaine
		//Il faut donc vider la ligne avec sc.nextLine() avant d'invoquer une autre méthode
		   
		System.out.println("\nBonne méthode : ");
		System.out.println("Saisissez un entier : ");
		i = sc.nextInt();
		sc.nextLine();
		System.out.println("Saisissez une chaîne : ");
		str = sc.nextLine();      
		System.out.println("FIN ! ");
		
		sc.close();
		
	}
}

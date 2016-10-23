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
		String str = sc.nextLine();							//On r�cup�re la prochaine ligne ent�e et on l'assigen � str
		System.out.println("Vous avez saisi : " + str);

		/* int i = sc.nextInt();							//Il existe des m�thodes pour chaque type de variables
		 * double d = sc.nextDouble();
		 * long l = sc.nextLong();
		 * Etc...
		 */
		
		System.out.println("\nVeuillez saisir une lettre :");
		str = sc.nextLine();								//On r�cup�re la ligne entr�e
		char c = str.charAt(0);								//On r�cup�re le premier caract�re de cette chaine
		System.out.println("Vous avez saisi le caract�re : " + c);
		
		//sc.nextLine() replace la tete de lecture sur la ligne suivante mais les autres instructions non
		//Donc:
		
		System.out.println("\nMauvaise m�thode : ");
		System.out.println("Saisissez un entier : ");
		int i = sc.nextInt();
		System.out.println("Saisissez une cha�ne : ");
		str = sc.nextLine();      
		System.out.println("FIN ! ");
		
		//Ne laisse pas la possibilit�e de rentrer une chaine
		//Il faut donc vider la ligne avec sc.nextLine() avant d'invoquer une autre m�thode
		   
		System.out.println("\nBonne m�thode : ");
		System.out.println("Saisissez un entier : ");
		i = sc.nextInt();
		sc.nextLine();
		System.out.println("Saisissez une cha�ne : ");
		str = sc.nextLine();      
		System.out.println("FIN ! ");
		
		sc.close();
		
	}
}

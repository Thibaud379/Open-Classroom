package chapitre_1;

import java.util.Scanner;

public class VI_Tableaux {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		/* Tableaux à une dimension:
		 * 
		 * <type du tableau><nom du tableau>[] = {<contenu du tableau>}
		 * <type du tableau>[]<nom du tableau> = {<contenu du tableau>}
		 */
		
		int tableauInt[] = {0,1,2,3,4,5,6,7,8,9};
		double tableauDouble[] = {0.0,0.1,0.2,0.3,0.,0.5,0.6,0.7,0.8,0.9};
		char tableauChar[] = {'a','b','c','d','e','f','g'};
		String tableauString[] = {"chaine1","chaine2","chaine3","chaine4"};
		
		//On peut déclarer un tableau vide mais il faut en préciser la taille
		int tableauInt2[] = new int[6];
		
		/* Tableaux à deux dimensions
		 * >Un tableau de tableaux
		 */
		
		int premiersNombres[][] = {{0,2,4,6,8},{1,3,5,7,9}};
		
		/* Utilser et rechercher dans un tableau
		 *
		 * On précise l'indice de la valeur voulue entre les crochets
		 * Cet indicecommence toujours à zéro
		 * On utilise une boucle pour parcourir un tableau
		 */
		
		System.out.println("Obtenir une valeur dans un tableau");
		System.out.println(tableauChar[0]);
		
		System.out.println("\nAfficher toutes les valeurs d'un tableau");
		for(int i= 0; i < tableauChar.length; i++)
			System.out.println("A l'emplacement " +i+ " du tableau nous avons : " +tableauChar[i]);
		
		
		System.out.println("\nRechercher une valeur dans un tableau");
		//Déclaration des variables
		int i = 0;
		char reponse = ' ', carac = ' ';
		Scanner sc = new Scanner(System.in);
		
		do{//Boucle principale
			do{//Cette boucle se répète tant que l'utilisateur n'entre pas une lettre figurant dans le tableau
				
				i = 0;
				System.out.println("Entrez une lettre en minuscule, SVP.");
				carac = sc.nextLine().charAt(0);
				//Boucle de recherche dans le tableau
				while(i < tableauChar.length && carac != tableauChar[i])
					i++;
				//Si i < tableauChar.length alors le caractère entré était bien dans le tableau
				if(i < 7)
					System.out.println("La lettre \'" +carac+ "\' se trouve dans le tableau");
				else
					System.out.println("La lettre \'" +carac+ "\' ne se trouve pas dans le tableau");				
			}while( i >= tableauChar.length);
			
			do{//Tant que l'utilisateur n'a pas entré O ou N
				System.out.println("Voulez-vous essayer à nouveau ? (O/N)");
				reponse = sc.nextLine().charAt(0);
			}while(reponse != 'O' && reponse != 'N');
		 }while(reponse == 'O');
		
		 System.out.println("Au revoir");
		
		/* Il est courant de rencontrer des erreurs en travaillant avec des tableaux:
		 * 
		 * String str[] = new String[10];
		 * str[10] = "une exeption";
		 * 
		 * Cette instruction va renvoyer le message suivant:
		 * java.lang.ArrayIndexOutOfBoundsException
		 * car nous avons essayer d'écrire (ou de lire) dans une case qui n'est pas définie
		 */
		
	    System.out.println("Affichage de toute les valeurs d'un tableau bidimensionnel (boucle while)");
	    //Variables
	    int j = 0;
	    i = 0;
	    //Boucle des lignes 
	    while (i < 2){
		  j = 0;
		  //Boucle des colonnes
		  while(j < 5){
		    System.out.print(premiersNombres[i][j]);
		    j++;
		  }
		  System.out.println("");
		  i++;
		}
		
		System.out.println("\nAffichage de toute les valeurs d'un tableau bidimensionnel (boucle for)");
		for(int i1 = 0; i1 < 2; i1++){
			for(int j1 = 0; j1 < 5; j1++)
				System.out.print(premiersNombres[i1][j1]);
			System.out.println("");
		}
		
		System.out.println("\nAffichage de toute les valeurs d'un tableau bidimensionnel (boucle for syntaxe spéciale)");
		int i3 = 0, j3 = 0;
		for(int[] int1 : premiersNombres){
			i3 = 0;
			for(int int2 : int1){
				System.out.println("La valeur de la nouvelle boucle est : " +int2);
				System.out.println("La valeur du tableau à l'indice [" +j3+ "][" +i3+ "] est : " +premiersNombres[j3][i3]);
				i3++;
			}
			j3++;
		}	
		
		
		sc.close();
	}

}

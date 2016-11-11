package chapitre_1;

public class VII_Methodes_De_Classe {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		/* On peut catégoriser les méthodes en deux catégories:
		 * 		-natives: ellses sont intégrés à java 
		 * 		-et celles crées par nous.
		 * 
		 * Une méthode évite de recopier un morceau de code en boucle
		 * De cette facon si des modifications sont nécessaires, 
		 * il n'y a qu'un seul endroit où les faire.
		 *
		 * Il existe beaucoup de méthodes en java,
		 * notament dans les objets comme String
		 */
		
		
		//Méthodes concernant les String:
		
		// toLowerCase() permet de mettre en minuscule les caratères alphabétiques d'une chaine
		String chaine1 = new String("COUCOU TOUT LE MONDE !"), chaine2 = new String();
		chaine2 = chaine1.toLowerCase(); // Donne "coucou tout le monde"
		
		// toUpperCase() permet l'inverse
		chaine1 = chaine2.toUpperCase(); // Donne "COUCOU TOUT LE MONDE"
		
		// length() renvoie la longueur d'une chaine (en comptant les espaces)
		String chaine3 = new String("coucou !");
		int longueur = chaine3.length(); // Donne 9
		
		// equals(str) permet de vérifier l'égalité de deux chaines(!str.equals(str1) pour l'inégalité)
		System.out.println("Egalité de deux chaines");
		if(chaine1.equals(chaine2))
			System.out.println("Les deux chaines sont identiques !");
		else
			System.out.println("Les deux chaines sont différentes !");

		// charAt(i) renvoie le caractère à l'indexe i
		char carac = chaine3.charAt(3); // Donne 'c'
		
		// substring(i1, i2) renvoit une chaine de caractère (débute à i1 inculs et fini à i2 exclus)
		String chaine4 = chaine1.substring(7, 21);
		
		// indexOf() cherche une chaine de caractère dans la chaine et renvoie l'index de celle-ci (lastIndexOf() débute la recherche de la fin)
		String mot = new String("anticonstitutionnellement");
		int n = 0;
		n = mot.indexOf('t'); // Donne 2
		n = mot.lastIndexOf('t'); // Donne 24
		n = mot.indexOf("ti"); // Donne 2
		n = mot.lastIndexOf("ti"); // Donne 12
		n = mot.indexOf('x'); // Donne -1
		
		
		//Méthodes de la classe java.lang.Math (celle-ci retournent toutes des doubles)
		
		// random() retourne un nombre aléatoire entre 0 et 1
		double x = Math.random(); 
		
		// cos(), sin(), tan() respectivement les fonctions cosinus, sinus et tangeante
		double sin = Math.sin(120);    
		double cos = Math.cos(120);     
		double tan = Math.tan(120);
		
		// abs() renvoit la valeur absolue
		double abs = Math.abs(-120.25);
		
		// pow(int i, int e) renvoit i^e
		double exp = Math.pow(2, 2); // Donne 4
		
		
		//Utilisation des méthodes crées
		System.out.println("\nAffichage d'un tableau de String via une méthode");
		String[] tab = {"toto", "tata", "titi", "tete"};
		afficherTableau(tab);
		
		System.out.println(toString(tab));
		
		int[] tabInt = {1, 2, 3, 4};
		String[][] tabStr2 = {{"1", "2", "3", "4"}, {"toto", "titi", "tata"}};
		
		//La méthode avec un tableau d'int sera invoquée
		System.out.println("\nAffichage d'un tableau d'int via une méthode");
		afficherTableau(tabInt);
		
		//La méthode avec un tableau de String à deux dimensions sera invoquée
		System.out.println("\nAffichage d'un tableau de String à deux dimensions via une méthode");
		afficherTableau(tabStr2);
	}
	
	/* Créer sa propre méthode
	 *  
	 *  	-Elle se situe dans la classe mais hors de tout autre méthode
	 *   	-Le premier mot clé: il définit la portée de la méthode
	 *   		-public: tout le monde peut y accéder
	 *   		-private: on ne peut y accéder qu'a l'intérieur de la classe
	 *   		-protected: seul les classes qui héritent de la premiere on accès a ses méthodes prtotected
	 *   	-Apres on a static
	 *		-Ensuite le type de retour de a méthode
	 *		-Le nom de la méthode 
	 * 		-Les paramètres de la méthode
	 * 		-Une instruction return dans la méthode
	 */
	
	public static double arrondi(double a, double b){
		return (double) ( (int) (a * Math.pow(10, b) + .5)) / Math.pow(10, b);
	}
	
	/* 	-Le nombre de paramètres n'est pas limité pour une méthode
	 * 	-Il existe trois types de méthodes:
	 * 		-les méthodes qui ne renvoient rien: void
	 * 		-les méthodes qui renvoient un type primitif: int, double, char, ...
	 * 		-les méthodes qui renvoient un objet: String
	 */
	
	//Affiche un tableau de String
	static void afficherTableau(String[] tab){
		for(String str: tab)
			System.out.println(str);
	}
	
	//transforme un tableau de String en String et le renvoie
	static String toString(String[] tab){
		System.out.println("\nMéthode toString() !\n------------------");
		String retour = "";
		
		for(String str : tab)
			retour += str +"\n";
		
		return retour.substring(0, retour.length()-2);
	}

	/* La surcharge de méthode
	 * 
	 * On garde le meme nom pour une méthode
	 * mais on change ses paramètres
	 */
	
	//Affiche un tableau d'int
	static void afficherTableau(int[] tab){
		for(int str: tab)
			System.out.println(str);
	}
	
	//Affihe un tableau à deux dimensions de String
	static void afficherTableau(String[][]tab){
		for(String[] subTab: tab){
			for(String str : subTab)
				System.out.println(str);
		}
	}
	
	
}

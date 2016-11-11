package chapitre_1;

public class VII_Methodes_De_Classe {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		/* On peut cat�goriser les m�thodes en deux cat�gories:
		 * 		-natives: ellses sont int�gr�s � java 
		 * 		-et celles cr�es par nous.
		 * 
		 * Une m�thode �vite de recopier un morceau de code en boucle
		 * De cette facon si des modifications sont n�cessaires, 
		 * il n'y a qu'un seul endroit o� les faire.
		 *
		 * Il existe beaucoup de m�thodes en java,
		 * notament dans les objets comme String
		 */
		
		
		//M�thodes concernant les String:
		
		// toLowerCase() permet de mettre en minuscule les carat�res alphab�tiques d'une chaine
		String chaine1 = new String("COUCOU TOUT LE MONDE !"), chaine2 = new String();
		chaine2 = chaine1.toLowerCase(); // Donne "coucou tout le monde"
		
		// toUpperCase() permet l'inverse
		chaine1 = chaine2.toUpperCase(); // Donne "COUCOU TOUT LE MONDE"
		
		// length() renvoie la longueur d'une chaine (en comptant les espaces)
		String chaine3 = new String("coucou !");
		int longueur = chaine3.length(); // Donne 9
		
		// equals(str) permet de v�rifier l'�galit� de deux chaines(!str.equals(str1) pour l'in�galit�)
		System.out.println("Egalit� de deux chaines");
		if(chaine1.equals(chaine2))
			System.out.println("Les deux chaines sont identiques !");
		else
			System.out.println("Les deux chaines sont diff�rentes !");

		// charAt(i) renvoie le caract�re � l'indexe i
		char carac = chaine3.charAt(3); // Donne 'c'
		
		// substring(i1, i2) renvoit une chaine de caract�re (d�bute � i1 inculs et fini � i2 exclus)
		String chaine4 = chaine1.substring(7, 21);
		
		// indexOf() cherche une chaine de caract�re dans la chaine et renvoie l'index de celle-ci (lastIndexOf() d�bute la recherche de la fin)
		String mot = new String("anticonstitutionnellement");
		int n = 0;
		n = mot.indexOf('t'); // Donne 2
		n = mot.lastIndexOf('t'); // Donne 24
		n = mot.indexOf("ti"); // Donne 2
		n = mot.lastIndexOf("ti"); // Donne 12
		n = mot.indexOf('x'); // Donne -1
		
		
		//M�thodes de la classe java.lang.Math (celle-ci retournent toutes des doubles)
		
		// random() retourne un nombre al�atoire entre 0 et 1
		double x = Math.random(); 
		
		// cos(), sin(), tan() respectivement les fonctions cosinus, sinus et tangeante
		double sin = Math.sin(120);    
		double cos = Math.cos(120);     
		double tan = Math.tan(120);
		
		// abs() renvoit la valeur absolue
		double abs = Math.abs(-120.25);
		
		// pow(int i, int e) renvoit i^e
		double exp = Math.pow(2, 2); // Donne 4
		
		
		//Utilisation des m�thodes cr�es
		System.out.println("\nAffichage d'un tableau de String via une m�thode");
		String[] tab = {"toto", "tata", "titi", "tete"};
		afficherTableau(tab);
		
		System.out.println(toString(tab));
		
		int[] tabInt = {1, 2, 3, 4};
		String[][] tabStr2 = {{"1", "2", "3", "4"}, {"toto", "titi", "tata"}};
		
		//La m�thode avec un tableau d'int sera invoqu�e
		System.out.println("\nAffichage d'un tableau d'int via une m�thode");
		afficherTableau(tabInt);
		
		//La m�thode avec un tableau de String � deux dimensions sera invoqu�e
		System.out.println("\nAffichage d'un tableau de String � deux dimensions via une m�thode");
		afficherTableau(tabStr2);
	}
	
	/* Cr�er sa propre m�thode
	 *  
	 *  	-Elle se situe dans la classe mais hors de tout autre m�thode
	 *   	-Le premier mot cl�: il d�finit la port�e de la m�thode
	 *   		-public: tout le monde peut y acc�der
	 *   		-private: on ne peut y acc�der qu'a l'int�rieur de la classe
	 *   		-protected: seul les classes qui h�ritent de la premiere on acc�s a ses m�thodes prtotected
	 *   	-Apres on a static
	 *		-Ensuite le type de retour de a m�thode
	 *		-Le nom de la m�thode 
	 * 		-Les param�tres de la m�thode
	 * 		-Une instruction return dans la m�thode
	 */
	
	public static double arrondi(double a, double b){
		return (double) ( (int) (a * Math.pow(10, b) + .5)) / Math.pow(10, b);
	}
	
	/* 	-Le nombre de param�tres n'est pas limit� pour une m�thode
	 * 	-Il existe trois types de m�thodes:
	 * 		-les m�thodes qui ne renvoient rien: void
	 * 		-les m�thodes qui renvoient un type primitif: int, double, char, ...
	 * 		-les m�thodes qui renvoient un objet: String
	 */
	
	//Affiche un tableau de String
	static void afficherTableau(String[] tab){
		for(String str: tab)
			System.out.println(str);
	}
	
	//transforme un tableau de String en String et le renvoie
	static String toString(String[] tab){
		System.out.println("\nM�thode toString() !\n------------------");
		String retour = "";
		
		for(String str : tab)
			retour += str +"\n";
		
		return retour.substring(0, retour.length()-2);
	}

	/* La surcharge de m�thode
	 * 
	 * On garde le meme nom pour une m�thode
	 * mais on change ses param�tres
	 */
	
	//Affiche un tableau d'int
	static void afficherTableau(int[] tab){
		for(int str: tab)
			System.out.println(str);
	}
	
	//Affihe un tableau � deux dimensions de String
	static void afficherTableau(String[][]tab){
		for(String[] subTab: tab){
			for(String str : subTab)
				System.out.println(str);
		}
	}
	
	
}

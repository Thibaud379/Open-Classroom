package chapitre_1;

public class Conditions {

	public static void main(String[] args) {
		
		/* Les différents opérateurs logiques:
		 * 		== Permet de tester l'égalité
		 * 		!= Permet de tester l'inégalité
		 * 		<  Stirctement inférieur
		 * 		<= Inférieur ou égal
		 * 		>  Strictement supérieur
		 * 		>= Supérieur ou égal
		 *		&& Opérateur "et"
		 *		|| Opérateur "ou"
		 *		?  Opérateur ternaire
		 */
		
		
		
		/*	Structure if ... else (si... sinon)
		 *
		 *	if(condition)
		 *	{ //Les accolades sont facultatives lorsques les instructions ne ont q'une seule lligne de code
		 *		//Execution des instruction si la condition est remplie
		 *	}
		 *	else
		 *	{
		 *		//Execution de instruction si la condition n'est pas remplie
		 *	}
		 */
		
		int i1 = 10;
		
		if(i1<0)
			System.out.println("Le nombre est négatif");
		else if(i1==0)
			System.out.println("Le nombre est nul");
		else
			System.out.println("Le nombre est positif");
		
		// Le décaage entre test et instructon est appelé l'indentation
		
		//Conditions multiples
		int i2 = 58;
		
		if(i2 < 100 && i2 > 50)
			System.out.println("Le nombre est bien dans l'intervalle.");
		else
			System.out.println("Le nombre n'est pas dans l'intervalle.");
		
		
		/* La structure switch
		 * 
		 * switch(variable)
		 * {
		 * 		case argument;
		 * 			Action;
		 * 			break;
		 * 		default;
		 * 			Action;
		 * }
		 * 
		 * 
		 */
		
	}

}

package chapitre_1;

public class III_Conditions {

	@SuppressWarnings("unused")
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
		 * switch(variable) 	On évalue cette expression
		 * {
		 * 		case argument: 	Si variable == argument
		 * 			Action; 	Alors on execute cette action
		 * 			break;		Il permet de sortir du switch: sans lui, toutes les instructions qui suivent seraient aussi exécutées
		 * 		default:		Si aucun des "case" ne correspond 
		 * 			Action;		Alors on éxecute cette action
		 * }
		 */
		
		//Switch sans break;
		System.out.println("\n\nTest sans \"break;\"\n");
		int note = 10;
		
		switch(note)
		{
			case 0:
				System.out.println("Ouch !");
			case 10:
				System.out.println("Vous avez juste la moyenne");
			case 20:
				System.out.println("Parfait");
			default:
				System.out.println("Il faut d'avantage travailler");
		}
		
		//Switch sans break;
				
		System.out.println("\n\nTest avec \"break;\"\n");	
					
		switch(note)
		{
			case 0:
				System.out.println("Ouch !");
				 break;
			case 10:
				System.out.println("Vous avez juste la moyenne");
				 break;
			case 20:
				System.out.println("Parfait");
				 break;
			default:
				System.out.println("Il faut d'avantage travailler");
		}
		
		/* La condition ternaire
		 * 
		 * variable = (condition) ? oui : non ;
		 * 
		 * Si la condition est vraie alors variable = oui
		 * Sinon variable = non
		 */
		
		int x = 10, y = 20;
		int max = (x < y) ? y : x ; // max vaut 20
		
		//On peut effectuer des calculs dans la condition
		max = (x < y) ? y*2 : x*2 ; // max vaut 40 (20*2)
		
		//On peut insérer une condition ternaire dans une condition ternaire
		max = (x < y) ? ((y < 10) ? y%10 : y*2 ): x ; // max vaut 40 (20*2)
		
		
	}

}

package chapitre_1;

public class I_Variables {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		 
		//Afficher du texte dans la console
		System.out.print("Hello World !\n");		//Charactères échapatoires: \n saute une ligne
		System.out.print("My name is\n");			//							\r retour chariot
		System.out.println("Thibaud");				//							\t tabulation
			
		//variables
		byte by1 = 15;								// 1o valeurs entre -128 et +127
		short s1 = 350;								// 2o valeurs entre -32768 et +32767
		int i1 = 52222588;							// 4o valeurs entre -2*10^9 à 2*10^9
		long l1 = 1112223689566L;					// 8o valeurs entre -9*10^18 à 9*10^18
		float f1 = 3.141592653f; 					// 4o valeurs décimales
		double d1 = 0.3333333333333d;				// 8o valeurs décimales
		char c1 = 'e';								//    Caractère
		boolean b1 = true;							//    Vrai ou Faux
		String str1 = "une chaine";					//    Chaine de caractères
		
		//Opérateurs arithmétiques
		int nb1, nb2, nb3, nb4;
		
		nb1 = 1 + 3;								//Addition 				4
		nb2 = 2 * 6;								//Multiplication		12
		nb3 = nb2 / nb1;							//Division				3	
		nb1 = 5 % 2;								//Modulo				1
		nb2 = 99 % 8;								//						3
		nb3 = 6 % 3;								//						0
		
		nb1 = nb2 = nb3 = nb4 = 2;
		
		nb1 = nb1 + 1;								//Incrémentation   	 	3
		nb1 += 1;									//						4
		nb1++;										//N'a pas la priorité	5
		++nb1;										//A la priorité			6
			
		nb2 = nb2 - 1;								//Décrémentation  	 	1
		nb2 -= 1;									//						0
		nb2--;										//						-1
		--nb2;										//						-2
		
		nb3 = nb3 * 2;								//Multiplication   		4
		nb3 *= 2;									//						8
			
		nb4 = nb4 / 2;								//Division				1
		nb4 /= 2;									//						0.5
		
		//Conversions ou "Cast"
		int i2 = 123;
		
		float f2 = (float)i1;						//int vers float
		double d2 = (double)i1;						//int vers double
		
		double d3 = 1.23;
		d2 = 2.999999;
													//L'inverse amene une perte de précision
		int i3 = (int)d3;							// Vaut 1
		i3 = (int)d2;								// Vaut 2
		
		double d4 = 10, d5 = 3;						//On peut Caster le resultat d'une opération 
		int res = (int)(d4/d5);						//en la mettant entre parenthèses
		System.out.println("Le résultat est = " + res);
		
		int i4 = 3, i5 = 2;							//Ici le résultat est 1 car le cast n'affetce que 
		double resultat = (double)(i4/i5); 			//le resultat de l'opération qui est 1
		
		resultat = (double)i4 / (double)i5; 		//Ici c'est 1.5 car on a d'abord caster les deux int
		
		int i6 = 12;
		String str2 = String.valueOf(i6); 			//int vers String
		int i7 = Integer.valueOf(str2).intValue();	//String vers int (Il existe les variantes .floatValue() .doubleValue() ... 
													//Pour les autres primitifs numériques
		//Formatage des nombres
		double d6 = 1_000_000_000d; 				//On peut mettre des underscores afin de mieux visualiser des nombres conséquents
		d6 = 1___000__000_000d;						//Le nombre d'undersores na pas d'importance
	
		/*d6  = 123_.159;							//Ces notations ne sont pas valides car les underscores
		int i8 = _123;								//Doivent etre entre deux caractères numériques
		i8 = 123_*/		
		
		// On peut déclarer des expressions en hexadecimal avec le préfixe 0x
		int i8 = 0xFF;								// Vaut 255
		i8 = 0x14;									// Vaut 20
		
		//On peut déclarer des expressions en binaire avec le préfixe 0b
		i8 = 0b1111_1111;							// Vaut 255
		i8 = 0b1000_0000_0000;						// Vaut 2048
			
	}
}

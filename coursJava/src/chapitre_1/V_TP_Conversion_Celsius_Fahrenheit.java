package chapitre_1;

import java.util.Scanner;

public class V_TP_Conversion_Celsius_Fahrenheit {

	public static void main(String[] args) {
		
		//Déclaration des variables
		Scanner sc = new Scanner(System.in);
		char mode, reponse;
		double temp , resultat;
		//Déclarations des variables pour l'affichage
		String strIntro = "|-----------------------------------------------|\n| Convertisseur Degrés Celsius / Fahrenheit     |\n";
		String strMode =  "|-----------------------------------------------|\n| Choisissez le mode de conversion :            |\n| 1 - Convertisseur Celsius - Fahrenheit        |\n| 2 - Convertisseur Fahrenheit - Celsisus       |\n|-----------------------------------------------|";
		String strTemp =  "|-----------------------------------------------|\n| Entrez la température à convertir :           |\n|-----------------------------------------------|";
		String strBarre = "|-----------------------------------------------|\n";
		String strQu1 =   "|                                               |\n| Voulez-vous convertir une autre température ? |\n|                     O / N                     |\n|-----------------------------------------------|";
		String strQu2 =   "|-----------------------------------------------|\n| Voulez-vous convertir une autre température ? |\n|                     O / N                     |\n|-----------------------------------------------|";
		String strEnd =   "|-----------------------------------------------|\n|                 Au Revoir  :(                 |\n|-----------------------------------------------|";
		String strT, strR, strSp;
		int l;
		//Affichage du titre
		System.out.print(strIntro);
		//Boucle principale
		do{
			//Boucle de sélection du mode (pour permettre seulement les modes 1 et 2)
			do{
				System.out.println(strMode);		//Affichage du menu de selection du mode
				mode = sc.nextLine().charAt(0);		//Attribution de l'entrée clavier à la variable
			}while(mode != '1' && mode != '2');
			//Affichage de l'invitation à entrer une température	
			System.out.println(strTemp);
			// Tant que l'entrée clavier n'est pas un nombre
			while(!sc.hasNextDouble()){	
				System.out.println(strTemp); 		//Affichage de l'invitation à entrer une température	
				sc.nextLine();						//On passe à la prochaine entrée
			}
			//On assigne la valeur entrée à temp et on passe la ligne du Scanner
			temp = sc.nextDouble();
			sc.nextLine();
			//On calcule la température convertie
			if(mode == '1')
				resultat = temp*1.8 + 32; 			//Si le mode 1 est sélectionné on calcule des °F
			else
				resultat = (temp-32)*5 / 9;			//Si le mode 2 est sélectionné on calcule des °C
			//On arrondie les résultats aux 1/10 ème près
			resultat = (double)Math.round(resultat * 10)/10;
			temp = (double)Math.round(temp * 10)/10;
			//On calclcule le nombre d'espace à rajouter pour completer le rectangle
			strT = Double.toString(temp);
			strR = Double.toString(resultat);
			l = 23 -(strT.length()+strR.length());
			//On créer une chaine avec le bon nombre d'espace
			strSp = "";
			for(int i = 0; i < l; i++)
					strSp = strSp + " ";
			//En fonction du mode, on affiche le bon message de résultat	
			if(mode =='1') 
				System.out.print(strBarre+"| " +temp+ " °C correspond à : " +resultat+ " °F." +strSp+ "|\n");
			else
				System.out.print(strBarre+"| " +temp+ " °F correspond à : " +resultat+ " °C." +strSp+ "|\n");
			//On demande si l'utilisateur veut réessayer
			System.out.println(strQu1);
			//On récupère sa réponse
			reponse = sc.nextLine().charAt(0);
			//Tant que sa réponse n'est pas O ou N on lui redemande
			while(reponse != 'O' && reponse != 'N'){
				System.out.println(strQu2);
				reponse = sc.nextLine().charAt(0);
		    }
		//Tant que la réponse est O on reprend du début	
		}while(reponse == 'O');
		//On affiche le message d'au revoir
		System.out.println(strEnd);
		//On ferme notre Scanner
		sc.close();
	}
}

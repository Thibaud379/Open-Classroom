package chapitre_1;

import java.util.Scanner;

public class V_TP_Conversion_Celsius_Fahrenheit {

	public static void main(String[] args) {
		
		//D�claration des variables
		Scanner sc = new Scanner(System.in);
		char mode, reponse;
		double temp , resultat;
		//D�clarations des variables pour l'affichage
		String strIntro = "|-----------------------------------------------|\n| Convertisseur Degr�s Celsius / Fahrenheit     |\n";
		String strMode =  "|-----------------------------------------------|\n| Choisissez le mode de conversion :            |\n| 1 - Convertisseur Celsius - Fahrenheit        |\n| 2 - Convertisseur Fahrenheit - Celsisus       |\n|-----------------------------------------------|";
		String strTemp =  "|-----------------------------------------------|\n| Entrez la temp�rature � convertir :           |\n|-----------------------------------------------|";
		String strBarre = "|-----------------------------------------------|\n";
		String strQu1 =   "|                                               |\n| Voulez-vous convertir une autre temp�rature ? |\n|                     O / N                     |\n|-----------------------------------------------|";
		String strQu2 =   "|-----------------------------------------------|\n| Voulez-vous convertir une autre temp�rature ? |\n|                     O / N                     |\n|-----------------------------------------------|";
		String strEnd =   "|-----------------------------------------------|\n|                 Au Revoir  :(                 |\n|-----------------------------------------------|";
		String strT, strR, strSp;
		int l;
		//Affichage du titre
		System.out.print(strIntro);
		//Boucle principale
		do{
			//Boucle de s�lection du mode (pour permettre seulement les modes 1 et 2)
			do{
				System.out.println(strMode);		//Affichage du menu de selection du mode
				mode = sc.nextLine().charAt(0);		//Attribution de l'entr�e clavier � la variable
			}while(mode != '1' && mode != '2');
			//Affichage de l'invitation � entrer une temp�rature	
			System.out.println(strTemp);
			// Tant que l'entr�e clavier n'est pas un nombre
			while(!sc.hasNextDouble()){	
				System.out.println(strTemp); 		//Affichage de l'invitation � entrer une temp�rature	
				sc.nextLine();						//On passe � la prochaine entr�e
			}
			//On assigne la valeur entr�e � temp et on passe la ligne du Scanner
			temp = sc.nextDouble();
			sc.nextLine();
			//On calcule la temp�rature convertie
			if(mode == '1')
				resultat = temp*1.8 + 32; 			//Si le mode 1 est s�lectionn� on calcule des �F
			else
				resultat = (temp-32)*5 / 9;			//Si le mode 2 est s�lectionn� on calcule des �C
			//On arrondie les r�sultats aux 1/10 �me pr�s
			resultat = (double)Math.round(resultat * 10)/10;
			temp = (double)Math.round(temp * 10)/10;
			//On calclcule le nombre d'espace � rajouter pour completer le rectangle
			strT = Double.toString(temp);
			strR = Double.toString(resultat);
			l = 23 -(strT.length()+strR.length());
			//On cr�er une chaine avec le bon nombre d'espace
			strSp = "";
			for(int i = 0; i < l; i++)
					strSp = strSp + " ";
			//En fonction du mode, on affiche le bon message de r�sultat	
			if(mode =='1') 
				System.out.print(strBarre+"| " +temp+ " �C correspond � : " +resultat+ " �F." +strSp+ "|\n");
			else
				System.out.print(strBarre+"| " +temp+ " �F correspond � : " +resultat+ " �C." +strSp+ "|\n");
			//On demande si l'utilisateur veut r�essayer
			System.out.println(strQu1);
			//On r�cup�re sa r�ponse
			reponse = sc.nextLine().charAt(0);
			//Tant que sa r�ponse n'est pas O ou N on lui redemande
			while(reponse != 'O' && reponse != 'N'){
				System.out.println(strQu2);
				reponse = sc.nextLine().charAt(0);
		    }
		//Tant que la r�ponse est O on reprend du d�but	
		}while(reponse == 'O');
		//On affiche le message d'au revoir
		System.out.println(strEnd);
		//On ferme notre Scanner
		sc.close();
	}
}

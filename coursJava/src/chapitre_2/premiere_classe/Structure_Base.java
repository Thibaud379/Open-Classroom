package chapitre_2.premiere_classe;

public class Structure_Base {

	/* Une classe est un mod�le qui peut etre utilis�e pour cr�er une
	 * "instance" de cette classe
	 * 
	 * La classe qui contient la m�thode "main()" est la classe principale
	 * d'un projet
	 */
	
	public static void main(String[] args){
		//Donn�es, variables, traitements...
		//Utilisation des variables de classe
		System.out.println("Le nombre d'instances de la classe ville est :"+Ville.nbreInstances+ "\n");
		
		Ville v = new Ville();									//Il faut bien penser � respecter l'ordre des param�tres
		Ville v1 = new Ville("Marseille", "France", 123456); 	// Ville v3 = new Vile(1, "Poil", "France");
		Ville v2 = new Ville("Rio", "Br�sil", 321654);			//->Erreur de compilation
		
		System.out.println("\nLe nombre d'instances de la classe ville est :"+Ville.nbreInstances);
		
		System.out.println("\nUtilisation des Getters et Setters");
		System.out.println("v = "+v.getNom()+" ville de "+v.getHabitants()+ " habitants se situant en "+v.getPays());
		System.out.println("v1 = "+v1.getNom()+" ville de "+v1.getHabitants()+ " habitants se situant en "+v1.getPays());
		System.out.println("v2 = "+v2.getNom()+" ville de "+v2.getHabitants()+ " habitants se situant en "+v2.getPays());    
		 //Nous allons maintenant interchanger leurs noms  par le biais de leurs mutateurs.
		v1.setNom("Hong Kong");
		v2.setNom("Djibouti");
		System.out.println("\nChangement d'une variable d'instance");      
		System.out.println("v1 = "+v1.getNom()+" ville de "+v1.getHabitants()+ " habitants se situant en "+v1.getPays());
		System.out.println("v2 = "+v2.getNom()+" ville de "+v2.getHabitants()+ " habitants se situant en "+v2.getPays());
		//Utilisation des diff�rentes m�thodes impl�ment�s
		System.out.println("\nUtilisation des m�thodes impl�ment�es dans la classe Ville");
		System.out.println(v1.desc());
		System.out.println(v.desc());
		System.out.println(v2.desc()+"\n\n");
		System.out.println(v1.comparer(v2));
	}// Fin de la m�thode main()
}//Fin de la classe
